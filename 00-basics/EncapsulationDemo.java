/**
 * File: EncapsulationDemo.java
 *
 * Description:
 * Complete revision notes for Encapsulation in Java.
 *
 * Topics Covered:
 * --------------------------------------------------
 * 1. What is Encapsulation?
 * 2. Private Variables
 * 3. Getter Methods
 * 4. Setter Methods
 * 5. Data Hiding
 * 6. Validation using Setters
 * 7. Read-Only Class
 * 8. Write-Only Class
 * 9. Advantages of Encapsulation
 * 10. Best Practices
 *
 * Important:
 * --------------------------------------------------
 * - Encapsulation = Data Hiding
 * - Variables are usually private
 * - Access data using methods
 * - Improves security and control
 */

public class EncapsulationDemo {

    // ======================================================
    // MAIN METHOD
    // ======================================================

    public static void main(String[] args) {

        // ==================================================
        // 1. CREATING OBJECT
        // ==================================================

        System.out.println(
                "=== 1. Creating Object ===");

        BankAccount account =
                new BankAccount();

        System.out.println(
                "Object Created Successfully");

        System.out.println();

        // ==================================================
        // 2. SETTING VALUES USING SETTERS
        // ==================================================

        System.out.println(
                "=== 2. Using Setter Methods ===");

        /*
         * Cannot access private variables directly.
         *
         * account.balance = 1000;
         * ❌ ERROR
         */

        account.setAccountHolderName("Unais");
        account.setBalance(5000);
        account.setPin(1234);

        System.out.println(
                "Values Set Successfully");

        System.out.println();

        // ==================================================
        // 3. GETTING VALUES USING GETTERS
        // ==================================================

        System.out.println(
                "=== 3. Using Getter Methods ===");

        System.out.println(
                "Account Holder: "
                        + account.getAccountHolderName());

        System.out.println(
                "Balance: "
                        + account.getBalance());

        System.out.println();

        // ==================================================
        // 4. DATA HIDING
        // ==================================================

        System.out.println(
                "=== 4. Data Hiding ===");

        /*
         * Private variables cannot be accessed
         * directly outside class.
         */

        // account.balance = 10000;
        // ❌ NOT ALLOWED

        System.out.println(
                "Private data is protected");

        System.out.println();

        // ==================================================
        // 5. VALIDATION USING SETTERS
        // ==================================================

        System.out.println(
                "=== 5. Validation Using Setters ===");

        /*
         * Setters allow validation before updating data.
         */

        account.setBalance(-1000);

        System.out.println(
                "Balance After Invalid Update: "
                        + account.getBalance());

        account.setPin(12);

        System.out.println();

        // ==================================================
        // 6. READ-ONLY EXAMPLE
        // ==================================================

        System.out.println(
                "=== 6. Read-Only Example ===");

        ReadOnlyStudent student =
                new ReadOnlyStudent(
                        101,
                        "Aman");

        /*
         * No setter methods available.
         * Data can only be read.
         */

        System.out.println(
                "Student ID: "
                        + student.getId());

        System.out.println(
                "Student Name: "
                        + student.getName());

        System.out.println();

        // ==================================================
        // 7. WRITE-ONLY EXAMPLE
        // ==================================================

        System.out.println(
                "=== 7. Write-Only Example ===");

        WriteOnlyPassword password =
                new WriteOnlyPassword();

        password.setPassword("secret123");

        /*
         * No getter method available.
         * Password cannot be viewed directly.
         */

        System.out.println(
                "Password Set Successfully");

        System.out.println();

        // ==================================================
        // 8. ADVANTAGES OF ENCAPSULATION
        // ==================================================

        System.out.println(
                "=== 8. Advantages ===");

        /*
         * Advantages:
         * --------------------------------------------------
         * 1. Better security
         * 2. Data hiding
         * 3. Controlled access
         * 4. Easier maintenance
         * 5. Better flexibility
         */

        System.out.println(
                "Encapsulation improves security");

        System.out.println(
                "Encapsulation protects data");

        System.out.println();

        // ==================================================
        // 9. BEST PRACTICES
        // ==================================================

        System.out.println(
                "=== 9. Best Practices ===");

        /*
         * Best Practices:
         * --------------------------------------------------
         * 1. Keep variables private
         * 2. Use public getters/setters
         * 3. Add validation in setters
         * 4. Avoid unnecessary setters
         * 5. Follow naming conventions
         */

        System.out.println(
                "Use encapsulation in all models");

        System.out.println();

        // ==================================================
        // SUMMARY
        // ==================================================

        /*
         * ENCAPSULATION:
         * --------------------------------------------------
         * Wrapping data and methods together
         * into a single unit.
         *
         * DATA HIDING:
         * --------------------------------------------------
         * Restricting direct access to variables.
         *
         * GETTER:
         * --------------------------------------------------
         * Method used to read data.
         *
         * SETTER:
         * --------------------------------------------------
         * Method used to update data.
         *
         * PRIVATE VARIABLES:
         * --------------------------------------------------
         * Accessible only inside same class.
         */
    }
}

// ==========================================================
// BANK ACCOUNT CLASS
// ==========================================================

class BankAccount {

    // ======================================================
    // PRIVATE VARIABLES
    // ======================================================

    /*
     * Private variables are hidden
     * from outside classes.
     */

    private String accountHolderName;
    private double balance;
    private int pin;

    // ======================================================
    // GETTERS
    // ======================================================

    public String getAccountHolderName() {

        return accountHolderName;
    }

    public double getBalance() {

        return balance;
    }

    // ======================================================
    // SETTERS
    // ======================================================

    public void setAccountHolderName(
            String accountHolderName) {

        this.accountHolderName =
                accountHolderName;
    }

    public void setBalance(double balance) {

        /*
         * Validation example.
         */

        if (balance >= 0) {

            this.balance = balance;

        } else {

            System.out.println(
                    "Invalid Balance");
        }
    }

    public void setPin(int pin) {

        /*
         * PIN must be 4 digits.
         */

        if (pin >= 1000 && pin <= 9999) {

            this.pin = pin;

        } else {

            System.out.println(
                    "Invalid PIN");
        }
    }
}

// ==========================================================
// READ-ONLY CLASS
// ==========================================================

/*
 * Only getter methods available.
 */

class ReadOnlyStudent {

    private int id;
    private String name;

    public ReadOnlyStudent(
            int id,
            String name) {

        this.id = id;
        this.name = name;
    }

    public int getId() {

        return id;
    }

    public String getName() {

        return name;
    }
}

// ==========================================================
// WRITE-ONLY CLASS
// ==========================================================

/*
 * Only setter method available.
 */

class WriteOnlyPassword {

    private String password;

    public void setPassword(String password) {

        this.password = password;
    }
}