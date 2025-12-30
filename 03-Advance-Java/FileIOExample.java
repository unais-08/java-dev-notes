
/**
 * FileIOExample.java
 * 
 * Demonstrates basic File I/O operations in Java:
 *  - Representing a file
 *  - Reading text from a file
 *  - Writing text to a file
 *  - Appending text to an existing file
 */

import java.io.*;

public class FileIOExample {
    public static void main(String[] args) {

        // 1️⃣ Representing a File
        File file = new File("demo.txt");
        System.out.println("Does the file exist? " + file.exists());
        System.out.println("Absolute Path: " + file.getAbsolutePath());
        System.out.println("----------------------------------");

        // 2️⃣ Reading from a File
        try (BufferedReader br = new BufferedReader(new FileReader("demo.txt"))) {
            System.out.println("📖 Reading from demo.txt:");
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("----------------------------------");
        } catch (IOException e) {
            System.out.println("⚠️ Error reading file: " + e.getMessage());
        }

        // 3️⃣ Writing to a New File (Overwrites if file exists)
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
            bw.write("Hello, Java File I/O!\n");
            bw.write("This is written using BufferedWriter.");
            System.out.println("✅ Data written successfully to output.txt");
            System.out.println("----------------------------------");
        } catch (IOException e) {
            System.out.println("⚠️ Error writing file: " + e.getMessage());
        }

        // 4️⃣ Appending to an Existing File
        try (FileWriter fw = new FileWriter("log.txt", true)) {
            fw.write("New log entry: " + System.currentTimeMillis() + "\n");
            System.out.println("📝 Log file updated (log.txt)");
            System.out.println("----------------------------------");
        } catch (IOException e) {
            System.out.println("⚠️ Error appending to file: " + e.getMessage());
        }

        System.out.println("🎉 File I/O operations completed successfully!");
    }
}
