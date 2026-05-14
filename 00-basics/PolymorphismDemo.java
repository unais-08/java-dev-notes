/**
 * File: PolymorphismDemo.java
 *
 * Description: *
 * Topics Covered:
 * Complete revision notes for Polymorphism in Java.

 * --------------------------------------------------
 * 1. What is Polymorphism?
 * 2. Types of Polymorphism
 * 3. Compile-Time Polymorphism
 * 4. Method Overloading
 * 5. Runtime Polymorphism
 * 6. Method Overriding
 * 7. Dynamic Method Dispatch
 * 8. Upcasting
 * 9. Rules of Overriding
 * 10. Advantages of Polymorphism
 * 11. Best Practices
 *
 * Important:
 * --------------------------------------------------
 * - Poly = Many
 * - Morphism = Forms
 *
 * One method can behave differently
 * in different situations.
 */

public class PolymorphismDemo {

    // ======================================================
    // MAIN METHOD
    // ======================================================

    public static void main(String[] args) {

        // ==================================================
        // 1. METHOD OVERLOADING
        // ==================================================

        System.out.println(
                "=== 1. Method Overloading ===");

        /*
         * Method Overloading:
         * --------------------------------------------------
         * Same method name
         * Different parameters
         *
         * Achieved at compile time.
         */

        Calculator calculator =
                new Calculator();

        System.out.println(
                "add(10, 20): "
                        + calculator.add(10, 20));

        System.out.println(
                "add(10, 20, 30): "
                        + calculator.add(10, 20, 30));

        System.out.println(
                "add(10.5, 20.5): "
                        + calculator.add(10.5, 20.5));

        System.out.println();

        // ==================================================
        // 2. METHOD OVERRIDING
        // ==================================================

        System.out.println(
                "=== 2. Method Overriding ===");

        /*
         * Method Overriding:
         * --------------------------------------------------
         * Child class changes
         * parent class method behavior.
         *
         * Achieved at runtime.
         */

        Animal animal =
                new Animal();

        animal.sound();

        Dog dog =
                new Dog();

        dog.sound();

        Cat cat =
                new Cat();

        cat.sound();

        System.out.println();

        // ==================================================
        // 3. RUNTIME POLYMORPHISM
        // ==================================================

        System.out.println(
                "=== 3. Runtime Polymorphism ===");

        /*
         * Parent reference
         * Child object
         */

        Animal myAnimal;

        myAnimal = new Dog();
        myAnimal.sound();

        myAnimal = new Cat();
        myAnimal.sound();

        System.out.println();

        // ==================================================
        // 4. DYNAMIC METHOD DISPATCH
        // ==================================================

        System.out.println(
                "=== 4. Dynamic Method Dispatch ===");

        /*
         * Method call decided at runtime
         * based on object type.
         */

        Animal ref;

        ref = new Dog();
        ref.sound();

        ref = new Cat();
        ref.sound();

        System.out.println();

        // ==================================================
        // 5. UPCASTING
        // ==================================================

        System.out.println(
                "=== 5. Upcasting ===");

        /*
         * Converting child object
         * into parent reference.
         */

        Animal pet =
                new Dog();

        pet.sound();

        /*
         * Parent reference can access:
         * --------------------------------------------------
         * Only parent class methods
         */

        // pet.bark();
        // ❌ NOT ALLOWED

        System.out.println();

        // ==================================================
        // 6. RULES OF METHOD OVERLOADING
        // ==================================================

        System.out.println(
                "=== 6. Rules of Overloading ===");

        /*
         * Methods must differ by:
         * --------------------------------------------------
         * 1. Number of parameters
         * 2. Type of parameters
         * 3. Order of parameters
         *
         * Return type alone cannot
         * overload methods.
         */

        System.out.println(
                "Overloading improves readability");

        System.out.println();

        // ==================================================
        // 7. RULES OF METHOD OVERRIDING
        // ==================================================

        System.out.println(
                "=== 7. Rules of Overriding ===");

        /*
         * Rules:
         * --------------------------------------------------
         * 1. Same method name
         * 2. Same parameters
         * 3. Same or compatible return type
         * 4. Cannot reduce access level
         * 5. static methods cannot be overridden
         */

        System.out.println(
                "Overriding enables runtime polymorphism");

        System.out.println();

        // ==================================================
        // 8. ADVANTAGES OF POLYMORPHISM
        // ==================================================

        System.out.println(
                "=== 8. Advantages ===");

        /*
         * Advantages:
         * --------------------------------------------------
         * 1. Code flexibility
         * 2. Code reusability
         * 3. Easier maintenance
         * 4. Better scalability
         * 5. Cleaner code design
         */

        System.out.println(
                "Polymorphism improves flexibility");

        System.out.println();

        // ==================================================
        // 9. BEST PRACTICES
        // ==================================================

        System.out.println(
                "=== 9. Best Practices ===");

        /*
         * Best Practices:
         * --------------------------------------------------
         * 1. Use overriding for dynamic behavior
         * 2. Keep methods meaningful
         * 3. Use @Override annotation
         * 4. Avoid unnecessary overloading
         */

        System.out.println(
                "Always use @Override annotation");

        System.out.println();

        // ==================================================
        // SUMMARY
        // ==================================================

        /*
         * POLYMORPHISM:
         * --------------------------------------------------
         * One method behaves differently
         * in different situations.
         *
         * TYPES:
         * --------------------------------------------------
         * 1. Compile-Time Polymorphism
         *    -> Method Overloading
         *
         * 2. Runtime Polymorphism
         *    -> Method Overriding
         *
         * OVERLOADING:
         * --------------------------------------------------
         * Same method name
         * Different parameters
         *
         * OVERRIDING:
         * --------------------------------------------------
         * Child class changes
         * parent method behavior.
         */
    }
}

// ==========================================================
// METHOD OVERLOADING
// ==========================================================

class Calculator {

    /*
     * Same method name
     * Different parameters.
     */

    public int add(int a, int b) {

        return a + b;
    }

    public int add(int a, int b, int c) {

        return a + b + c;
    }

    public double add(double a, double b) {

        return a + b;
    }
}

// ==========================================================
// PARENT CLASS
// ==========================================================

class Animal {

    public void sound() {

        System.out.println(
                "Animal makes sound");
    }
}

// ==========================================================
// CHILD CLASS - DOG
// ==========================================================

class Dog extends Animal {

    @Override
    public void sound() {

        System.out.println(
                "Dog says Woof");
    }

    public void bark() {

        System.out.println(
                "Dog is barking");
    }
}

// ==========================================================
// CHILD CLASS - CAT
// ==========================================================

class Cat extends Animal {

    @Override
    public void sound() {

        System.out.println(
                "Cat says Meow");
    }
}