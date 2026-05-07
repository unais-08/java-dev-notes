/**
 * File: OperatorDemo.java
 * Description:
 * Explains different types of operators in Java with examples.
 */

public class OperatorDemo {

    public static void main(String[] args) {

        // ==================================================
        // 1. ARITHMETIC OPERATORS
        // ==================================================

        /*
         * Used to perform mathematical operations.
         */

        int a = 10;
        int b = 3;

        System.out.println("=== Arithmetic Operators ===");

        // Basic Arithmetic Operations
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division (integer division)
        System.out.println("a % b = " + (a % b)); // Modulus (remainder)

        // --------------------------------------------------
        // Increment and Decrement Operators
        // --------------------------------------------------

        /*
         * Post Increment:
         * Value used first, then increased.
         */

        int x = 5;

        System.out.println("\nx++ = " + (x++));
        System.out.println("x after post increment = " + x);

        /*
         * Pre Increment:
         * Value increased first, then used.
         */

        int y = 5;

        System.out.println("\n++y = " + (++y));
        System.out.println("y after pre increment = " + y);

        /*
         * Post Decrement:
         * Value used first, then decreased.
         */

        int z = 10;

        System.out.println("\nz-- = " + (z--));
        System.out.println("z after post decrement = " + z);

        /*
         * Pre Decrement:
         * Value decreased first, then used.
         */

        int w = 10;

        System.out.println("\n--w = " + (--w));
        System.out.println("w after pre decrement = " + w);

        // ==================================================
        // 2. RELATIONAL (COMPARISON) OPERATORS
        // ==================================================

        /*
         * Used to compare two values.
         * Always returns boolean (true/false).
         */

        System.out.println("\n=== Relational Operators ===");

        System.out.println("a == b : " + (a == b)); // Equal to
        System.out.println("a != b : " + (a != b)); // Not equal to
        System.out.println("a > b  : " + (a > b));  // Greater than
        System.out.println("a < b  : " + (a < b));  // Less than
        System.out.println("a >= b : " + (a >= b)); // Greater than or equal
        System.out.println("a <= b : " + (a <= b)); // Less than or equal

        // ==================================================
        // 3. LOGICAL OPERATORS
        // ==================================================

        /*
         * Used with boolean expressions.
         */

        boolean condition1 = true;
        boolean condition2 = false;

        System.out.println("\n=== Logical Operators ===");

        System.out.println(
                "condition1 && condition2 : "
                        + (condition1 && condition2));

        System.out.println(
                "condition1 || condition2 : "
                        + (condition1 || condition2));

        System.out.println(
                "!condition1 : "
                        + (!condition1));

        // --------------------------------------------------
        // Short-Circuiting
        // --------------------------------------------------

        /*
         * &&
         * If first condition is false,
         * second condition is not checked.
         *
         * ||
         * If first condition is true,
         * second condition is not checked.
         */

        boolean result = (10 > 5) || (10 / 0 == 1);

        System.out.println(
                "Short-circuit OR example : "
                        + result);

        // ==================================================
        // 4. ASSIGNMENT OPERATORS
        // ==================================================

        /*
         * Used to assign and update values.
         */

        int value = 10;

        System.out.println("\n=== Assignment Operators ===");

        System.out.println("Initial value = " + value);

        value += 5;
        System.out.println("value += 5  -> " + value);

        value -= 2;
        System.out.println("value -= 2  -> " + value);

        value *= 3;
        System.out.println("value *= 3  -> " + value);

        value /= 4;
        System.out.println("value /= 4  -> " + value);

        value %= 2;
        System.out.println("value %= 2  -> " + value);

        // ==================================================
        // 5. BITWISE OPERATORS
        // ==================================================

        /*
         * Operate directly on binary bits.
         * Mostly used in low-level programming.
         */

        int num1 = 5; // Binary: 0101
        int num2 = 3; // Binary: 0011

        System.out.println("\n=== Bitwise Operators ===");

        System.out.println("num1 & num2  = " + (num1 & num2)); // AND
        System.out.println("num1 | num2  = " + (num1 | num2)); // OR
        System.out.println("num1 ^ num2  = " + (num1 ^ num2)); // XOR
        System.out.println("~num1        = " + (~num1));       // NOT

        // Shift Operators
        System.out.println("num1 << 1    = " + (num1 << 1)); // Left shift
        System.out.println("num1 >> 1    = " + (num1 >> 1)); // Right shift

        int negNum = -5;

        System.out.println("negNum >> 1  = " + (negNum >> 1));
        System.out.println("negNum >>> 1 = " + (negNum >>> 1));

        // ==================================================
        // 6. TERNARY OPERATOR
        // ==================================================

        /*
         * Short form of if-else.
         *
         * Syntax:
         * condition ? trueValue : falseValue;
         */

        int age = 18;

        String eligibility =
                (age >= 18)
                        ? "Eligible to vote"
                        : "Not eligible to vote";

        System.out.println("\n=== Ternary Operator ===");

        System.out.println(
                "Age " + age + " : " + eligibility);

        int newAge = 16;

        String newEligibility =
                (newAge >= 18)
                        ? "Eligible to vote"
                        : "Not eligible to vote";

        System.out.println(
                "Age " + newAge + " : " + newEligibility);

        // ==================================================
        // 7. INSTANCEOF OPERATOR
        // ==================================================

        /*
         * Checks whether an object belongs
         * to a specific class or not.
         */

        System.out.println("\n=== Instanceof Operator ===");

        String myString = "Hello";

        System.out.println(
                "myString instanceof String : "
                        + (myString instanceof String));

        Object obj = myString;

        System.out.println(
                "obj instanceof String : "
                        + (obj instanceof String));

        Integer numObj = 10;

        System.out.println(
                "numObj instanceof Integer : "
                        + (numObj instanceof Integer));

        System.out.println(
                "numObj instanceof Object : "
                        + (numObj instanceof Object));

        // ==================================================
        // SUMMARY
        // ==================================================

        /*
         * Arithmetic Operators:
         * -----------------------------------------
         * +   -   *   /   %
         * ++  --
         *
         * Relational Operators:
         * -----------------------------------------
         * ==   !=   >   <   >=   <=
         *
         * Logical Operators:
         * -----------------------------------------
         * &&   ||   !
         *
         * Assignment Operators:
         * -----------------------------------------
         * =   +=   -=   *=   /=   %=
         *
         * Bitwise Operators:
         * -----------------------------------------
         * &   |   ^   ~   <<   >>   >>>
         *
         * Ternary Operator:
         * -----------------------------------------
         * condition ? trueValue : falseValue
         *
         * Instanceof Operator:
         * -----------------------------------------
         * object instanceof ClassName
         *
         * Important:
         * Use parentheses () when operator
         * precedence becomes confusing.
         */
    }
}