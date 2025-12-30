
/**
 * ============================================================================
 * Java Method References
 * ============================================================================
 * 
 * A Method Reference in Java is a shorthand notation of a lambda expression
 * that executes **an existing method**. It uses the `::` operator and is
 * commonly used with **Streams** and **functional interfaces**.
 * 
 * Benefits:
 * - Shorter and cleaner syntax than lambdas.
 * - Improves readability.
 * - Works with static, instance, and constructor methods.
 * 
 * ----------------------------------------------------------------------------
 * Types of Method References
 * ----------------------------------------------------------------------------
 * 1. Reference to a Static Method
 * Syntax: ClassName::staticMethodName
 * Example:
 * List<Integer> numbers = List.of(1, 2, 3, 4);
 * numbers.stream()
 * .map(MathUtils::square) // Instead of n -> MathUtils.square(n)
 * .forEach(System.out::println);
 * 
 * Output:
 * 1
 * 4
 * 9
 * 16
 * 
 * 2. Reference to an Instance Method of a Specific Object
 * Syntax: object::instanceMethodName
 * Example:
 * Printer printer = new Printer();
 * List<String> names = List.of("Alice", "Bob");
 * names.forEach(printer::print); // Instead of s -> printer.print(s)
 * 
 * Output:
 * Alice
 * Bob
 * 
 * 3. Reference to an Instance Method of an Arbitrary Object of a Class
 * Syntax: ClassName::instanceMethodName
 * Example:
 * List<String> fruits = List.of("apple", "banana", "mango");
 * fruits.stream()
 * .map(String::toUpperCase)
 * .forEach(System.out::println);
 * 
 * Output:
 * APPLE
 * BANANA
 * MANGO
 * 
 * 4. Reference to a Constructor
 * Syntax: ClassName::new
 * Example:
 * List<String> names = List.of("Alice", "Bob");
 * List<Person> people = names.stream()
 * .map(Person::new) // Calls constructor Person(String)
 * .toList();
 * 
 * ----------------------------------------------------------------------------
 * Quick Comparison: Lambda vs Method Reference
 * ----------------------------------------------------------------------------
 * Lambda:
 * numbers.forEach(n -> System.out.println(n));
 * 
 * Method Reference:
 * numbers.forEach(System.out::println);
 * 
 * ----------------------------------------------------------------------------
 * Key Points:
 * - Method references can replace lambdas when the lambda **only calls a
 * method**.
 * - They are widely used in Stream operations (map, filter, forEach, etc.).
 * - They improve readability and maintainability of code.
 * 
 * ============================================================================
 */

import java.util.*;

public class MethodReferenceExamples {

    static class MathUtils {
        public static int square(int n) {
            return n * n;
        }
    }

    static class Printer {
        void print(String s) {
            System.out.println(s);
        }
    }

    static class Person {
        String name;

        Person(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {

        // 1. Static method reference
        List<Integer> numbers = List.of(1, 2, 3, 4);
        numbers.stream()
                .map(MathUtils::square)
                .forEach(System.out::println);

        // 2. Instance method reference of an object
        Printer printer = new Printer();
        List<String> names = List.of("Alice", "Bob");
        names.forEach(printer::print);

        // 3. Instance method reference of an arbitrary object
        List<String> fruits = List.of("apple", "banana", "mango");
        fruits.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        // 4. Constructor reference
        List<Person> people = names.stream()
                .map(Person::new)
                .toList();
        people.forEach(System.out::println);
    }
}
