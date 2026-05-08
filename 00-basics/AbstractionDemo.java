/**
 * File: AbstractionDemo.java
 *
 * Description:
 * Complete revision notes for Abstraction in Java.
 *
 * Topics Covered:
 * --------------------------------------------------
 * 1. What is Abstraction?
 * 2. Abstract Class
 * 3. Abstract Methods
 * 4. Concrete Methods
 * 5. Inheritance with Abstraction
 * 6. Interfaces
 * 7. Multiple Inheritance using Interfaces
 * 8. Runtime Abstraction
 * 9. Difference between Abstract Class & Interface
 * 10. Advantages of Abstraction
 * 11. Best Practices
 *
 * Important:
 * --------------------------------------------------
 * - Abstraction hides implementation details
 * - Shows only essential features
 * - Achieved using:
 *      1. Abstract Classes
 *      2. Interfaces
 */

public class AbstractionDemo {

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

        Car car =
                new Car();

        car.start();
        car.stop();

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
         * Interface provides
         * complete abstraction.
         */

        Dog dog =
                new Dog();

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
         * multiple inheritance with classes.
         *
         * But supports it using interfaces.
         */

        SmartPhone phone =
                new SmartPhone();

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

        Shape circle =
                new Circle();

        circle.draw();

        Shape rectangle =
                new Rectangle();

        rectangle.draw();

        System.out.println();

        // ==================================================
        // 6. CONCRETE METHOD
        // ==================================================

        System.out.println(
                "=== 6. Concrete Method ===");

        /*
         * Abstract classes can also
         * have normal methods.
         */

        car.fuelType();

        System.out.println();

        // ==================================================
        // 7. INTERFACE FEATURES
        // ==================================================

        System.out.println(
                "=== 7. Interface Features ===");

        /*
         * Interface Variables:
         * --------------------------------------------------
         * public static final
         *
         * Interface Methods:
         * --------------------------------------------------
         * public abstract
         * (before Java 8)
         */

        System.out.println(
                "Max Speed: "
                        + VehicleFeatures.MAX_SPEED);

        System.out.println();

        // ==================================================
        // 8. ABSTRACT CLASS VS INTERFACE
        // ==================================================

        System.out.println(
                "=== 8. Abstract Class vs Interface ===");

        /*
         * ABSTRACT CLASS:
         * --------------------------------------------------
         * 1. Can have constructors
         * 2. Can have instance variables
         * 3. Can have concrete methods
         *
         * INTERFACE:
         * --------------------------------------------------
         * 1. No constructors
         * 2. Variables are static final
         * 3. Mostly abstract methods
         */

        System.out.println(
                "Interfaces provide full abstraction");

        System.out.println();

        // ==================================================
        // 9. ADVANTAGES OF ABSTRACTION
        // ==================================================

        System.out.println(
                "=== 9. Advantages ===");

        /*
         * Advantages:
         * --------------------------------------------------
         * 1. Reduces complexity
         * 2. Improves security
         * 3. Hides implementation details
         * 4. Improves maintainability
         * 5. Supports loose coupling
         */

        System.out.println(
                "Abstraction reduces complexity");

        System.out.println();

        // ==================================================
        // 10. BEST PRACTICES
        // ==================================================

        System.out.println(
                "=== 10. Best Practices ===");

        /*
         * Best Practices:
         * --------------------------------------------------
         * 1. Use interfaces for common behavior
         * 2. Use abstract classes for shared code
         * 3. Keep abstraction meaningful
         * 4. Hide unnecessary implementation details
         */

        System.out.println(
                "Expose only essential functionality");

        System.out.println();

        // ==================================================
        // SUMMARY
        // ==================================================

        /*
         * ABSTRACTION:
         * --------------------------------------------------
         * Hiding implementation details
         * and showing only essential features.
         *
         * ABSTRACT CLASS:
         * --------------------------------------------------
         * Class declared using abstract keyword.
         *
         * ABSTRACT METHOD:
         * --------------------------------------------------
         * Method without implementation.
         *
         * INTERFACE:
         * --------------------------------------------------
         * Used for complete abstraction.
         *
         * BENEFIT:
         * --------------------------------------------------
         * Focus on WHAT object does,
         * not HOW it does it.
         */
    }
}

// ==========================================================
// ABSTRACT CLASS
// ==========================================================

abstract class Vehicle {

    /*
     * Abstract Method
     */

    abstract void start();

    /*
     * Concrete Method
     */

    public void stop() {

        System.out.println(
                "Vehicle Stopped");
    }

    public void fuelType() {

        System.out.println(
                "Vehicle uses fuel");
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

interface VehicleFeatures {

    int MAX_SPEED = 120;
}