/**
 * File: ExceptionHandlingDemo.java
 *
 * Description:
 * Complete revision notes for Exception Handling in Java.
 *
 * Topics Covered:
 * --------------------------------------------------
 * 1. What is Exception Handling?
 * 2. Types of Exceptions
 * 3. try Block
 * 4. catch Block
 * 5. finally Block
 * 6. throw Keyword
 * 7. throws Keyword
 * 8. Multiple catch Blocks
 * 9. Custom Exceptions
 * 10. Checked vs Unchecked Exceptions
 * 11. Best Practices
 *
 * Important:
 * --------------------------------------------------
 * - Exception = Runtime error/event
 * - Exception handling prevents
 * program termination.
 *
 * Main Keywords:
 * --------------------------------------------------
 * try
 * catch
 * finally
 * throw
 * throws
 */

public class ExceptionHandlingDemo {

    // ======================================================
    // MAIN METHOD
    // ======================================================

    public static void main(String[] args) {

        // ==================================================
        // 1. BASIC EXCEPTION HANDLING
        // ==================================================

        System.out.println(
                "=== 1. Basic Exception Handling ===");

        try {

            int number = 10 / 0;

            System.out.println(number);

        } catch (ArithmeticException e) {

            System.out.println(
                    "Cannot divide by zero");

            System.out.println(
                    "Exception Message: "
                            + e.getMessage());
        }

        System.out.println();

        // ==================================================
        // 2. ARRAY INDEX EXCEPTION
        // ==================================================

        System.out.println(
                "=== 2. Array Index Exception ===");

        try {

            int[] numbers = { 10, 20, 30 };

            System.out.println(numbers[5]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println(
                    "Invalid Array Index");
        }

        System.out.println();

        // ==================================================
        // 3. NULL POINTER EXCEPTION
        // ==================================================

        System.out.println(
                "=== 3. Null Pointer Exception ===");

        try {

            String text = null;

            System.out.println(text.length());

        } catch (NullPointerException e) {

            System.out.println(
                    "String is null");
        }

        System.out.println();

        // ==================================================
        // 4. MULTIPLE CATCH BLOCKS
        // ==================================================

        System.out.println(
                "=== 4. Multiple Catch Blocks ===");

        try {

            int[] arr = { 1, 2, 3 };

            System.out.println(arr[5]);

            int result = 10 / 0;

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println(
                    "Array Index Exception Caught");

        } catch (ArithmeticException e) {

            System.out.println(
                    "Arithmetic Exception Caught");

        } catch (Exception e) {

            /*
             * Generic exception catch block.
             */

            System.out.println(
                    "General Exception Caught");
        }

        System.out.println();

        // ==================================================
        // 5. FINALLY BLOCK
        // ==================================================

        System.out.println(
                "=== 5. finally Block ===");

        try {

            int result = 100 / 10;

            System.out.println(
                    "Result: "
                            + result);

        } catch (Exception e) {

            System.out.println(
                    "Exception Occurred");

        } finally {

            /*
             * finally block always executes.
             */

            System.out.println(
                    "finally Block Executed");
        }

        System.out.println();

        // ==================================================
        // 6. THROW KEYWORD
        // ==================================================

        System.out.println(
                "=== 6. throw Keyword ===");

        try {

            int age = 15;

            if (age < 18) {

                throw new ArithmeticException(
                        "Not Eligible to Vote");
            }

        } catch (ArithmeticException e) {

            System.out.println(
                    e.getMessage());
        }

        System.out.println();

        // ==================================================
        // 7. THROWS KEYWORD
        // ==================================================

        System.out.println(
                "=== 7. throws Keyword ===");

        try {

            checkFile();

        } catch (Exception e) {

            System.out.println(
                    "Exception handled in main()");
        }

        System.out.println();

        // ==================================================
        // 8. CUSTOM EXCEPTION
        // ==================================================

        System.out.println(
                "=== 8. Custom Exception ===");

        try {

            validateSalary(2000);

        } catch (InvalidSalaryException e) {

            System.out.println(
                    e.getMessage());
        }

        System.out.println();

        // ==================================================
        // 9. CHECKED VS UNCHECKED EXCEPTIONS
        // ==================================================

        System.out.println(
                "=== 9. Checked vs Unchecked ===");

        /*
         * CHECKED EXCEPTIONS:
         * --------------------------------------------------
         * Checked at compile time.
         *
         * Example:
         * IOException
         * SQLException
         * FileNotFoundException
         *
         * UNCHECKED EXCEPTIONS:
         * --------------------------------------------------
         * Occur at runtime.
         *
         * Example:
         * ArithmeticException
         * NullPointerException
         * ArrayIndexOutOfBoundsException
         */

        System.out.println(
                "Checked exceptions handled at compile time");

        System.out.println(
                "Unchecked exceptions occur at runtime");

        System.out.println();

        // ==================================================
        // 10. NESTED TRY BLOCK
        // ==================================================

        System.out.println(
                "=== 10. Nested try Block ===");

        try {

            try {

                int result = 10 / 0;

            } catch (ArithmeticException e) {

                System.out.println(
                        "Inner catch block");
            }

            int[] arr = { 1, 2 };

            System.out.println(arr[5]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println(
                    "Outer catch block");
        }

        System.out.println();

        // ==================================================
        // 11. BEST PRACTICES
        // ==================================================

        System.out.println(
                "=== 11. Best Practices ===");

        /*
         * Best Practices:
         * --------------------------------------------------
         * 1. Catch specific exceptions first
         * 2. Avoid empty catch blocks
         * 3. Use finally for cleanup code
         * 4. Do not use exceptions
         * for normal program flow
         * 5. Create meaningful custom exceptions
         */

        System.out.println(
                "Always handle exceptions properly");

        System.out.println();

        // ==================================================
        // SUMMARY
        // ==================================================

        /*
         * EXCEPTION:
         * --------------------------------------------------
         * An unwanted event that disrupts
         * normal program execution.
         *
         * try:
         * --------------------------------------------------
         * Block containing risky code.
         *
         * catch:
         * --------------------------------------------------
         * Handles exceptions.
         *
         * finally:
         * --------------------------------------------------
         * Always executes.
         *
         * throw:
         * --------------------------------------------------
         * Used to manually throw exception.
         *
         * throws:
         * --------------------------------------------------
         * Declares possible exceptions.
         */
    }

    // ======================================================
    // METHOD USING throws
    // ======================================================

    public static void checkFile()
            throws Exception {

        throw new Exception(
                "File Not Found");
    }

    // ======================================================
    // CUSTOM EXCEPTION VALIDATION
    // ======================================================

    public static void validateSalary(
            int salary)
            throws InvalidSalaryException {

        if (salary < 5000) {

            throw new InvalidSalaryException(
                    "Salary Too Low");
        }

        System.out.println(
                "Valid Salary");
    }
}

// ==========================================================
// CUSTOM EXCEPTION CLASS
// ==========================================================

/*
 * User-defined exception.
 */

class InvalidSalaryException
        extends Exception {

    public InvalidSalaryException(
            String message) {

        super(message);
    }
}