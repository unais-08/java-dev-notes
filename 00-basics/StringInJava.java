/**
 * File: StringInJava.java
 *
 * Description:
 * Complete revision notes for Java Strings.
 *
 * Topics Covered:
 * --------------------------------------------------
 * 1. String Creation
 * 2. String Immutability
 * 3. Important String Methods
 * 4. String Comparison
 * 5. String Concatenation
 * 6. String Pool & Interning
 * 7. String Formatting
 * 8. Best Practices & Common Mistakes
 * 9. String Conversions
 * 10. Regular Expressions with Strings
 *
 * Important:
 * --------------------------------------------------
 * - String belongs to java.lang package
 * - Strings are immutable in Java
 * - String literals are stored in String Pool
 */

public class StringInJava {

        public static void main(String[] args) {

                // ==================================================
                // 1. STRING CREATION
                // ==================================================

                System.out.println("=== 1. String Creation ===");

                // --------------------------------------------------
                // 1.1 Using String Literal
                // --------------------------------------------------

                /*
                 * Most common and recommended way.
                 * Stored inside String Pool.
                 */

                String greetingLiteral = "Hello, Java!";

                System.out.println("Literal String: " + greetingLiteral);

                // --------------------------------------------------
                // 1.2 Using new Keyword
                // --------------------------------------------------

                /*
                 * Creates object in heap memory.
                 * Less efficient than literals.
                 */

                String greetingObject = new String("Hello, Java!");

                System.out.println("Object String: " + greetingObject);

                // --------------------------------------------------
                // 1.3 Creating from Character Array
                // --------------------------------------------------

                char[] charArray = {
                                'J', 'a', 'v', 'a',
                                ' ', 'S', 't', 'r',
                                'i', 'n', 'g'
                };

                String fromCharArray = new String(charArray);

                System.out.println("From Char Array: " + fromCharArray);

                // --------------------------------------------------
                // 1.4 Partial Character Array
                // --------------------------------------------------

                String fromPartialCharArray = new String(charArray, 5, 6);

                System.out.println(
                                "From Partial Char Array: "
                                                + fromPartialCharArray);

                System.out.println();

                // ==================================================
                // 2. STRING IMMUTABILITY
                // ==================================================

                System.out.println("=== 2. String Immutability ===");

                /*
                 * Strings cannot be changed after creation.
                 * Any modification creates a new object.
                 */

                String originalString = "Immutable";

                System.out.println(
                                "Original String: "
                                                + originalString);

                String modifiedString = originalString.concat(" World");

                System.out.println(
                                "Modified String: "
                                                + modifiedString);

                System.out.println(
                                "Original String remains unchanged: "
                                                + originalString);

                System.out.println();

                // ==================================================
                // 3. IMPORTANT STRING METHODS
                // ==================================================

                System.out.println("=== 3. Important String Methods ===");

                String sampleText = "  Java Programming is Fun!  ";

                String anotherText = "java programming is fun!";

                String emptyString = "";

                String nullString = null;

                // --------------------------------------------------
                // 3.1 length()
                // --------------------------------------------------

                System.out.println(
                                "Length of sampleText: "
                                                + sampleText.length());

                System.out.println(
                                "Length of empty string: "
                                                + emptyString.length());

                // nullString.length() -> NullPointerException

                // --------------------------------------------------
                // 3.2 isEmpty()
                // --------------------------------------------------

                System.out.println(
                                "Is sampleText empty? "
                                                + sampleText.isEmpty());

                System.out.println(
                                "Is emptyString empty? "
                                                + emptyString.isEmpty());

                // --------------------------------------------------
                // 3.3 isBlank() (Java 11+)
                // --------------------------------------------------

                String blankString = "   \t  \n";

                System.out.println(
                                "Is blankString blank? "
                                                + blankString.isBlank());

                System.out.println(
                                "Is emptyString blank? "
                                                + emptyString.isBlank());

                // --------------------------------------------------
                // 3.4 charAt()
                // --------------------------------------------------

                System.out.println(
                                "Character at index 7: "
                                                + sampleText.charAt(7));

                // --------------------------------------------------
                // 3.5 substring(beginIndex)
                // --------------------------------------------------

                System.out.println(
                                "Substring from index 10: "
                                                + sampleText.substring(10));

                // --------------------------------------------------
                // 3.6 substring(beginIndex, endIndex)
                // --------------------------------------------------

                System.out.println(
                                "Substring from 10 to 20: "
                                                + sampleText.substring(10, 20));

                // --------------------------------------------------
                // 3.7 equals()
                // --------------------------------------------------

                /*
                 * Case-sensitive comparison.
                 */

                System.out.println(
                                "equals(): "
                                                + sampleText.equals(anotherText));

                // --------------------------------------------------
                // 3.8 equalsIgnoreCase()
                // --------------------------------------------------

                System.out.println(
                                "equalsIgnoreCase(): "
                                                + sampleText.equalsIgnoreCase(
                                                                anotherText));

                // --------------------------------------------------
                // 3.9 compareTo()
                // --------------------------------------------------

                System.out.println(
                                "apple compareTo banana: "
                                                + "apple".compareTo("banana"));

                System.out.println(
                                "banana compareTo apple: "
                                                + "banana".compareTo("apple"));

                // --------------------------------------------------
                // 3.10 startsWith()
                // --------------------------------------------------

                System.out.println(
                                "Starts with Java? "
                                                + sampleText.trim().startsWith("Java"));

                // --------------------------------------------------
                // 3.11 endsWith()
                // --------------------------------------------------

                System.out.println(
                                "Ends with Fun!? "
                                                + sampleText.trim().endsWith("Fun!"));

                // --------------------------------------------------
                // 3.12 indexOf()
                // --------------------------------------------------

                System.out.println(
                                "Index of P: "
                                                + sampleText.indexOf('P'));

                System.out.println(
                                "Index of z: "
                                                + sampleText.indexOf('z'));

                // --------------------------------------------------
                // 3.13 lastIndexOf()
                // --------------------------------------------------

                String complexString = "abracadabra";

                System.out.println(
                                "Last index of a: "
                                                + complexString.lastIndexOf('a'));

                // --------------------------------------------------
                // 3.14 replace()
                // --------------------------------------------------

                System.out.println(
                                "Replace a with *: "
                                                + complexString.replace('a', '*'));

                // --------------------------------------------------
                // 3.15 replaceAll()
                // --------------------------------------------------

                System.out.println(
                                "Replace spaces with _: "
                                                + sampleText.trim()
                                                                .replaceAll(" ", "_"));

                // --------------------------------------------------
                // 3.16 replaceFirst()
                // --------------------------------------------------

                System.out.println(
                                "Replace first a: "
                                                + complexString.replaceFirst("a", "*"));

                // --------------------------------------------------
                // 3.17 toLowerCase()
                // --------------------------------------------------

                System.out.println(
                                "Lowercase: "
                                                + sampleText.toLowerCase());

                // --------------------------------------------------
                // 3.18 toUpperCase()
                // --------------------------------------------------

                System.out.println(
                                "Uppercase: "
                                                + sampleText.toUpperCase());

                // --------------------------------------------------
                // 3.19 trim()
                // --------------------------------------------------

                System.out.println(
                                "Trimmed: "
                                                + sampleText.trim());

                // --------------------------------------------------
                // 3.20 concat()
                // --------------------------------------------------

                String firstName = "John";
                String lastName = "Doe";

                String fullName = firstName.concat(" ")
                                .concat(lastName);

                System.out.println(
                                "Full Name: "
                                                + fullName);

                // --------------------------------------------------
                // 3.21 contains()
                // --------------------------------------------------

                System.out.println(
                                "Contains Programming? "
                                                + sampleText.contains("Programming"));

                // --------------------------------------------------
                // 3.22 String.valueOf()
                // --------------------------------------------------

                int number = 123;
                double decimal = 45.67;
                boolean flag = true;

                System.out.println(
                                "String value of int: "
                                                + String.valueOf(number));

                System.out.println(
                                "String value of double: "
                                                + String.valueOf(decimal));

                System.out.println(
                                "String value of boolean: "
                                                + String.valueOf(flag));

                // --------------------------------------------------
                // 3.23 split()
                // --------------------------------------------------

                String csvData = "apple,banana,orange,grape";

                String[] fruits = csvData.split(",");

                System.out.print("Split CSV: ");

                for (String fruit : fruits) {
                        System.out.print(fruit + " ");
                }

                System.out.println("\n");

                // ==================================================
                // 4. STRING COMPARISON
                // ==================================================

                System.out.println("=== 4. String Comparison ===");

                String str1 = "Hello";
                String str2 = "Hello";
                String str3 = new String("Hello");
                String str4 = "HELLO";

                // --------------------------------------------------
                // == Operator
                // --------------------------------------------------

                /*
                 * Compares memory references.
                 * NOT string content.
                 */

                System.out.println(
                                "str1 == str2 : "
                                                + (str1 == str2));

                System.out.println(
                                "str1 == str3 : "
                                                + (str1 == str3));

                // --------------------------------------------------
                // equals()
                // --------------------------------------------------

                /*
                 * Compares actual content.
                 * Recommended for strings.
                 */

                System.out.println(
                                "str1.equals(str3): "
                                                + str1.equals(str3));

                // --------------------------------------------------
                // equalsIgnoreCase()
                // --------------------------------------------------

                System.out.println(
                                "str1.equalsIgnoreCase(str4): "
                                                + str1.equalsIgnoreCase(str4));

                System.out.println();

                // ==================================================
                // 5. STRING CONCATENATION
                // ==================================================

                System.out.println("=== 5. String Concatenation ===");

                // --------------------------------------------------
                // Using +
                // --------------------------------------------------

                String message = "Welcome" + " to"
                                + " Java" + " World!";

                System.out.println(
                                "Using + : "
                                                + message);

                // --------------------------------------------------
                // Using StringBuilder
                // --------------------------------------------------

                /*
                 * Best for many concatenations.
                 * Mutable and faster.
                 */

                StringBuilder stringBuilder = new StringBuilder();

                stringBuilder.append("Building")
                                .append(" strings")
                                .append(" efficiently");

                System.out.println(
                                "Using StringBuilder: "
                                                + stringBuilder);

                // --------------------------------------------------
                // Using StringBuffer
                // --------------------------------------------------

                /*
                 * Thread-safe version of StringBuilder.
                 * Slightly slower.
                 */

                StringBuffer stringBuffer = new StringBuffer();

                stringBuffer.append("Thread")
                                .append(" safe")
                                .append(" string building");

                System.out.println(
                                "Using StringBuffer: "
                                                + stringBuffer);

                System.out.println();

                // ==================================================
                // 6. STRING POOL & INTERNING
                // ==================================================

                System.out.println("=== 6. String Pool & Interning ===");

                String s1 = "pool";
                String s2 = "pool";
                String s3 = new String("pool");

                String s4 = s3.intern();

                System.out.println("s1 == s2 : " + (s1 == s2));
                System.out.println("s1 == s3 : " + (s1 == s3));
                System.out.println("s1 == s4 : " + (s1 == s4));

                System.out.println();

                // ==================================================
                // 7. STRING FORMATTING
                // ==================================================

                System.out.println("=== 7. String Formatting ===");

                String formattedString = String.format(
                                "My name is %s and I am %d years old.",
                                "Alice",
                                30);

                System.out.println(formattedString);

                System.out.printf(
                                "PI value: %.2f%n",
                                Math.PI);

                System.out.println();

                // ==================================================
                // 8. BEST PRACTICES & COMMON MISTAKES
                // ==================================================

                System.out.println(
                                "=== 8. Best Practices & Common Mistakes ===");

                // --------------------------------------------------
                // NullPointerException
                // --------------------------------------------------

                String potentialNull = null;

                if (potentialNull != null) {

                        System.out.println(
                                        potentialNull.length());

                } else {

                        System.out.println(
                                        "potentialNull is null");
                }

                // --------------------------------------------------
                // Correct String Comparison
                // --------------------------------------------------

                String city1 = "London";
                String city2 = new String("London");

                System.out.println(
                                "Using == : "
                                                + (city1 == city2));

                System.out.println(
                                "Using equals(): "
                                                + city1.equals(city2));

                System.out.println();

                // ==================================================
                // 9. STRING CONVERSIONS
                // ==================================================

                System.out.println("=== 9. String Conversions ===");

                // --------------------------------------------------
                // String to char[]
                // --------------------------------------------------

                String textToChars = "Example";

                char[] convertedChars = textToChars.toCharArray();

                System.out.print("char[] : ");

                for (char c : convertedChars) {
                        System.out.print(c + " ");
                }

                System.out.println();

                // --------------------------------------------------
                // String to byte[]
                // --------------------------------------------------

                String textToBytes = "Hello";

                byte[] convertedBytes = textToBytes.getBytes();

                System.out.print("byte[] : ");

                for (byte b : convertedBytes) {
                        System.out.print(b + " ");
                }

                System.out.println();

                // --------------------------------------------------
                // Primitive to String
                // --------------------------------------------------

                int num = 42;

                String numAsString = String.valueOf(num);

                System.out.println(
                                "Int to String: "
                                                + numAsString);

                // --------------------------------------------------
                // String to Primitive
                // --------------------------------------------------

                String intString = "123";

                int parsedInt = Integer.parseInt(intString);

                System.out.println(
                                "String to int: "
                                                + parsedInt);

                String doubleString = "123.45";

                double parsedDouble = Double.parseDouble(doubleString);

                System.out.println(
                                "String to double: "
                                                + parsedDouble);

                System.out.println();

                // ==================================================
                // 10. REGULAR EXPRESSIONS
                // ==================================================

                System.out.println(
                                "=== 10. Regular Expressions ===");

                String email = "user@example.com";

                String emailRegex = ".*@.*\\..*";

                System.out.println(
                                "Valid email? "
                                                + email.matches(emailRegex));

                String phoneNumber = "123-456-7890";

                String phoneRegex = "\\d{3}-\\d{3}-\\d{4}";

                System.out.println(
                                "Valid phone? "
                                                + phoneNumber.matches(phoneRegex));

                // --------------------------------------------------
                // replaceAll with Regex
                // --------------------------------------------------

                String textWithNumbers = "Item123 Price45.67 Quantity8";

                System.out.println(
                                textWithNumbers.replaceAll(
                                                "\\d",
                                                "#"));

                // --------------------------------------------------
                // split with Regex
                // --------------------------------------------------

                String path = "/usr/local/bin";

                String[] parts = path.split("/");

                System.out.print("Path Parts: ");

                for (String part : parts) {

                        if (!part.isEmpty()) {
                                System.out.print(part + " ");
                        }
                }

                System.out.println("\n");

                // ==================================================
                // END
                // ==================================================

                System.out.println(
                                "=== End of String Revision Notes ===");
        }
}