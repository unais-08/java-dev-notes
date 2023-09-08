// Define a class called Calculator
class Calculator {
    // Define a method called addNumbers that takes two integers (num1 and num2) as parameters
    public int addNumbers(int num1, int num2) {
        // Calculate the sum of num1 and num2 and store it in the result variable
        int result = num1 + num2;
        // Return the result of the addition
        return result;
    }

    // Define a method called subNumbers that takes two integers (num1 and num2) as parameters
    public int subNumbers(int num1, int num2) {
        // Calculate the difference of num1 and num2 and store it in the result variable
        int result = num1 - num2;
        // Return the result of the subtraction
        return result;
    }

    // Define a method called mulNumbers that takes two integers (num1 and num2) as parameters
    public int mulNumbers(int num1, int num2) {
        // Calculate the product of num1 and num2 and store it in the result variable
        int result = num1 * num2;
        // Return the result of the multiplication
        return result;
    }

    // Define a method called divNumbers that takes two integers (num1 and num2) as parameters
    public int divNumbers(int num1, int num2) {
        // Calculate the division of num1 by num2 and store it in the result variable
        int result = num1 / num2;
        // Return the result of the division
        return result;
    }
}

// Define a class called Foundation
public class MethodsInJava {
    // Define a method called sayMyfunction with no parameters
    public void sayMyfunction() {
        // Print a message to the console
        System.out.println("I am from foundation class but Calculator class methods doing well");
    }

    // The main method is the entry point of the program
    public static void main(String[] args) {
        // Print "hello" to the console
        System.out.println("hello");

        // Create an instance of the Calculator class
        Calculator calculator = new Calculator();

        // Call the addNumbers method of the calculator object with arguments 10 and 10,
        // and print the result to the console
        System.out.println(calculator.addNumbers(10, 10));

        // Call the subNumbers method of the calculator object with arguments 10 and 10,
        // and print the result to the console
        System.out.println(calculator.subNumbers(10, 10));

        // Call the mulNumbers method of the calculator object with arguments 10 and 10,
        // and print the result to the console
        System.out.println(calculator.mulNumbers(10, 10));

        // Call the divNumbers method of the calculator object with arguments 10 and 10,
        // and print the result to the console
        System.out.println(calculator.divNumbers(10, 10));

        // Create an instance of the Foundation class
        MethodsInJava refToSayMyfunction = new MethodsInJava();

        // Call the sayMyfunction method of the Foundation object
        refToSayMyfunction.sayMyfunction();
    }
}
