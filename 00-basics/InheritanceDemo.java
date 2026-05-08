/**
 * File: InheritanceDemo.java
 *
 * Description:
 * Complete revision notes for Inheritance in Java.
 *
 * Topics Covered:
 * --------------------------------------------------
 * 1. What is Inheritance?
 * 2. Parent Class (Superclass)
 * 3. Child Class (Subclass)
 * 4. extends Keyword
 * 5. Method Inheritance
 * 6. Method Overriding
 * 7. super Keyword
 * 8. Constructor Inheritance
 * 9. Types of Inheritance
 * 10. IS-A Relationship
 * 11. Advantages of Inheritance
 * 12. Best Practices
 *
 * Important:
 * --------------------------------------------------
 * - Inheritance allows one class
 *   to acquire properties of another class.
 *
 * - Child class reuses parent class code.
 *
 * - Achieves code reusability.
 */

public class InheritanceDemo {

    // ======================================================
    // MAIN METHOD
    // ======================================================

    public static void main(String[] args) {

        // ==================================================
        // 1. PARENT CLASS OBJECT
        // ==================================================

        System.out.println(
                "=== 1. Parent Class Object ===");

        Animal animal =
                new Animal();

        animal.eat();
        animal.sleep();

        System.out.println();

        // ==================================================
        // 2. CHILD CLASS OBJECT
        // ==================================================

        System.out.println(
                "=== 2. Child Class Object ===");

        Dog dog =
                new Dog();

        /*
         * Dog class can access:
         * --------------------------------------------------
         * 1. Its own methods
         * 2. Parent class methods
         */

        dog.eat();
        dog.sleep();
        dog.bark();

        System.out.println();

        // ==================================================
        // 3. METHOD OVERRIDING
        // ==================================================

        System.out.println(
                "=== 3. Method Overriding ===");

        /*
         * Child class provides
         * its own implementation
         * of parent method.
         */

        dog.sound();

        Cat cat =
                new Cat();

        cat.sound();

        System.out.println();

        // ==================================================
        // 4. CONSTRUCTOR INHERITANCE
        // ==================================================

        System.out.println(
                "=== 4. Constructor Inheritance ===");

        Car car =
                new Car();

        /*
         * Parent constructor executes first,
         * then child constructor.
         */

        System.out.println();

        // ==================================================
        // 5. SUPER KEYWORD
        // ==================================================

        System.out.println(
                "=== 5. super Keyword ===");

        /*
         * super is used to:
         * --------------------------------------------------
         * 1. Access parent variables
         * 2. Access parent methods
         * 3. Call parent constructor
         */

        Bike bike =
                new Bike();

        bike.showDetails();

        System.out.println();

        // ==================================================
        // 6. IS-A RELATIONSHIP
        // ==================================================

        System.out.println(
                "=== 6. IS-A Relationship ===");

        /*
         * Dog IS-A Animal
         * Cat IS-A Animal
         * Car IS-A Vehicle
         */

        Animal myPet =
                new Dog();

        myPet.sound();

        System.out.println();

        // ==================================================
        // 7. TYPES OF INHERITANCE
        // ==================================================

        System.out.println(
                "=== 7. Types of Inheritance ===");

        /*
         * Types Supported in Java:
         * --------------------------------------------------
         * 1. Single Inheritance
         * 2. Multilevel Inheritance
         * 3. Hierarchical Inheritance
         *
         * Not Supported with Classes:
         * --------------------------------------------------
         * Multiple Inheritance
         *
         * (Possible using Interfaces)
         */

        System.out.println(
                "Java supports multiple inheritance using interfaces");

        System.out.println();

        // ==================================================
        // 8. MULTILEVEL INHERITANCE
        // ==================================================

        System.out.println(
                "=== 8. Multilevel Inheritance ===");

        Puppy puppy =
                new Puppy();

        puppy.eat();
        puppy.bark();
        puppy.weep();

        System.out.println();

        // ==================================================
        // 9. ADVANTAGES OF INHERITANCE
        // ==================================================

        System.out.println(
                "=== 9. Advantages ===");

        /*
         * Advantages:
         * --------------------------------------------------
         * 1. Code reusability
         * 2. Reduces duplicate code
         * 3. Improves maintainability
         * 4. Supports polymorphism
         * 5. Better code organization
         */

        System.out.println(
                "Inheritance promotes code reuse");

        System.out.println();

        // ==================================================
        // 10. BEST PRACTICES
        // ==================================================

        System.out.println(
                "=== 10. Best Practices ===");

        /*
         * Best Practices:
         * --------------------------------------------------
         * 1. Use inheritance only when needed
         * 2. Prefer composition if relationship
         *    is not IS-A
         * 3. Keep inheritance hierarchy simple
         * 4. Use method overriding properly
         */

        System.out.println(
                "Use inheritance for IS-A relationships");

        System.out.println();

        // ==================================================
        // SUMMARY
        // ==================================================

        /*
         * INHERITANCE:
         * --------------------------------------------------
         * Acquiring properties and behaviors
         * from another class.
         *
         * PARENT CLASS:
         * --------------------------------------------------
         * Class whose properties are inherited.
         *
         * CHILD CLASS:
         * --------------------------------------------------
         * Class that inherits another class.
         *
         * extends:
         * --------------------------------------------------
         * Keyword used for inheritance.
         *
         * METHOD OVERRIDING:
         * --------------------------------------------------
         * Child class changes parent method behavior.
         *
         * super:
         * --------------------------------------------------
         * Refers to parent class object.
         */
    }
}

// ==========================================================
// PARENT CLASS
// ==========================================================

class Animal {

    public void eat() {

        System.out.println(
                "Animal is eating");
    }

    public void sleep() {

        System.out.println(
                "Animal is sleeping");
    }

    public void sound() {

        System.out.println(
                "Animal makes sound");
    }
}

// ==========================================================
// CHILD CLASS
// ==========================================================

/*
 * Dog inherits Animal class.
 */

class Dog extends Animal {

    public void bark() {

        System.out.println(
                "Dog is barking");
    }

    // ======================================================
    // METHOD OVERRIDING
    // ======================================================

    @Override
    public void sound() {

        System.out.println(
                "Dog says Woof Woof");
    }
}

// ==========================================================
// ANOTHER CHILD CLASS
// ==========================================================

class Cat extends Animal {

    @Override
    public void sound() {

        System.out.println(
                "Cat says Meow");
    }
}

// ==========================================================
// CONSTRUCTOR INHERITANCE
// ==========================================================

class Vehicle {

    public Vehicle() {

        System.out.println(
                "Vehicle Constructor Called");
    }
}

class Car extends Vehicle {

    public Car() {

        /*
         * super() is automatically called.
         */

        System.out.println(
                "Car Constructor Called");
    }
}

// ==========================================================
// SUPER KEYWORD EXAMPLE
// ==========================================================

class Machine {

    String brand = "Generic Machine";

    public void start() {

        System.out.println(
                "Machine Started");
    }
}

class Bike extends Machine {

    String brand = "Yamaha";

    public void showDetails() {

        /*
         * Access child variable
         */

        System.out.println(
                "Child Brand: "
                        + brand);

        /*
         * Access parent variable
         */

        System.out.println(
                "Parent Brand: "
                        + super.brand);

        /*
         * Access parent method
         */

        super.start();
    }
}

// ==========================================================
// MULTILEVEL INHERITANCE
// ==========================================================

class Puppy extends Dog {

    public void weep() {

        System.out.println(
                "Puppy is weeping");
    }
}