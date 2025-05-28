/**
 * File: VariableDemo.java
 * Description: Explains variable declaration, initialization, and types in
 * Java.
 */

// ✅ Java Variables — Clear & Concise Breakdown

public class VariableDemo { // Class to hold our main method

    // 🟢 b. Instance Variables (Non-Static Fields):
    // - Declared inside a class but outside any method, constructor, or block.
    // - They belong to an object (instance) of the class.
    // - Each object has its own copy of instance variables.
    // - Default values are assigned if not explicitly initialized (e.g., 0 for int,
    // null for objects, false for boolean).
    String instanceModel; // Instance variable
    int instanceYear; // Instance variable

    // 🟢 c. Static Variables (Class Variables):
    // - Declared inside a class, outside any method, constructor, or block, using
    // the `static` keyword.
    // - They belong to the class itself, not to any specific object.
    // - There's only one copy of a static variable for the entire class, shared by
    // all objects.
    // - Default values are assigned if not explicitly initialized.
    static int staticCount = 0; // Static variable

    public VariableDemo(String model, int year) {
        this.instanceModel = model;
        this.instanceYear = year;
        staticCount++; // Increments the same 'staticCount' for all instances
    }

    public static void main(String[] args) { // Main method - entry point of the program

        // --------------------------------------------------
        // 🔹 1. DECLARATION AND INITIALIZATION
        // --------------------------------------------------

        // 🟢 Declaration: Specifying the data type and name of the variable.
        int myNumber; // Declares an integer variable named myNumber

        // 🟢 Initialization: Assigning a value to a declared variable.
        myNumber = 100; // Initializes myNumber with the value 100

        // 🟢 Declaration and Initialization in one line:
        String greeting = "Hello Java!"; // Declares a String variable and initializes it

        // 🟢 Constants (final keyword): Once assigned, their value cannot be changed.
        final double PI = 3.14159;
        // PI = 3.14; // This would cause a compile-time error

        System.out.println("myNumber: " + myNumber);
        System.out.println("greeting: " + greeting);
        System.out.println("PI (constant): " + PI);

        // --------------------------------------------------
        // 🔸 2. VARIABLE NAMING RULES (Conventions for Readability)
        // --------------------------------------------------

        // 🟢 Must start with a letter, $ or _. Cannot start with a number.
        // int 1invalid; // Invalid - uncomment to see compile error
        int $price = 50;
        int _count = 10;
        System.out.println("$price: " + $price + ", _count: " + _count);

        // 🟢 Can contain letters, numbers, $ or _.
        String user_name = "Alice";
        String departmentID = "DEV123";
        System.out.println("user_name: " + user_name + ", departmentID: " + departmentID);

        // 🟢 Case-sensitive: `myVar` is different from `MyVar`.
        int myVar = 10;
        int MyVar = 20;
        System.out.println("myVar: " + myVar + ", MyVar: " + MyVar);

        // 🟢 No reserved keywords (e.g., `public`, `class`, `int`).
        // int public = 5; // Invalid - uncomment to see compile error

        // 🟢 Convention (CamelCase for variables, SCREAMING_SNAKE_CASE for constants):
        // Recommended: `firstName`, `totalAmount`
        // Recommended for constants: `MAX_SIZE`, `DEFAULT_TIMEOUT`

        // --------------------------------------------------
        // ⚠️ 3. TYPES OF VARIABLES (Scope)
        // --------------------------------------------------

        // There are three main types of variables in Java based on their scope (where
        // they can be accessed).

        // 🟢 a. Local Variables:
        // - Declared inside a method, constructor, or block.
        // - They are created when the block is entered and destroyed when the block is
        // exited.
        // - MUST be initialized before use.
        int localVariable = 50; // This is a local variable
        System.out.println("\nLocal variable: " + localVariable);

        if (localVariable > 20) {
            String message = "Value is greater than 20"; // 'message' is local to this if-block
            System.out.println(message);
        }
        // System.out.println(message); // ERROR: Cannot find symbol - 'message' is out
        // of scope

        // Usage of Instance Variables:
        System.out.println("\n--- Instance Variables ---");
        VariableDemo car1 = new VariableDemo("Toyota", 2020);
        VariableDemo car2 = new VariableDemo("Honda", 2022);
        System.out.println("Car1 model: " + car1.instanceModel + ", year: " + car1.instanceYear);
        System.out.println("Car2 model: " + car2.instanceModel + ", year: " + car2.instanceYear);

        // Usage of Static Variables:
        System.out.println("\n--- Static Variables ---");
        System.out.println("Static count after car1: " + car1.staticCount); // Can access via object, but not
                                                                            // recommended
        System.out.println("Static count after car2: " + car2.staticCount); // Accessing via car2 yields same count
        System.out.println("Static count via Class: " + VariableDemo.staticCount); // Preferred way to access static

        // Demonstrate that static variables are shared
        VariableDemo.staticCount = 100; // Modify static variable directly via class
        System.out.println("Static count after direct modification: " + car1.staticCount);
        System.out.println("Static count via Class after modification: " + VariableDemo.staticCount);

        // --------------------------------------------------
        // 🧠 Summary of Variables
        // --------------------------------------------------
        /*
         * ✔ Declaration: `dataType variableName;`
         * ✔ Initialization: `variableName = value;` or `dataType variableName = value;`
         * ✔ `final` keyword for constants.
         * ✔ Naming conventions: `camelCase` for variables, `SCREAMING_SNAKE_CASE` for
         * constants.
         * ✔ Variable Types (Scope):
         * - **Local:** Inside methods/blocks, must be initialized, scope limited to
         * block.
         * - **Instance:** Inside class, outside methods, belong to object, get default
         * values.
         * - **Static:** Inside class, using `static` keyword, belong to class, shared
         * by all objects, get default values.
         */
    }
}