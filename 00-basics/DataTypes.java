/**
 * File: DataTypes.java
 * Description:
 * Explains Java primitive and non-primitive data types with examples.
 */


public class DataTypes {


    public static void main(String[] args) {

        // ==================================================
        // 1. PRIMITIVE DATA TYPES
        // ==================================================

        /*
         * Primitive data types:
         * - Built into Java
         * - Store actual values directly in memory
         * - Faster and memory efficient
         * - Not objects
         */

        // --------------------------------------------------
        // byte
        // --------------------------------------------------
        /*
         * Size    : 1 byte (8 bits)
         * Range   : -128 to 127
         * Default : 0
         *
         * Used for small integer values.
         */

        byte age = 30;
        byte temperature = -5;

        System.out.println("byte example: " + age);

        // --------------------------------------------------
        // short
        // --------------------------------------------------
        /*
         * Size    : 2 bytes (16 bits)
         * Range   : -32,768 to 32,767
         * Default : 0
         *
         * Used when int is not required.
         */

        short year = 2025;
        short distance = -15000;

        System.out.println("short example: " + year);

        // --------------------------------------------------
        // int
        // --------------------------------------------------
        /*
         * Size    : 4 bytes (32 bits)
         * Range   : Approx. ±2 billion
         * Default : 0
         *
         * Most commonly used integer type.
         */

        int population = 1_000_000; // Underscore improves readability
        int studentId = 123456789;

        System.out.println("int example: " + population);

        // --------------------------------------------------
        // long
        // --------------------------------------------------
        /*
         * Size    : 8 bytes (64 bits)
         * Default : 0L
         *
         * Used for very large integer values.
         * Suffix 'L' is required.
         */

        long worldPopulation = 8_000_000_000L;

        System.out.println("long example: " + worldPopulation);

        // --------------------------------------------------
        // float
        // --------------------------------------------------
        /*
         * Size    : 4 bytes
         * Default : 0.0f
         *
         * Used for decimal numbers.
         * Less precise than double.
         * Suffix 'f' is required.
         */

        float price = 19.99f;
        float pi = 3.14159f;

        System.out.println("float example: " + price);

        // --------------------------------------------------
        // double
        // --------------------------------------------------
        /*
         * Size    : 8 bytes
         * Default : 0.0d
         *
         * More precise than float.
         * Default type for decimal values.
         */

        double preciseValue = 12345.678901234;
        double gravity = 9.80665;

        System.out.println("double example: " + preciseValue);

        // --------------------------------------------------
        // boolean
        // --------------------------------------------------
        /*
         * Values  : true or false
         * Default : false
         *
         * Used for conditions and decision making.
         */

        boolean isActive = true;
        boolean hasPermission = false;

        System.out.println("boolean example: " + isActive);

        // --------------------------------------------------
        // char
        // --------------------------------------------------
        /*
         * Size    : 2 bytes
         * Default : '\u0000'
         *
         * Stores a single Unicode character.
         */

        char grade = 'A';
        char initial = 'J';
        char copyrightSymbol = '\u00A9';

        System.out.println("char example: " + grade);

        // ==================================================
        // 2. NON-PRIMITIVE (REFERENCE) TYPES
        // ==================================================

        /*
         * Non-primitive types:
         * - Store references (memory addresses)
         * - Created using classes
         * - Can call methods
         * - Usually larger and more powerful
         */

        // --------------------------------------------------
        // String
        // --------------------------------------------------
        /*
         * String:
         * - Sequence of characters
         * - Immutable in Java
         * - Most commonly used reference type
         */

        String userName = "Unais Shaikh";
        String welcomeMessage = "Hello, " + userName + "!";

        System.out.println("String example: " + welcomeMessage);

        // --------------------------------------------------
        // Arrays
        // --------------------------------------------------
        /*
         * Arrays:
         * - Store multiple values of the same type
         * - Fixed size
         * - Arrays are objects in Java
         */

        int[] numbers = {1, 2, 3, 4, 5};

        String[] fruits = new String[3];

        fruits[0] = "Apple";
        fruits[1] = "Banana";
        fruits[2] = "Cherry";

        System.out.println("Array example: " + numbers[0]);
        System.out.println("Array example: " + fruits[1]);

        // --------------------------------------------------
        // Classes / Objects
        // --------------------------------------------------
        /*
         * Classes:
         * - User-defined data types
         * - Used to create objects
         * - Combine data + behavior
         */

        Person p1 = new Person("Alice", 30);

        System.out.println("Custom Object example: " + p1.name);

        // --------------------------------------------------
        // Interfaces
        // --------------------------------------------------
        /*
         * Interfaces:
         * - Blueprint of a class
         * - Contains abstract methods
         * - Used for abstraction
         *
         * (Detailed later in OOP concepts)
         */

        // ==================================================
        // SUMMARY
        // ==================================================

        /*
         * Primitive Types:
         * --------------------------------------------------
         * byte      -> Small integers
         * short     -> Medium integers
         * int       -> Standard integers
         * long      -> Large integers
         * float     -> Decimal numbers (less precision)
         * double    -> Decimal numbers (more precision)
         * boolean   -> true / false
         * char      -> Single character
         *
         * Non-Primitive Types:
         * --------------------------------------------------
         * String
         * Arrays
         * Classes
         * Interfaces
         * Collections (ArrayList, HashMap, etc.)
         *
         * Key Difference:
         * --------------------------------------------------
         * Primitive Types:
         *      Store actual values directly.
         *
         * Non-Primitive Types:
         *      Store reference (memory address) of objects.
         */
    }
}

// ==========================================================
// PERSON CLASS
// ==========================================================

/*
 * Nested class used only for demonstration.
 *
 * In real projects:
 *      Person.java should be a separate file.
 */

class Person {

    String name;
    int age;

    // Constructor
    public Person(String name, int age) {

        this.name = name;
        this.age = age;
    }
}