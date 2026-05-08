/**
 * File: AbstractClassAndInterfaceDemo.java
 *
 * Description:
 * Complete revision notes for
 * Abstract Classes and Interfaces in Java.
 *
 * Topics Covered:
 * --------------------------------------------------
 * 1. What is an Abstract Class?
 * 2. What is an Interface?
 * 3. Abstract Methods
 * 4. Concrete Methods
 * 5. Implementing Interfaces
 * 6. Multiple Inheritance using Interfaces
 * 7. Abstract Class vs Interface
 * 8. Runtime Abstraction
 * 9. Advantages
 * 10. Best Practices
 *
 * Important:
 * --------------------------------------------------
 * ABSTRACT CLASS:
 * - Partial abstraction
 * - Can have abstract + concrete methods
 * - Can have constructors and instance variables
 *
 * INTERFACE:
 * - Full abstraction (before Java 8)
 * - Defines behavior contract
 * - Supports multiple inheritance
 */

public class AbstractClassAndInterfaceDemo {

    // ======================================================
    // MAIN METHOD
    // ======================================================

    public static void main(String[] args) {

        // ==================================================
        // 1. ABSTRACT CLASS
        // ==================================================

        System.out.println(
                "=== 1. Abstract Class ===");

        /*
         * Cannot create object
         * of abstract class.
         */

        // Vehicle vehicle = new Vehicle();
        // ❌ ERROR

        Car car = new Car();

        car.start();
        car.stop();
        car.showBrand();

        System.out.println();

        // ==================================================
        // 2. RUNTIME ABSTRACTION
        // ==================================================

        System.out.println(
                "=== 2. Runtime Abstraction ===");

        /*
         * Parent reference
         * Child object.
         */

        Vehicle myVehicle;

        myVehicle = new Car();
        myVehicle.start();

        myVehicle = new Bike();
        myVehicle.start();

        System.out.println();

        // ==================================================
        // 3. INTERFACE
        // ==================================================

        System.out.println(
                "=== 3. Interface ===");

        /*
         * Interface defines behavior
         * that implementing classes must provide.
         */

        Dog dog = new Dog();

        dog.sound();
        dog.eat();

        System.out.println();

        // ==================================================
        // 4. MULTIPLE INHERITANCE
        // ==================================================

        System.out.println(
                "=== 4. Multiple Inheritance ===");

        /*
         * Java does not support
         * multiple inheritance using classes.
         *
         * But supports it using interfaces.
         */

        SmartPhone phone = new SmartPhone();

        phone.call();
        phone.takePhoto();

        System.out.println();

        // ==================================================
        // 5. ABSTRACT METHOD
        // ==================================================

        System.out.println(
                "=== 5. Abstract Method ===");

        /*
         * Abstract method:
         * --------------------------------------------------
         * Method without body.
         *
         * Child class must implement it.
         */

        Shape circle = new Circle();

        circle.draw();

        Shape rectangle = new Rectangle();

        rectangle.draw();

        System.out.println();

        // ==================================================
        // 6. INTERFACE VARIABLES
        // ==================================================

        System.out.println(
                "=== 6. Interface Variables ===");

        /*
         * Interface variables are:
         * --------------------------------------------------
         * public static final
         */

        System.out.println(
                "Max Speed: "
                        + Features.MAX_SPEED);

        System.out.println();

        // ==================================================
        // 7. ABSTRACT CLASS VS INTERFACE
        // ==================================================

        System.out.println(
                "=== 7. Abstract Class vs Interface ===");

        /*
         * ABSTRACT CLASS:
         * --------------------------------------------------
         * 1. Uses abstract keyword
         * 2. Can have constructors
         * 3. Can have instance variables
         * 4. Supports partial abstraction
         * 5. Single inheritance only
         *
         * INTERFACE:
         * --------------------------------------------------
         * 1. Uses interface keyword
         * 2. No constructors
         * 3. Variables are static final
         * 4. Provides abstraction
         * 5. Supports multiple inheritance
         */

        System.out.println(
                "Interfaces support multiple inheritance");

        System.out.println();

        // ==================================================
        // 8. ADVANTAGES
        // ==================================================

        System.out.println(
                "=== 8. Advantages ===");

        /*
         * Advantages:
         * --------------------------------------------------
         * 1. Reduces complexity
         * 2. Improves flexibility
         * 3. Supports loose coupling
         * 4. Improves maintainability
         * 5. Encourages reusable design
         */

        System.out.println(
                "Abstraction improves code design");

        System.out.println();

        // ==================================================
        // 9. BEST PRACTICES
        // ==================================================

        System.out.println(
                "=== 9. Best Practices ===");

        /*
         * Best Practices:
         * --------------------------------------------------
         * 1. Use abstract class for shared code
         * 2. Use interface for common behavior
         * 3. Keep interfaces focused
         * 4. Avoid unnecessary abstraction
         */

        System.out.println(
                "Use interfaces for behavior contracts");

        System.out.println();

        // ==================================================
        // SUMMARY
        // ==================================================

        /*
         * ABSTRACT CLASS:
         * --------------------------------------------------
         * Used when classes share common code.
         *
         * INTERFACE:
         * --------------------------------------------------
         * Used to define behavior contract.
         *
         * ABSTRACT METHOD:
         * --------------------------------------------------
         * Method without implementation.
         *
         * IMPLEMENTS:
         * --------------------------------------------------
         * Keyword used with interfaces.
         *
         * EXTENDS:
         * --------------------------------------------------
         * Keyword used for inheritance.
         */
    }
}

// ==========================================================
// ABSTRACT CLASS
// ==========================================================

abstract class Vehicle {

    // Instance Variable
    String brand = "Toyota";

    /*
     * Constructor allowed
     */

    public Vehicle() {

        System.out.println(
                "Vehicle Constructor Called");
    }

    // ======================================================
    // ABSTRACT METHOD
    // ======================================================

    abstract void start();

    // ======================================================
    // CONCRETE METHODS
    // ======================================================

    public void stop() {

        System.out.println(
                "Vehicle Stopped");
    }

    public void showBrand() {

        System.out.println(
                "Brand: "
                        + brand);
    }
}

// ==========================================================
// CHILD CLASS - CAR
// ==========================================================

class Car extends Vehicle {

    @Override
    void start() {

        System.out.println(
                "Car Starts with Key");
    }
}

// ==========================================================
// CHILD CLASS - BIKE
// ==========================================================

class Bike extends Vehicle {

    @Override
    void start() {

        System.out.println(
                "Bike Starts with Kick");
    }
}

// ==========================================================
// INTERFACE
// ==========================================================

interface Animal {

    /*
     * Methods are public abstract by default.
     */

    void sound();

    void eat();
}

// ==========================================================
// IMPLEMENTING INTERFACE
// ==========================================================

class Dog implements Animal {

    @Override
    public void sound() {

        System.out.println(
                "Dog says Woof");
    }

    @Override
    public void eat() {

        System.out.println(
                "Dog is eating");
    }
}

// ==========================================================
// MULTIPLE INHERITANCE USING INTERFACES
// ==========================================================

interface Camera {

    void takePhoto();
}

interface Phone {

    void call();
}

class SmartPhone implements Camera, Phone {

    @Override
    public void takePhoto() {

        System.out.println(
                "Taking Photo");
    }

    @Override
    public void call() {

        System.out.println(
                "Calling Someone");
    }
}

// ==========================================================
// ABSTRACT METHOD EXAMPLE
// ==========================================================

abstract class Shape {

    abstract void draw();
}

class Circle extends Shape {

    @Override
    void draw() {

        System.out.println(
                "Drawing Circle");
    }
}

class Rectangle extends Shape {

    @Override
    void draw() {

        System.out.println(
                "Drawing Rectangle");
    }
}

// ==========================================================
// INTERFACE VARIABLES
// ==========================================================

interface Features {

    /*
     * public static final automatically added.
     */

    int MAX_SPEED = 120;
}