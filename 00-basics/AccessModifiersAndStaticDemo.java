/**
 * File: AccessModifiersAndStaticDemo.java
 *
 * Description:
 * Complete revision notes for
 * Access Modifiers and Static Keyword in Java.
 *
 * Topics Covered:
 * --------------------------------------------------
 * 1. Access Modifiers
 * 2. public Modifier
 * 3. private Modifier
 * 4. protected Modifier
 * 5. default Modifier
 * 6. Static Variables
 * 7. Static Methods
 * 8. Static Blocks
 * 9. Static Nested Class
 * 10. this vs static
 * 11. Best Practices
 *
 * Important:
 * --------------------------------------------------
 * ACCESS MODIFIERS:
 * Control visibility and accessibility
 * of classes, variables, methods,
 * and constructors.
 *
 * STATIC KEYWORD:
 * Belongs to class instead of object.
 */

public class AccessModifiersAndStaticDemo {

    // ======================================================
    // MAIN METHOD
    // ======================================================

    public static void main(String[] args) {

        // ==================================================
        // 1. ACCESS MODIFIERS
        // ==================================================

        System.out.println(
                "=== 1. Access Modifiers ===");

        /*
         * Types of Access Modifiers:
         * --------------------------------------------------
         * 1. public
         * 2. private
         * 3. protected
         * 4. default
         */

        Student student =
                new Student();

        // --------------------------------------------------
        // public Variable
        // --------------------------------------------------

        /*
         * Accessible everywhere.
         */

        student.name = "Unais";

        System.out.println(
                "Public Name: "
                        + student.name);

        // --------------------------------------------------
        // private Variable
        // --------------------------------------------------

        /*
         * Accessible only
         * inside same class.
         */

        // student.password = "1234";
        // ❌ ERROR

        student.setPassword("1234");

        System.out.println(
                "Private Password Accessed Using Getter: "
                        + student.getPassword());

        // --------------------------------------------------
        // protected Variable
        // --------------------------------------------------

        /*
         * Accessible:
         * --------------------------------------------------
         * 1. Same package
         * 2. Subclasses
         */

        student.college = "XYZ College";

        System.out.println(
                "Protected College: "
                        + student.college);

        // --------------------------------------------------
        // default Variable
        // --------------------------------------------------

        /*
         * Accessible only
         * inside same package.
         */

        student.city = "Mumbai";

        System.out.println(
                "Default City: "
                        + student.city);

        System.out.println();

        // ==================================================
        // 2. STATIC VARIABLES
        // ==================================================

        System.out.println(
                "=== 2. Static Variables ===");

        /*
         * Static variables:
         * --------------------------------------------------
         * Shared among all objects.
         * Belong to class.
         */

        Employee emp1 =
                new Employee("Aman");

        Employee emp2 =
                new Employee("Sara");

        System.out.println(
                "Company Name: "
                        + Employee.companyName);

        System.out.println(
                "Employee Count: "
                        + Employee.employeeCount);

        System.out.println();

        // ==================================================
        // 3. STATIC METHODS
        // ==================================================

        System.out.println(
                "=== 3. Static Methods ===");

        /*
         * Static methods belong to class.
         * Can be called without object.
         */

        MathUtility.showMessage();

        System.out.println(
                "Square of 5: "
                        + MathUtility.square(5));

        System.out.println();

        // ==================================================
        // 4. STATIC BLOCK
        // ==================================================

        System.out.println(
                "=== 4. Static Block ===");

        /*
         * Static block executes only once
         * when class loads into memory.
         */

        StaticBlockDemo.display();

        System.out.println();

        // ==================================================
        // 5. STATIC NESTED CLASS
        // ==================================================

        System.out.println(
                "=== 5. Static Nested Class ===");

        /*
         * Static nested class:
         * --------------------------------------------------
         * Does not need outer class object.
         */

        Outer.Inner inner =
                new Outer.Inner();

        inner.show();

        System.out.println();

        // ==================================================
        // 6. this vs static
        // ==================================================

        System.out.println(
                "=== 6. this vs static ===");

        /*
         * this:
         * --------------------------------------------------
         * Refers to current object.
         *
         * static:
         * --------------------------------------------------
         * Refers to class-level members.
         */

        Demo demo =
                new Demo(100);

        demo.show();

        System.out.println();

        // ==================================================
        // 7. STATIC METHOD RULES
        // ==================================================

        System.out.println(
                "=== 7. Static Method Rules ===");

        /*
         * Static methods:
         * --------------------------------------------------
         * 1. Can access only static members directly
         * 2. Cannot use this keyword
         * 3. Cannot access instance variables directly
         */

        System.out.println(
                "Static methods belong to class");

        System.out.println();

        // ==================================================
        // 8. ADVANTAGES OF STATIC
        // ==================================================

        System.out.println(
                "=== 8. Advantages of Static ===");

        /*
         * Advantages:
         * --------------------------------------------------
         * 1. Memory efficient
         * 2. Shared among objects
         * 3. Easy utility method access
         * 4. No object needed
         */

        System.out.println(
                "Static members save memory");

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
         * 2. Use getters/setters
         * 3. Use static only when needed
         * 4. Avoid excessive static usage
         * 5. Use constants as static final
         */

        System.out.println(
                "Use encapsulation with access modifiers");

        System.out.println();

        // ==================================================
        // SUMMARY
        // ==================================================

        /*
         * ACCESS MODIFIERS:
         * --------------------------------------------------
         * public:
         * Accessible everywhere.
         *
         * private:
         * Accessible only inside class.
         *
         * protected:
         * Accessible in package + subclass.
         *
         * default:
         * Accessible only inside package.
         *
         * STATIC:
         * --------------------------------------------------
         * Belongs to class instead of object.
         *
         * STATIC VARIABLE:
         * --------------------------------------------------
         * Shared among all objects.
         *
         * STATIC METHOD:
         * --------------------------------------------------
         * Can be called without object.
         */
    }
}

// ==========================================================
// ACCESS MODIFIER EXAMPLE
// ==========================================================

class Student {

    // ======================================================
    // ACCESS MODIFIERS
    // ======================================================

    public String name;

    private String password;

    protected String college;

    String city; // default access modifier

    // ======================================================
    // GETTER & SETTER
    // ======================================================

    public void setPassword(
            String password) {

        this.password = password;
    }

    public String getPassword() {

        return password;
    }
}

// ==========================================================
// STATIC VARIABLE EXAMPLE
// ==========================================================

class Employee {

    // Shared among all employees
    static String companyName =
            "Google";

    static int employeeCount = 0;

    String employeeName;

    public Employee(
            String employeeName) {

        this.employeeName =
                employeeName;

        employeeCount++;
    }
}

// ==========================================================
// STATIC METHOD EXAMPLE
// ==========================================================

class MathUtility {

    public static void showMessage() {

        System.out.println(
                "Static Method Called");
    }

    public static int square(
            int number) {

        return number * number;
    }
}

// ==========================================================
// STATIC BLOCK EXAMPLE
// ==========================================================

class StaticBlockDemo {

    static {

        System.out.println(
                "Static Block Executed");
    }

    public static void display() {

        System.out.println(
                "Display Method Called");
    }
}

// ==========================================================
// STATIC NESTED CLASS
// ==========================================================

class Outer {

    static class Inner {

        public void show() {

            System.out.println(
                    "Inside Static Nested Class");
        }
    }
}

// ==========================================================
// this vs static EXAMPLE
// ==========================================================

class Demo {

    int number;

    static int staticNumber = 500;

    public Demo(int number) {

        /*
         * this refers to current object.
         */

        this.number = number;
    }

    public void show() {

        System.out.println(
                "Instance Variable: "
                        + this.number);

        System.out.println(
                "Static Variable: "
                        + staticNumber);
    }
}