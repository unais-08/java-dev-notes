/**
 * File: VariableDemo.java
 * Description:
 * Demonstrates:
 * 1. Variable declaration and initialization
 * 2. Naming rules and conventions
 * 3. Types of variables in Java:
 *    - Local Variables
 *    - Instance Variables
 *    - Static Variables
 */

public class VariableDemo {

    // ==================================================
    // INSTANCE VARIABLES (Non-static fields)
    // ==================================================
    /*
     * - Declared inside a class but outside methods.
     * - Belong to an object (instance) of the class.
     * - Each object gets its own separate copy.
     * - Receive default values if not initialized.
     */
    String model;
    int year;

    // ==================================================
    // STATIC VARIABLE (Class variable)
    // ==================================================
    /*
     * - Declared using the 'static' keyword.
     * - Belongs to the class, not individual objects.
     * - Shared among all objects of the class.
     * - Only one copy exists in memory.
     */
    static int carCount = 0;

    // ==================================================
    // CONSTRUCTOR
    // ==================================================
    public VariableDemo(String model, int year) {
        this.model = model;
        this.year = year;

        // Shared counter increases whenever a new object is created
        carCount++;
    }

    // ==================================================
    // MAIN METHOD
    // ==================================================
    public static void main(String[] args) {

        // ==================================================
        // 1. VARIABLE DECLARATION & INITIALIZATION
        // ==================================================

        // Declaration -> Creating a variable
        int number;

        // Initialization -> Assigning a value
        number = 100;

        // Declaration + Initialization together
        String greeting = "Hello Java!";

        // Constant using 'final'
        final double PI = 3.14159;

        System.out.println("number = " + number);
        System.out.println("greeting = " + greeting);
        System.out.println("PI = " + PI);

        // ==================================================
        // 2. VARIABLE NAMING RULES & CONVENTIONS
        // ==================================================

        /*
         * Rules:
         * 1. Can start with:
         *    - Letter
         *    - $
         *    - _
         *
         * 2. Cannot start with a number
         *
         * 3. Java is case-sensitive
         *
         * 4. Reserved keywords cannot be used
         */

        int $price = 50;
        int _count = 10;

        System.out.println("$price = " + $price);
        System.out.println("_count = " + _count);

        // Valid variable names
        String userName = "Alice";
        String departmentId = "DEV123";

        System.out.println("userName = " + userName);
        System.out.println("departmentId = " + departmentId);

        // Case sensitivity
        int myVar = 10;
        int MyVar = 20;

        System.out.println("myVar = " + myVar);
        System.out.println("MyVar = " + MyVar);

        /*
         * Naming Conventions:
         *
         * Variables  -> camelCase
         * Constants  -> UPPER_CASE
         * Classes    -> PascalCase
         */

        final int MAX_SIZE = 100;

        // ==================================================
        // 3. TYPES OF VARIABLES
        // ==================================================

        // --------------------------------------------------
        // A. LOCAL VARIABLES
        // --------------------------------------------------
        /*
         * - Declared inside methods/blocks.
         * - Exist only within that block.
         * - Must be initialized before use.
         */

        int localVariable = 50;

        System.out.println("\nLocal Variable = " + localVariable);

        if (localVariable > 20) {

            // Accessible only inside this block
            String message = "Value is greater than 20";

            System.out.println(message);
        }

        // ERROR -> message is out of scope
        // System.out.println(message);

        // --------------------------------------------------
        // B. INSTANCE VARIABLES
        // --------------------------------------------------

        System.out.println("\n=== Instance Variables ===");

        VariableDemo car1 = new VariableDemo("Toyota", 2020);
        VariableDemo car2 = new VariableDemo("Honda", 2022);

        System.out.println(
                "Car1 -> Model: " + car1.model +
                ", Year: " + car1.year);

        System.out.println(
                "Car2 -> Model: " + car2.model +
                ", Year: " + car2.year);

        // --------------------------------------------------
        // C. STATIC VARIABLES
        // --------------------------------------------------

        System.out.println("\n=== Static Variables ===");

        // Static variable shared by all objects
        System.out.println("carCount using car1 = " + car1.carCount);
        System.out.println("carCount using car2 = " + car2.carCount);

        // Preferred way to access static variables
        System.out.println(
                "carCount using class = " +
                VariableDemo.carCount);

        // Changing static variable
        VariableDemo.carCount = 100;

        System.out.println(
                "Updated carCount = " +
                VariableDemo.carCount);

        // ==================================================
        // SUMMARY
        // ==================================================
        /*
         * Declaration:
         *      dataType variableName;
         *
         * Initialization:
         *      variableName = value;
         *
         * Constant:
         *      final dataType CONSTANT_NAME = value;
         *
         * Variable Types:
         *
         * 1. Local Variable
         *    - Inside methods/blocks
         *    - Scope limited to that block
         *    - Must be initialized
         *
         * 2. Instance Variable
         *    - Belongs to object
         *    - Each object has its own copy
         *
         * 3. Static Variable
         *    - Belongs to class
         *    - Shared among all objects
         */
    }
}