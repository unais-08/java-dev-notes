/**
 * File: DataTypes.java
 * Description: Explains Java primitive and non-primitive data types with
 * examples.
 * To Compile: javac DataTypeDemo.java
 * To Run: java DataTypeDemo
 */

// ✅ Java Data Types — Clear & Concise Breakdown

public class DataTypes { // Class to hold our main method

    public static void main(String[] args) { // Main method - entry point of the program

        // --------------------------------------------------
        // 🔹 1. PRIMITIVE TYPES
        // --------------------------------------------------

        // Java's primitive types are fundamental building blocks. They store simple
        // values
        // directly in memory and are not objects.

        // 🟢 byte
        // Range: -128 to 127. Default: 0. Stores 8-bit signed two's complement integer.
        byte age = 30;
        byte temperature = -5;
        System.out.println("byte example: " + age); // Output: 30

        // 🟢 short
        // Range: -32,768 to 32,767. Default: 0. Stores 16-bit signed two's complement
        // integer.
        short year = 2025;
        short distance = -15000;
        System.out.println("short example: " + year); // Output: 2025

        // 🟢 int
        // Range: -2^31 to 2^31 - 1 (approx. +/- 2 billion). Default: 0. Stores 32-bit
        // signed two's complement integer.
        int population = 1_000_000; // Underscores for readability (Java 7+)
        int studentId = 123456789;
        System.out.println("int example: " + population); // Output: 1000000

        // 🟢 long
        // Range: -2^63 to 2^63 - 1 (very large numbers). Default: 0L. Stores 64-bit
        // signed two's complement integer.
        long worldPopulation = 8_000_000_000L; // 'L' suffix denotes a long literal
        // long galacticDistance = 9876543210987654321L;
        System.out.println("long example: " + worldPopulation); // Output: 8000000000

        // 🟢 float
        // Represents single-precision 32-bit floating-point numbers. Default: 0.0f.
        float price = 19.99f; // 'f' suffix denotes a float literal
        float pi = 3.14159f;
        System.out.println("float example: " + price); // Output: 19.99

        // 🟢 double
        // Represents double-precision 64-bit floating-point numbers (default for
        // decimals). Default: 0.0d.
        double preciseValue = 12345.678901234;
        double gravity = 9.80665; // 'd' suffix is optional but good practice (9.80665d)
        System.out.println("double example: " + preciseValue); // Output: 12345.678901234

        // 🟢 boolean
        // Represents one of two values: true or false. Default: false.
        boolean isActive = true;
        boolean hasPermission = false;
        System.out.println("boolean example: " + isActive); // Output: true

        // 🟢 char
        // Represents a single 16-bit Unicode character. Default: '\u0000' (null
        // character).
        char grade = 'A';
        char initial = 'J';
        char copyrightSymbol = '\u00A9'; // Unicode representation
        System.out.println("char example: " + grade); // Output: A

        // --------------------------------------------------
        // 🔸 2. NON-PRIMITIVE (REFERENCE) TYPES
        // --------------------------------------------------

        // Non-primitive types (also called reference types) do not store the actual
        // value
        // directly but store a reference (memory address) to where the object is stored
        // in the heap memory.

        // 🟠 String
        // A sequence of characters. Strings in Java are immutable (cannot be changed
        // once created).
        String userName = "Unais Shaikh";
        String welcomeMessage = "Hello, " + userName + "!";
        System.out.println("String example: " + welcomeMessage); // Output: Hello, Unais Shaikh!

        // 🟠 Arrays
        // Used to store multiple values of the same type in a single variable.
        // Arrays are objects in Java.
        int[] numbers = { 1, 2, 3, 4, 5 };
        String[] fruits = new String[3]; // Declares an array of 3 Strings
        fruits[0] = "Apple";
        fruits[1] = "Banana";
        fruits[2] = "Cherry";
        System.out.println("Array example: " + numbers[0]); // Output: 1
        System.out.println("Array example: " + fruits[1]); // Output: Banana

        // 🟠 Classes (Custom Objects)
        // User-defined types that encapsulate data and behavior.
        // (Detailed explanation in OOP section)
        Person p1 = new Person("Alice", 30);
        System.out.println("Custom Object example: " + p1.name); // Output: Alice

        // 🟠 Interfaces
        // A blueprint of a class. It has static constants and abstract methods.
        // (Detailed explanation in OOP section)

        // --------------------------------------------------
        // 🧠 Summary of Data Types
        // --------------------------------------------------
        /*
         * ✔ Primitive Types (value directly stored):
         * - byte, short, int, long (for whole numbers)
         * - float, double (for floating-point numbers)
         * - boolean (for true/false)
         * - char (for single characters)
         * 
         * ✔ Non-Primitive Types (reference to an object):
         * - String (most common)
         * - Arrays
         * - Classes (e.g., custom objects like Person)
         * - Interfaces
         * - And many more from Java API (e.g., ArrayList, HashMap)
         * 
         * Key Difference:
         * - Primitive variables store the actual value.
         * - Non-primitive variables store the memory address (reference) of the object.
         */
    }
}

// Nested class for demonstration purposes within DataTypeDemo.java
// In a real project, this would typically be in its own file: Person.java
class Person {
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}