/**
 * File: ClassesAndObjects.java
 *
 * Description:
 * Complete revision notes for Classes and Objects in Java.
 *
 * Topics Covered:
 * --------------------------------------------------
 * 1. What is a Class?
 * 2. What is an Object?
 * 3. Creating Classes
 * 4. Creating Objects
 * 5. Instance Variables
 * 6. Methods
 * 7. Constructors
 * 8. this Keyword
 * 9. Multiple Objects
 * 10. Static Members
 * 11. Access Modifiers
 * 12. Best Practices
 *
 * Important:
 * --------------------------------------------------
 * - Class = Blueprint
 * - Object = Real instance created from class
 * - Objects store data and behavior
 * - Java is object-oriented
 */

public class ClassesAndObjects {

    // ======================================================
    // MAIN METHOD
    // ======================================================

    public static void main(String[] args) {

        // ==================================================
        // 1. CREATING OBJECTS
        // ==================================================

        System.out.println(
                "=== 1. Creating Objects ===");

        /*
         * Syntax:
         *
         * ClassName objectName = new ClassName();
         */

        Student student1 =
                new Student("Unais", 22);

        Student student2 =
                new Student("Aman", 20);

        // Calling methods
        student1.displayInfo();
        student2.displayInfo();

        System.out.println();

        // ==================================================
        // 2. ACCESSING INSTANCE VARIABLES
        // ==================================================

        System.out.println(
                "=== 2. Accessing Variables ===");

        System.out.println(
                "Student1 Name: "
                        + student1.name);

        System.out.println(
                "Student1 Age: "
                        + student1.age);

        System.out.println();

        // ==================================================
        // 3. USING METHODS
        // ==================================================

        System.out.println(
                "=== 3. Using Methods ===");

        student1.study();
        student2.study();

        System.out.println();

        // ==================================================
        // 4. STATIC VARIABLES & METHODS
        // ==================================================

        System.out.println(
                "=== 4. Static Members ===");

        /*
         * Static members belong to class,
         * not individual objects.
         */

        System.out.println(
                "Total Students: "
                        + Student.studentCount);

        Student.showStudentCount();

        System.out.println();

        // ==================================================
        // 5. MULTIPLE OBJECTS
        // ==================================================

        System.out.println(
                "=== 5. Multiple Objects ===");

        /*
         * Every object has its own data.
         */

        Student student3 =
                new Student("Sara", 21);

        student3.displayInfo();

        System.out.println(
                "Total Students After student3: "
                        + Student.studentCount);

        System.out.println();

        // ==================================================
        // 6. OBJECT REFERENCES
        // ==================================================

        System.out.println(
                "=== 6. Object References ===");

        Student refStudent = student1;

        System.out.println(
                "refStudent Name: "
                        + refStudent.name);

        /*
         * Both variables point
         * to same object.
         */

        refStudent.name = "Updated Unais";

        System.out.println(
                "student1 Name After Update: "
                        + student1.name);

        System.out.println();

        // ==================================================
        // 7. NULL REFERENCES
        // ==================================================

        System.out.println(
                "=== 7. Null References ===");

        Student nullStudent = null;

        System.out.println(
                "nullStudent = "
                        + nullStudent);

        /*
         * Calling methods on null
         * causes NullPointerException.
         */

        // nullStudent.displayInfo();

        System.out.println();

        // ==================================================
        // 8. ACCESS MODIFIERS
        // ==================================================

        System.out.println(
                "=== 8. Access Modifiers ===");

        /*
         * public    -> Accessible everywhere
         * private   -> Accessible only inside class
         * protected -> Accessible in package + subclass
         * default   -> Accessible inside same package
         */

        student1.setMarks(90);

        System.out.println(
                "Student1 Marks: "
                        + student1.getMarks());

        System.out.println();

        // ==================================================
        // 9. MEMORY CONCEPT
        // ==================================================

        System.out.println(
                "=== 9. Memory Concept ===");

        /*
         * Object:
         * Stored in Heap Memory
         *
         * Reference Variable:
         * Stored in Stack Memory
         */

        System.out.println(
                "Objects are created using new keyword");

        System.out.println();

        // ==================================================
        // 10. BEST PRACTICES
        // ==================================================

        System.out.println(
                "=== 10. Best Practices ===");

        /*
         * Best Practices:
         * --------------------------------------------------
         * 1. Use meaningful class names
         * 2. Use camelCase for variables/methods
         * 3. Keep variables private when possible
         * 4. Use constructors properly
         * 5. Avoid unnecessary public variables
         */

        System.out.println(
                "Follow naming conventions");

        System.out.println(
                "Use encapsulation for safety");

        System.out.println();

        // ==================================================
        // SUMMARY
        // ==================================================

        /*
         * CLASS:
         * --------------------------------------------------
         * Blueprint for creating objects.
         *
         * OBJECT:
         * --------------------------------------------------
         * Real instance of a class.
         *
         * INSTANCE VARIABLE:
         * --------------------------------------------------
         * Separate copy for every object.
         *
         * METHOD:
         * --------------------------------------------------
         * Defines object behavior.
         *
         * CONSTRUCTOR:
         * --------------------------------------------------
         * Special method used to initialize objects.
         *
         * STATIC:
         * --------------------------------------------------
         * Shared among all objects.
         *
         * THIS KEYWORD:
         * --------------------------------------------------
         * Refers to current object.
         */
    }
}

// ==========================================================
// STUDENT CLASS
// ==========================================================

/*
 * Blueprint for Student objects.
 */

class Student {

    // ======================================================
    // INSTANCE VARIABLES
    // ======================================================

    String name;
    int age;

    // Private variable
    private int marks;

    // Static variable
    static int studentCount = 0;

    // ======================================================
    // CONSTRUCTOR
    // ======================================================

    /*
     * Constructor:
     * Automatically called when object is created.
     */

    public Student(String name, int age) {

        /*
         * this keyword refers
         * to current object.
         */

        this.name = name;
        this.age = age;

        studentCount++;
    }

    // ======================================================
    // METHODS
    // ======================================================

    public void displayInfo() {

        System.out.println(
                "Name: " + name
                        + ", Age: " + age);
    }

    public void study() {

        System.out.println(
                name + " is studying");
    }

    // ======================================================
    // GETTER & SETTER
    // ======================================================

    /*
     * Used to access private variables safely.
     */

    public void setMarks(int marks) {

        this.marks = marks;
    }

    public int getMarks() {

        return marks;
    }

    // ======================================================
    // STATIC METHOD
    // ======================================================

    public static void showStudentCount() {

        System.out.println(
                "Current Student Count: "
                        + studentCount);
    }
}