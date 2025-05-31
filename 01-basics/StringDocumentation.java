/**
 * StringDocumentation.java
 *
 * This file provides comprehensive documentation and examples for the
 * `java.lang.String` class. It covers fundamental concepts, common methods,
 * and best practices for working with strings in Java.
 *
 * The `String` class represents character strings. All string literals in Java
 * programs, such as "abc", are implemented as instances of this class.
 * Strings are immutable; once created, their values cannot be changed.
 * This immutability makes strings safe for sharing among multiple threads
 * and is crucial for security and performance in various Java APIs.
 *
 * Author: Gemini
 * Date: May 31, 2025
 */
public class StringDocumentation {

    /**
     * The main method serves as an entry point for demonstrating String
     * functionalities.
     *
     * @param args Command line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // --- 1. String Instantiation ---
        System.out.println("--- 1. String Instantiation ---");

        // 1.1. Using String Literal (most common and recommended)
        // String literals are stored in the String Pool for efficiency.
        String greetingLiteral = "Hello, Java!";
        System.out.println("Literal String: " + greetingLiteral);

        // 1.2. Using 'new' Keyword (creates a new object in heap, not in pool)
        // Generally less efficient than literals unless specific behavior is required.
        String greetingObject = new String("Hello, Java!");
        System.out.println("Object String: " + greetingObject);

        // 1.3. Creating from a character array
        char[] charArray = { 'J', 'a', 'v', 'a', ' ', 'S', 't', 'r', 'i', 'n', 'g' };
        String fromCharArray = new String(charArray);
        System.out.println("From Char Array: " + fromCharArray);

        // 1.4. Creating from a subset of a character array
        String fromPartialCharArray = new String(charArray, 5, 6); // start index, count
        System.out.println("From Partial Char Array: " + fromPartialCharArray);

        System.out.println("\n"); // New line for better readability

        // --- 2. String Immutability ---
        System.out.println("--- 2. String Immutability ---");

        String originalString = "Immutable";
        System.out.println("Original String: " + originalString);

        // Any operation that appears to modify a String actually creates a new String
        // object.
        String modifiedString = originalString.concat(" World");
        System.out.println("Modified String (new object): " + modifiedString);
        System.out.println("Original String (unchanged): " + originalString); // originalString remains "Immutable"

        System.out.println("\n");

        // --- 3. Essential String Methods ---
        System.out.println("--- 3. Essential String Methods ---");

        String sampleText = "  Java Programming is Fun!  ";
        String anotherText = "java programming is fun!";
        String emptyString = "";
        String nullString = null; // Important: A null String is not an empty String!

        // 3.1. length(): Returns the length of the string.
        System.out.println("Length of '" + sampleText + "': " + sampleText.length());
        System.out.println("Length of empty string: " + emptyString.length());
        // System.out.println(nullString.length()); // This would throw a
        // NullPointerException!

        // 3.2. isEmpty(): Checks if the string is empty (length is 0).
        System.out.println("Is '" + sampleText + "' empty? " + sampleText.isEmpty());
        System.out.println("Is empty string empty? " + emptyString.isEmpty());

        // 3.3. isBlank(): Checks if the string is empty or contains only whitespace
        // characters. (Java 11+)
        // Note: For Java versions prior to 11, use trim().isEmpty() for similar
        // functionality.
        String blankString = "   \t  \n";
        System.out.println("Is '" + blankString + "' blank? " + blankString.isBlank());
        System.out.println("Is empty string blank? " + emptyString.isBlank());
        System.out.println("Is '" + sampleText + "' blank? " + sampleText.isBlank());

        // 3.4. charAt(int index): Returns the character at the specified index.
        // Index starts from 0.
        System.out.println("Character at index 7 in '" + sampleText + "': " + sampleText.charAt(7));
        // System.out.println(sampleText.charAt(sampleText.length())); // Throws
        // StringIndexOutOfBoundsException

        // 3.5. substring(int beginIndex): Returns a new string that is a substring of
        // this string.
        // The substring begins at the specified beginIndex and extends to the end of
        // the string.
        System.out.println("Substring from index 10: " + sampleText.substring(10));

        // 3.6. substring(int beginIndex, int endIndex): Returns a new string that is a
        // substring of this string.
        // The substring begins at the specified beginIndex and extends to the character
        // at index endIndex - 1.
        System.out.println("Substring from 10 to 20: " + sampleText.substring(10, 20));

        // 3.7. equals(Object anObject): Compares this string to the specified object.
        // Returns true if the given object is also a String and represents the same
        // sequence of characters.
        // Case-sensitive comparison.
        System.out.println("'" + sampleText + "' equals '" + anotherText + "'? " + sampleText.equals(anotherText));
        System.out.println("'" + sampleText.trim() + "' equals 'Java Programming is Fun!'? "
                + sampleText.trim().equals("Java Programming is Fun!"));

        // 3.8. equalsIgnoreCase(String anotherString): Compares this String to another
        // String, ignoring case considerations.
        System.out.println("'" + sampleText + "' equalsIgnoreCase '" + anotherText + "'? "
                + sampleText.equalsIgnoreCase(anotherText));

        // 3.9. compareTo(String anotherString): Compares two strings lexicographically.
        // Returns a negative integer, zero, or a positive integer as this String is
        // less than,
        // equal to, or greater than the specified String.
        System.out.println("Compare '" + sampleText.trim() + "' to 'Java Programming is Fun!': "
                + sampleText.trim().compareTo("Java Programming is Fun!"));
        System.out.println("Compare 'apple' to 'banana': " + "apple".compareTo("banana")); // Negative
        System.out.println("Compare 'banana' to 'apple': " + "banana".compareTo("apple")); // Positive

        // 3.10. startsWith(String prefix): Tests if this string starts with the
        // specified prefix.
        System.out
                .println("Does '" + sampleText.trim() + "' start with 'Java'? " + sampleText.trim().startsWith("Java"));

        // 3.11. endsWith(String suffix): Tests if this string ends with the specified
        // suffix.
        System.out.println("Does '" + sampleText.trim() + "' end with 'Fun!'? " + sampleText.trim().endsWith("Fun!"));

        // 3.12. indexOf(int ch): Returns the index within this string of the first
        // occurrence of the specified character.
        System.out.println("Index of 'P' in '" + sampleText + "': " + sampleText.indexOf('P'));
        System.out.println("Index of 'z' (not found) in '" + sampleText + "': " + sampleText.indexOf('z')); // Returns
                                                                                                            // -1 if not
                                                                                                            // found

        // 3.13. indexOf(String str): Returns the index within this string of the first
        // occurrence of the specified substring.
        System.out.println("Index of 'Programming' in '" + sampleText + "': " + sampleText.indexOf("Programming"));

        // 3.14. lastIndexOf(int ch) / lastIndexOf(String str): Returns the index of the
        // last occurrence.
        String complexString = "abracadabra";
        System.out.println("Last index of 'a' in '" + complexString + "': " + complexString.lastIndexOf('a'));
        System.out.println("Last index of 'abra' in '" + complexString + "': " + complexString.lastIndexOf("abra"));

        // 3.15. replace(char oldChar, char newChar): Returns a new string resulting
        // from replacing all occurrences
        // of oldChar in this string with newChar.
        System.out.println("Replace 'a' with '*' in '" + complexString + "': " + complexString.replace('a', '*'));

        // 3.16. replaceAll(String regex, String replacement): Replaces each substring
        // of this string that matches
        // the given regular expression with the given replacement.
        System.out.println("Replace all spaces with '_' in '" + sampleText.trim() + "': "
                + sampleText.trim().replaceAll(" ", "_"));

        // 3.17. replaceFirst(String regex, String replacement): Replaces the first
        // substring of this string that matches
        // the given regular expression with the given replacement.
        System.out.println(
                "Replace first 'a' with '*' in '" + complexString + "': " + complexString.replaceFirst("a", "*"));

        // 3.18. toLowerCase(): Converts all of the characters in this String to lower
        // case.
        System.out.println("Lowercase of '" + sampleText + "': " + sampleText.toLowerCase());

        // 3.19. toUpperCase(): Converts all of the characters in this String to upper
        // case.
        System.out.println("Uppercase of '" + sampleText + "': " + sampleText.toUpperCase());

        // 3.20. trim(): Returns a copy of the string, with leading and trailing
        // whitespace omitted.
        System.out.println("Trimmed '" + sampleText + "': '" + sampleText.trim() + "'");

        // 3.21. concat(String str): Concatenates the specified string to the end of
        // this string.
        // Often less efficient than '+' operator or StringBuilder for multiple
        // concatenations.
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName.concat(" ").concat(lastName);
        System.out.println("Concatenated name: " + fullName);

        // 3.22. contains(CharSequence s): Returns true if and only if this string
        // contains the specified sequence of char values.
        System.out.println(
                "Does '" + sampleText.trim() + "' contain 'Programming'? " + sampleText.trim().contains("Programming"));

        // 3.23. valueOf(primitive type/Object): Converts various types (int, double,
        // char[], Object) to a String.
        int number = 123;
        double decimal = 45.67;
        boolean flag = true;
        char[] chars = { 'A', 'B', 'C' };
        System.out.println("Value of int: " + String.valueOf(number));
        System.out.println("Value of double: " + String.valueOf(decimal));
        System.out.println("Value of boolean: " + String.valueOf(flag));
        System.out.println("Value of char array: " + String.valueOf(chars));

        // 3.24. split(String regex): Splits this string around matches of the given
        // regular expression.
        String csvData = "apple,banana,orange,grape";
        String[] fruits = csvData.split(",");
        System.out.print("Split CSV: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        String sentence = "This is a sample sentence.";
        String[] words = sentence.split(" ");
        System.out.print("Split sentence by space: ");
        for (String word : words) {
            System.out.print(word + "|");
        }
        System.out.println();

        System.out.println("\n");

        // --- 4. String Comparison Considerations ---
        System.out.println("--- 4. String Comparison Considerations ---");

        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        String str4 = "HELLO";

        // 4.1. '==' operator: Compares object references, not content.
        // For literals, it might return true due to String Pool optimization.
        System.out.println("str1 == str2 (literals, same pool reference): " + (str1 == str2)); // true
        System.out.println("str1 == str3 (literal vs new object): " + (str1 == str3)); // false (different memory
                                                                                       // locations)

        // 4.2. .equals(): Compares content (recommended for string content comparison).
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true
        System.out.println("str1.equals(str4) (case-sensitive): " + str1.equals(str4)); // false

        // 4.3. .equalsIgnoreCase(): Compares content, ignoring case.
        System.out.println("str1.equalsIgnoreCase(str4): " + str1.equalsIgnoreCase(str4)); // true

        System.out.println("\n");

        // --- 5. String Concatenation Performance ---
        System.out.println("--- 5. String Concatenation Performance ---");

        // 5.1. Using '+' operator:
        // For a few concatenations, the '+' operator is fine. Java compiler optimizes
        // it
        // internally using StringBuilder for a small number of operations.
        String message = "Welcome" + " to" + " Java" + " World!";
        System.out.println("Concatenated with '+': " + message);

        // 5.2. Using StringBuilder (recommended for many concatenations or in loops):
        // StringBuilder is mutable and more efficient for building strings.
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Building").append(" strings").append(" efficiently").append(" with StringBuilder.");
        String builtString = stringBuilder.toString();
        System.out.println("Concatenated with StringBuilder: " + builtString);

        // 5.3. Using StringBuffer (thread-safe version of StringBuilder, slower):
        // Use StringBuffer only when thread safety is a strict requirement.
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Building").append(" strings").append(" safely").append(" with StringBuffer.");
        String bufferedString = stringBuffer.toString();
        System.out.println("Concatenated with StringBuffer: " + bufferedString);

        System.out.println("\n");

        // --- 6. String Pool and Interning ---
        System.out.println("--- 6. String Pool and Interning ---");

        String s1 = "pool";
        String s2 = "pool";
        String s3 = new String("pool");
        String s4 = s3.intern(); // intern() explicitly puts the string into the String Pool

        System.out.println("s1 == s2 (both literals): " + (s1 == s2)); // true (same pool instance)
        System.out.println("s1 == s3 (literal vs new object): " + (s1 == s3)); // false
        System.out.println("s1 == s4 (literal vs interned object): " + (s1 == s4)); // true (s4 now points to the pool
                                                                                    // instance)

        System.out.println("\n");

        // --- 7. Formatting Strings ---
        System.out.println("--- 7. Formatting Strings ---");

        // 7.1. String.format(): Uses a format string and arguments.
        String formattedString = String.format("My name is %s and I am %d years old.", "Alice", 30);
        System.out.println("Formatted String: " + formattedString);

        // 7.2. printf (System.out.printf()): Similar to C's printf.
        System.out.printf("The value of PI is approximately %.2f%n", Math.PI); // %n for new line

        System.out.println("\n");

        // --- 8. Common Pitfalls and Best Practices ---
        System.out.println("--- 8. Common Pitfalls and Best Practices ---");

        // 8.1. NullPointerException with Strings:
        // Always check for null before performing operations on a String that might be
        // null.
        String potentialNull = null;
        try {
            // This would throw NullPointerException if uncommented:
            // System.out.println("Length of potentialNull: " + potentialNull.length());
            if (potentialNull != null) {
                System.out.println("Length of potentialNull: " + potentialNull.length());
            } else {
                System.out.println("potentialNull is null. Cannot get length.");
            }
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }

        // 8.2. Comparing Strings: Always use .equals() or .equalsIgnoreCase() for
        // content comparison.
        // Avoid '==' unless you specifically intend to check for reference equality
        // (same object in memory).
        String city1 = "London";
        String city2 = new String("London");
        System.out.println("Comparing 'London' (literal) and 'London' (new String):");
        System.out.println("  Using == : " + (city1 == city2)); // false
        System.out.println("  Using .equals(): " + city1.equals(city2)); // true

        // 8.3. Performance for large number of concatenations:
        // Use StringBuilder or StringBuffer for building strings in loops.
        // Example of bad practice (quadratic time complexity):
        String badPracticeString = "";
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            badPracticeString += "a"; // Creates 1000 new String objects
        }
        long endTime = System.nanoTime();
        System.out.println("Time taken for 1000 '+' concatenations: " + (endTime - startTime) + " ns");

        // Example of good practice (linear time complexity):
        StringBuilder goodPracticeBuilder = new StringBuilder();
        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            goodPracticeBuilder.append("a");
        }
        String goodPracticeString = goodPracticeBuilder.toString();
        endTime = System.nanoTime();
        System.out.println("Time taken for 1000 StringBuilder appends: " + (endTime - startTime) + " ns");

        System.out.println("\n");

        // --- 9. Character and String Conversions ---
        System.out.println("--- 9. Character and String Conversions ---");

        // 9.1. String to char array
        String textToChars = "Example";
        char[] convertedChars = textToChars.toCharArray();
        System.out.print("String to char array: ");
        for (char c : convertedChars) {
            System.out.print(c + " ");
        }
        System.out.println();

        // 9.2. String to byte array (using default charset)
        String textToBytes = "Hello";
        byte[] convertedBytes = textToBytes.getBytes();
        System.out.print("String to byte array: ");
        for (byte b : convertedBytes) {
            System.out.print(b + " ");
        }
        System.out.println();

        // 9.3. Primitive to String (already covered by String.valueOf, also works with
        // empty string concat)
        int num = 42;
        String numAsString = "" + num; // Simple way, but String.valueOf is more explicit
        System.out.println("Int to String: " + numAsString);

        // 9.4. String to Primitive (using wrapper classes)
        String intString = "123";
        int parsedInt = Integer.parseInt(intString);
        System.out.println("String to int: " + parsedInt);

        String doubleString = "123.45";
        double parsedDouble = Double.parseDouble(doubleString);
        System.out.println("String to double: " + parsedDouble);

        try {
            String invalidIntString = "abc";
            // int invalidParsedInt = Integer.parseInt(invalidIntString); // Throws
            // NumberFormatException
            System.out.println("Attempting to parse 'abc' as int (will throw NumberFormatException).");
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }

        System.out.println("\n");

        // --- 10. Regular Expressions with String Methods ---
        System.out.println("--- 10. Regular Expressions with String Methods ---");

        String email = "user@example.com";
        String emailRegex = ".*@.*\\..*"; // Simple regex for demonstration

        // 10.1. matches(String regex): Tests if this string matches the given regular
        // expression.
        System.out.println("Does '" + email + "' match email regex? " + email.matches(emailRegex));

        String phoneNumber = "123-456-7890";
        String phoneRegex = "\\d{3}-\\d{3}-\\d{4}";
        System.out.println("Does '" + phoneNumber + "' match phone regex? " + phoneNumber.matches(phoneRegex));

        // 10.2. replaceAll(String regex, String replacement) - revisited with more
        // complex regex
        String textWithNumbers = "Item123 Price45.67 Quantity8";
        // Replace all digits with '#'
        System.out.println("Text with numbers replaced: " + textWithNumbers.replaceAll("\\d", "#"));

        // 10.3. split(String regex) - revisited with more complex regex
        String path = "/usr/local/bin";
        String[] parts = path.split("/"); // Splits by '/'
        System.out.print("Path parts: ");
        for (String part : parts) {
            if (!part.isEmpty()) { // Handle leading/trailing delimiters
                System.out.print(part + " ");
            }
        }
        System.out.println();

        System.out.println("\n");

        System.out.println("--- End of String Documentation Examples ---");
    }
}
