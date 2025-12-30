
import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Represents database connection and operations for PostgreSQL.
 */
class PostgresDatabase implements AutoCloseable {

    private final String url;
    private final String username;
    private final String password;
    private Connection connection;

    public PostgresDatabase(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    /** Establishes a connection to the PostgreSQL database. */
    public void connect() {
        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("[INFO] Connected to PostgreSQL database.");
        } catch (SQLException e) {
            System.err.println("[ERROR] Failed to connect to database: " + e.getMessage());
        }
    }

    /** Closes the database connection. */
    @Override
    public void close() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("[INFO] Disconnected from PostgreSQL database.");
            }
        } catch (SQLException e) {
            System.err.println("[ERROR] Failed to close database connection: " + e.getMessage());
        }
    }

    /** Executes a SELECT query and returns the result set. */
    public ResultSet executeQuery(String query) throws SQLException {
        Statement stmt = connection.createStatement();
        return stmt.executeQuery(query);
    }

    /** Executes an INSERT/UPDATE/DELETE query and returns affected rows. */
    public int executeUpdate(String query) throws SQLException {
        try (Statement stmt = connection.createStatement()) {
            return stmt.executeUpdate(query);
        }
    }

    /** Returns the active connection (for prepared statements). */
    public Connection getConnection() {
        return connection;
    }
}

/**
 * Handles CRUD operations for User data in PostgreSQL.
 */
class UserRepository {

    private final Connection connection;

    public UserRepository(Connection connection) {
        this.connection = connection;
    }

    /** Inserts a new user record into the database. */
    public void insertUser(String name, String email) {
        String sql = "INSERT INTO users (name, email) VALUES (?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, name);
            stmt.setString(2, email);
            int rows = stmt.executeUpdate();
            System.out.printf("[INFO] Inserted %d user(s) into database.%n", rows);
        } catch (SQLException e) {
            System.err.println("[ERROR] Failed to insert user: " + e.getMessage());
        }
    }

    /** Updates an existing user record by ID. */
    public void updateUser(int id, String name, String email) {
        String sql = "UPDATE users SET name = ?, email = ? WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.setInt(3, id);
            int rows = stmt.executeUpdate();
            System.out.printf("[INFO] Updated %d user(s).%n", rows);
        } catch (SQLException e) {
            System.err.println("[ERROR] Failed to update user: " + e.getMessage());
        }
    }

    /** Deletes a user record by ID. */
    public void deleteUser(int id) {
        String sql = "DELETE FROM users WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            int rows = stmt.executeUpdate();
            System.out.printf("[INFO] Deleted %d user(s).%n", rows);
        } catch (SQLException e) {
            System.err.println("[ERROR] Failed to delete user: " + e.getMessage());
        }
    }

    /** Retrieves all users from the database. */
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        String sql = "SELECT id, name, email FROM users ORDER BY id";
        try (Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                User user = new User(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"));
                users.add(user);
            }

        } catch (SQLException e) {
            System.err.println("[ERROR] Failed to fetch users: " + e.getMessage());
        }
        return users;
    }
}

/**
 * Represents a User entity (POJO).
 */
class User {
    private final int id;
    private final String name;
    private final String email;

    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("%d | %s | %s", id, name, email);
    }
}

/**
 * Main class demonstrating CRUD operations with PostgreSQL.
 */
public class App {
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/demo_db";
    private static final String DB_USER = "demo_user";
    private static final String DB_PASS = "admin";

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
                PostgresDatabase db = new PostgresDatabase(DB_URL, DB_USER, DB_PASS)) {

            db.connect();
            UserRepository userRepo = new UserRepository(db.getConnection());
            boolean running = true;
            while (running) {
                System.out.println("\nMenu:");
                System.out.println("1. Insert User");
                System.out.println("2. Update User");
                System.out.println("3. Delete User");
                System.out.println("4. View All Users");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");

                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        System.out.print("Enter user name: ");
                        String name = scanner.nextLine();

                        System.out.print("Enter user email: ");
                        String email = scanner.nextLine();

                        userRepo.insertUser(name, email);
                        break;
                    case 2:
                        System.out.print("Enter user ID to update: ");
                        int updateId = Integer.parseInt(scanner.nextLine());

                        System.out.print("Enter new user name: ");
                        String newName = scanner.nextLine();

                        System.out.print("Enter new user email: ");
                        String newEmail = scanner.nextLine();

                        userRepo.updateUser(updateId, newName, newEmail);
                        break;
                    case 3:
                        System.out.print("Enter user ID to delete: ");
                        int deleteId = Integer.parseInt(scanner.nextLine());
                        userRepo.deleteUser(deleteId);
                        break;
                    case 4:
                        System.out.println("\nCurrent users in database:");
                        userRepo.getAllUsers().forEach(System.out::println);
                        break;
                    case 5:
                        System.out.println("Exiting application.");
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");

                }
            }
            System.out.println();
            System.out.println("\nCurrent users in database:");
            userRepo.getAllUsers().forEach(System.out::println);

        } catch (Exception e) {
            System.err.println("[FATAL] Application error: " + e.getMessage());
        }
    }
}
