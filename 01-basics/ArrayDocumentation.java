/**
 * ArrayDocumentation.java
 *
 * This file provides comprehensive documentation and examples for working with
 * arrays in Java. It covers fundamental concepts, various ways to declare,
 * instantiate, and initialize arrays, as well as common operations.
 *
 * Arrays are fixed-size, ordered collections of elements of the same data type.
 * They are fundamental data structures in Java, providing a way to store
 * multiple values in a single variable.
 *
 * Author: Gemini
 * Date: May 31, 2025
 */
public class ArrayDocumentation {

    /**
     * The main method serves as an entry point for demonstrating Array
     * functionalities.
     *
     * @param args Command line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // --- 1. Array Declaration and Instantiation ---
        System.out.println("--- 1. Array Declaration and Instantiation ---");

        // 1.1. Declaration: Specifies the type of elements the array will hold.
        int[] intArrayDeclaration; // Recommended syntax
        // int intArrayDeclaration2[]; // Valid, but less readable and not recommended

        // 1.2. Instantiation: Creates the array object in memory and specifies its
        // size.
        // Elements are initialized to default values (0 for numeric, false for boolean,
        // null for objects).
        intArrayDeclaration = new int[5]; // An array of 5 integers

        System.out.println("Declared and instantiated an integer array of size 5.");
        System.out.println("Default value of first element: " + intArrayDeclaration[0]); // Output: 0

        // 1.3. Declaration and Instantiation in one line
        String[] stringArray = new String[3]; // An array of 3 String objects
        System.out.println("Declared and instantiated a String array of size 3.");
        System.out.println("Default value of first element: " + stringArray[0]); // Output: null

        System.out.println("\n");

        // --- 2. Array Initialization ---
        System.out.println("--- 2. Array Initialization ---");

        // 2.1. Initializing elements after instantiation
        int[] numbers = new int[4];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        System.out.print("Initialized integer array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // 2.2. Initializing during declaration (array literal)
        // The size is automatically determined by the number of elements provided.
        double[] temperatures = { 25.5, 28.0, 22.3, 30.1 };
        System.out.print("Initialized double array using literal: ");
        for (double temp : temperatures) { // Enhanced for-loop for iteration
            System.out.print(temp + " ");
        }
        System.out.println();

        // 2.3. Initializing an array of objects
        String[] fruits = { "Apple", "Banana", "Cherry" };
        System.out.print("Initialized String array: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        System.out.println("\n");

        // --- 3. Accessing Array Elements ---
        System.out.println("--- 3. Accessing Array Elements ---");

        // Array elements are accessed using zero-based indexing.
        // The first element is at index 0, and the last element is at index (length -
        // 1).
        System.out.println("First fruit: " + fruits[0]); // Apple
        System.out.println("Last fruit: " + fruits[fruits.length - 1]); // Cherry

        try {
            // Accessing an index out of bounds will throw an
            // ArrayIndexOutOfBoundsException.
            // System.out.println(fruits[5]); // This would cause an error!
            System.out.println("Attempting to access index 5 (out of bounds) on 'fruits' array.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        System.out.println("\n");

        // --- 4. Array Length ---
        System.out.println("--- 4. Array Length ---");

        // The 'length' property provides the number of elements in the array.
        System.out.println("Length of 'numbers' array: " + numbers.length);
        System.out.println("Length of 'fruits' array: " + fruits.length);

        System.out.println("\n");

        // --- 5. Iterating Through Arrays ---
        System.out.println("--- 5. Iterating Through Arrays ---");

        // 5.1. Using a traditional for loop (useful for accessing indices)
        System.out.print("Iterating 'temperatures' with for loop: ");
        for (int i = 0; i < temperatures.length; i++) {
            System.out.print(temperatures[i] + " ");
        }
        System.out.println();

        // 5.2. Using an enhanced for loop (for-each loop - simpler for just iterating
        // elements)
        System.out.print("Iterating 'fruits' with enhanced for loop: ");
        for (String item : fruits) {
            System.out.print(item + " ");
        }
        System.out.println();

        System.out.println("\n");

        // --- 6. Multidimensional Arrays (Arrays of Arrays) ---
        System.out.println("--- 6. Multidimensional Arrays ---");

        // 6.1. Two-dimensional array (matrix)
        int[][] matrix = new int[2][3]; // 2 rows, 3 columns
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;

        System.out.println("2D Array (Matrix):");
        for (int i = 0; i < matrix.length; i++) { // Iterate rows
            for (int j = 0; j < matrix[i].length; j++) { // Iterate columns
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }

        // 6.2. Jagged Arrays (rows can have different lengths)
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[2]; // First row has 2 columns
        jaggedArray[1] = new int[4]; // Second row has 4 columns
        jaggedArray[2] = new int[1]; // Third row has 1 column

        jaggedArray[0][0] = 10;
        jaggedArray[0][1] = 20;
        jaggedArray[1][0] = 30;
        jaggedArray[1][1] = 40;
        jaggedArray[1][2] = 50;
        jaggedArray[1][3] = 60;
        jaggedArray[2][0] = 70;

        System.out.println("\nJagged Array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n");

        // --- 7. Copying Arrays ---
        System.out.println("--- 7. Copying Arrays ---");

        int[] sourceArray = { 1, 2, 3, 4, 5 };
        int[] destinationArray = new int[sourceArray.length];

        // 7.1. Using a loop (manual copy)
        for (int i = 0; i < sourceArray.length; i++) {
            destinationArray[i] = sourceArray[i];
        }
        System.out.print("Copied using loop: ");
        for (int val : destinationArray) {
            System.out.print(val + " ");
        }
        System.out.println();

        // 7.2. Using System.arraycopy() (efficient for primitive arrays)
        int[] arrayCopyDestination = new int[sourceArray.length];
        System.arraycopy(sourceArray, 0, arrayCopyDestination, 0, sourceArray.length);
        System.out.print("Copied using System.arraycopy(): ");
        for (int val : arrayCopyDestination) {
            System.out.print(val + " ");
        }
        System.out.println();

        // 7.3. Using Arrays.copyOf() (creates a new array)
        int[] copiedArray = java.util.Arrays.copyOf(sourceArray, sourceArray.length);
        System.out.print("Copied using Arrays.copyOf(): ");
        for (int val : copiedArray) {
            System.out.print(val + " ");
        }
        System.out.println();

        // 7.4. Using clone() (shallow copy for objects, deep copy for primitives)
        int[] clonedArray = sourceArray.clone();
        System.out.print("Copied using clone(): ");
        for (int val : clonedArray) {
            System.out.print(val + " ");
        }
        System.out.println();

        System.out.println("\n");

        // --- 8. Arrays Class Utility Methods (java.util.Arrays) ---
        System.out.println("--- 8. Arrays Class Utility Methods ---");

        int[] unsortedArray = { 5, 2, 8, 1, 9, 3 };
        int[] arrayForComparison1 = { 1, 2, 3 };
        int[] arrayForComparison2 = { 1, 2, 3 };
        int[] arrayForComparison3 = { 3, 2, 1 };

        // 8.1. Arrays.sort(): Sorts the specified array into ascending numerical order.
        System.out.print("Original unsorted array: ");
        for (int val : unsortedArray) {
            System.out.print(val + " ");
        }
        System.out.println();
        java.util.Arrays.sort(unsortedArray);
        System.out.print("Sorted array: ");
        for (int val : unsortedArray) {
            System.out.print(val + " ");
        }
        System.out.println();

        // 8.2. Arrays.binarySearch(): Searches the specified array for the specified
        // value using the binary search algorithm.
        // The array must be sorted prior to making this call.
        int searchKey = 8;
        int foundIndex = java.util.Arrays.binarySearch(unsortedArray, searchKey);
        System.out.println("Index of " + searchKey + " in sorted array: " + foundIndex); // Expected: 4 (index of 8)

        int notFoundKey = 7;
        int notFoundIndex = java.util.Arrays.binarySearch(unsortedArray, notFoundKey);
        System.out.println("Index of " + notFoundKey + " (not found): " + notFoundIndex); // Negative value indicating
                                                                                          // insertion point

        // 8.3. Arrays.equals(): Returns true if the two specified arrays are *deeply*
        // equal to one another.
        System.out.println("arrayForComparison1 equals arrayForComparison2? "
                + java.util.Arrays.equals(arrayForComparison1, arrayForComparison2)); // true
        System.out.println("arrayForComparison1 equals arrayForComparison3? "
                + java.util.Arrays.equals(arrayForComparison1, arrayForComparison3)); // false

        // 8.4. Arrays.fill(): Assigns the specified int value to each element of the
        // specified array.
        int[] fillArray = new int[5];
        java.util.Arrays.fill(fillArray, 7);
        System.out.print("Filled array with 7s: ");
        for (int val : fillArray) {
            System.out.print(val + " ");
        }
        System.out.println();

        // 8.5. Arrays.toString(): Returns a string representation of the contents of
        // the specified array.
        // Useful for printing array contents directly without a loop.
        System.out.println("String representation of unsortedArray: " + java.util.Arrays.toString(unsortedArray));
        System.out.println("String representation of fruits: " + java.util.Arrays.toString(fruits));

        // 8.6. Arrays.deepEquals() and Arrays.deepToString() for multidimensional
        // arrays
        int[][] multiArray1 = { { 1, 2 }, { 3, 4 } };
        int[][] multiArray2 = { { 1, 2 }, { 3, 4 } };
        int[][] multiArray3 = { { 1, 2 }, { 4, 3 } };

        System.out.println(
                "multiArray1 deepEquals multiArray2? " + java.util.Arrays.deepEquals(multiArray1, multiArray2)); // true
        System.out.println(
                "multiArray1 deepEquals multiArray3? " + java.util.Arrays.deepEquals(multiArray1, multiArray3)); // false
        System.out.println("Deep String representation of multiArray1: " + java.util.Arrays.deepToString(multiArray1));

        System.out.println("\n");

        // --- 9. Array of Objects vs. Array of Primitives ---
        System.out.println("--- 9. Array of Objects vs. Array of Primitives ---");

        // Primitive arrays store actual values.
        int[] primitiveValues = { 1, 2, 3 };
        primitiveValues[0] = 100; // Changes the value directly
        System.out.println("Primitive array element changed: " + primitiveValues[0]);

        // Object arrays store references to objects.
        // Changing an element means changing the reference to a different object.
        // It does not modify the object itself (unless you call methods on the object).
        String[] objectReferences = new String[2];
        objectReferences[0] = "First";
        objectReferences[1] = "Second";
        System.out.println("Object array element (before change): " + objectReferences[0]);
        objectReferences[0] = "New First"; // Changes the reference to a new String object
        System.out.println("Object array element (after change): " + objectReferences[0]);

        // Example: Modifying an object within an array (if the object itself is
        // mutable)
        // (String is immutable, so this example uses a hypothetical mutable object)
        class MutableObject {
            public int value;

            public MutableObject(int v) {
                this.value = v;
            }

            @Override
            public String toString() {
                return "MutableObject(" + value + ")";
            }
        }
        MutableObject[] mutableObjects = new MutableObject[1];
        mutableObjects[0] = new MutableObject(10);
        System.out.println("Mutable object in array (before modification): " + mutableObjects[0]);
        mutableObjects[0].value = 20; // Modifies the object referred to by the array element
        System.out.println("Mutable object in array (after modification): " + mutableObjects[0]);

        System.out.println("\n");

        // --- 10. Common Pitfalls and Best Practices ---
        System.out.println("--- 10. Common Pitfalls and Best Practices ---");

        // 10.1. Fixed Size: Arrays cannot be resized after creation.
        // If you need a dynamic collection, use ArrayList or other Collection Framework
        // classes.
        // Example: Trying to add more elements than capacity would require creating a
        // new array.
        System.out.println("Arrays have a fixed size. Use ArrayList for dynamic collections.");

        // 10.2. ArrayIndexOutOfBoundsException:
        // Always ensure your index is within the valid range [0, array.length - 1].
        // Use loops with `array.length` to prevent this.

        // 10.3. NullPointerException with Object Arrays:
        // Elements of an object array are initialized to `null` by default.
        String[] nullableStrings = new String[2];
        // System.out.println(nullableStrings[0].length()); // This would throw
        // NullPointerException
        if (nullableStrings[0] == null) {
            System.out.println("Element at index 0 of nullableStrings is null.");
        }
        nullableStrings[0] = "NonNull";
        System.out.println("Length of nullableStrings[0] after assignment: " + nullableStrings[0].length());

        System.out.println("\n");
        System.out.println("--- End of Array Documentation Examples ---");
    }
}
