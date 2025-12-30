// File: SimpleLambdaExamples.java

// Simple functional interfaces
interface Calculator {
    int calculate(int a, int b);
}

interface Greeting {
    void sayHello(String name);
}

interface Checker {
    boolean check(int number);
}

public class LambdaExamples {
    public static void main(String[] args) {

        // 1. Basic Calculator Operations
        Calculator add = (a, b) -> a + b;
        Calculator multiply = (a, b) -> a * b;

        System.out.println("=== CALCULATOR ===");
        System.out.println("5 + 3 = " + add.calculate(5, 3));
        System.out.println("5 * 3 = " + multiply.calculate(5, 3));

        // 2. Simple Greetings
        Greeting formalGreet = name -> System.out.println("Hello, " + name);
        Greeting casualGreet = name -> System.out.println("Hey " + name + "!");

        System.out.println("\n=== GREETINGS ===");
        formalGreet.sayHello("Alice");
        casualGreet.sayHello("Bob");

        // 3. Number Checkers
        Checker isEven = num -> num % 2 == 0;
        Checker isPositive = num -> num > 0;

        System.out.println("\n=== NUMBER CHECKS ===");
        System.out.println("Is 10 even? " + isEven.check(10));
        System.out.println("Is -5 positive? " + isPositive.check(-5));

        // 4. Using lambdas in methods
        System.out.println("\n=== USING IN METHODS ===");
        processNumbers(8, isEven);
        processNumbers(15, num -> num < 10); // Lambda directly in method call
    }

    // Method that uses the Checker interface
    public static void processNumbers(int number, Checker checker) {
        if (checker.check(number)) {
            System.out.println(number + " passes the check!");
        } else {
            System.out.println(number + " fails the check!");
        }
    }
}