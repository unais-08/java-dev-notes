/**
 * File: OperatorDemo.java
 * Description: Explains various types of operators in Java with examples.
 * To Compile: javac OperatorDemo.java
 * To Run: java OperatorDemo
 */

// ✅ Java Operators — Clear & Concise Breakdown

public class OperatorDemo { // Class to hold our main method

    public static void main(String[] args) { // Main method - entry point of the program

        // --------------------------------------------------
        // 🔹 1. ARITHMETIC OPERATORS
        // --------------------------------------------------
        // Used to perform mathematical calculations.

        int a = 10;
        int b = 3;

        System.out.println("--- Arithmetic Operators ---");
        System.out.println("a + b = " + (a + b));   // Addition: 13
        System.out.println("a - b = " + (a - b));   // Subtraction: 7
        System.out.println("a * b = " + (a * b));   // Multiplication: 30
        System.out.println("a / b = " + (a / b));   // Division: 3 (integer division, result is truncated)
        System.out.println("a % b = " + (a % b));   // Modulus (remainder): 1

        // Increment (++) and Decrement (--)
        int x = 5;
        System.out.println("x++ (post-increment) = " + (x++)); // 5 (value used first, then x becomes 6)
        System.out.println("x (after post-increment) = " + x); // 6

        int y = 5;
        System.out.println("++y (pre-increment) = " + (++y)); // 6 (y becomes 6 first, then value used)
        System.out.println("y (after pre-increment) = " + y); // 6

        int z = 10;
        System.out.println("z-- (post-decrement) = " + (z--)); // 10 (value used first, then z becomes 9)
        System.out.println("z (after post-decrement) = " + z); // 9

        int w = 10;
        System.out.println("--w (pre-decrement) = " + (--w)); // 9 (w becomes 9 first, then value used)
        System.out.println("w (after pre-decrement) = " + w); // 9


        // --------------------------------------------------
        // 🔸 2. RELATIONAL (COMPARISON) OPERATORS
        // --------------------------------------------------
        // Used to compare two values and return a boolean result.

        System.out.println("\n--- Relational Operators ---");
        System.out.println("a == b: " + (a == b)); // Equal to: false
        System.out.println("a != b: " + (a != b)); // Not equal to: true
        System.out.println("a > b: " + (a > b));   // Greater than: true
        System.out.println("a < b: " + (a < b));   // Less than: false
        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to: true
        System.out.println("a <= b: " + (a <= b)); // Less than or equal to: false

        // --------------------------------------------------
        // 🔹 3. LOGICAL OPERATORS
        // --------------------------------------------------
        // Used to combine boolean expressions.

        boolean condition1 = true;
        boolean condition2 = false;

        System.out.println("\n--- Logical Operators ---");
        System.out.println("condition1 && condition2: " + (condition1 && condition2)); // Logical AND: false (both must be true)
        System.out.println("condition1 || condition2: " + (condition1 || condition2)); // Logical OR: true (at least one must be true)
        System.out.println("!condition1: " + (!condition1));                         // Logical NOT: false (inverts the boolean value)

        // Short-circuiting behavior:
        // `&&` will not evaluate the second operand if the first is false.
        // `||` will not evaluate the second operand if the first is true.
        boolean result = (10 > 5) || (10 / 0 == 1); // No error, because (10 > 5) is true, second part is not evaluated.
        System.out.println("Short-circuiting OR example: " + result);


        // --------------------------------------------------
        // 🔸 4. ASSIGNMENT OPERATORS
        // --------------------------------------------------
        // Used to assign values to variables.

        int value = 10;
        System.out.println("\n--- Assignment Operators ---");
        System.out.println("Initial value: " + value); // Simple assignment: 10

        value += 5; // Equivalent to: value = value + 5;
        System.out.println("value += 5: " + value); // 15

        value -= 2; // Equivalent to: value = value - 2;
        System.out.println("value -= 2: " + value); // 13

        value *= 3; // Equivalent to: value = value * 3;
        System.out.println("value *= 3: " + value); // 39

        value /= 4; // Equivalent to: value = value / 4;
        System.out.println("value /= 4: " + value); // 9 (integer division)

        value %= 2; // Equivalent to: value = value % 2;
        System.out.println("value %= 2: " + value); // 1

        // --------------------------------------------------
        // 🔹 5. BITWISE OPERATORS (Advanced/Less Common in interviews unless specific domain)
        // --------------------------------------------------
        // Operate on individual bits of integer types.

        int num1 = 5;  // Binary: 0000 0101
        int num2 = 3;  // Binary: 0000 0011

        System.out.println("\n--- Bitwise Operators ---");
        System.out.println("num1 & num2 (AND): " + (num1 & num2)); // 0000 0001 (1)
        System.out.println("num1 | num2 (OR):  " + (num1 | num2)); // 0000 0111 (7)
        System.out.println("num1 ^ num2 (XOR): " + (num1 ^ num2)); // 0000 0110 (6)
        System.out.println("~num1 (NOT): " + (~num1));             // -6 (Inverts all bits, tricky with signed integers, depends on two's complement representation)
        System.out.println("num1 << 1 (Left Shift): " + (num1 << 1));     // 0000 1010 (10) - Multiplies by 2^n
        System.out.println("num1 >> 1 (Signed Right Shift): " + (num1 >> 1));     // 0000 0010 (2) - Divides by 2^n, preserves sign
        int negNum = -5; // Binary (two's complement): 1111 1011
        System.out.println("negNum >> 1: " + (negNum >> 1)); // 1111 1101 (-3) - preserves sign
        System.out.println("negNum >>> 1 (Unsigned Right Shift): " + (negNum >>> 1)); // 0111 1101 (2147483645) - fills with 0, doesn't preserve sign


        // --------------------------------------------------
        // 🔸 6. TERNARY (CONDITIONAL) OPERATOR
        // --------------------------------------------------
        // A shorthand for an `if-else` statement. `condition ? expression_if_true : expression_if_false;`

        int age = 18;
        String eligibility = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";
        System.out.println("\n--- Ternary Operator ---");
        System.out.println("Age " + age + ": " + eligibility); // Output: Age 18: Eligible to vote

        int newAge = 16;
        String newEligibility = (newAge >= 18) ? "Eligible to vote" : "Not eligible to vote";
        System.out.println("Age " + newAge + ": " + newEligibility); // Output: Age 16: Not eligible to vote


        // --------------------------------------------------
        // 🔹 7. INSTANCEOF OPERATOR
        // --------------------------------------------------
        // Used to check if an object is an instance of a particular class or interface.

        System.out.println("\n--- Instanceof Operator ---");
        String myString = "Hello";
        System.out.println("myString instanceof String: " + (myString instanceof String)); // true

        Object obj = myString;
        System.out.println("obj instanceof String: " + (obj instanceof String)); // true

        Integer numObj = 10;
        System.out.println("numObj instanceof Integer: " + (numObj instanceof Integer)); // true
        System.out.println("numObj instanceof Object: " + (numObj instanceof Object));   // true

        // This will be more relevant when we cover OOP (classes and inheritance).

        // --------------------------------------------------
        // 🧠 Summary of Operators
        // --------------------------------------------------
        /*
        ✔ **Arithmetic:** `+`, `-`, `*`, `/`, `%`, `++`, `--`
        ✔ **Relational (Comparison):** `==`, `!=`, `>`, `<`, `>=`, `<=` (return boolean)
        ✔ **Logical:** `&&` (AND), `||` (OR), `!` (NOT) (operate on booleans)
        ✔ **Assignment:** `=`, `+=`, `-=`, `*=`, `/=`, `%=` (shorthand assignments)
        ✔ **Bitwise:** `&`, `|`, `^`, `~`, `<<`, `>>`, `>>>` (operate on bits)
        ✔ **Ternary (Conditional):** `condition ? value_if_true : value_if_false;`
        ✔ **Instanceof:** `object instanceof ClassName` (checks type compatibility)

        Remember operator precedence! Use parentheses `()` to enforce order if unsure.
        */
    }
}