/**
 * File: ArraysInJava.java
 *
 * Description:
 * Complete revision notes for Arrays in Java.
 *
 * Topics Covered:
 * --------------------------------------------------
 * 1. Array Declaration & Creation
 * 2. Array Initialization
 * 3. Accessing Elements
 * 4. Array Length
 * 5. Iterating Arrays
 * 6. Multidimensional Arrays
 * 7. Copying Arrays
 * 8. Arrays Utility Methods
 * 9. Primitive vs Object Arrays
 * 10. Best Practices & Common Mistakes
 *
 * Important:
 * --------------------------------------------------
 * - Arrays are fixed-size collections
 * - Store elements of same data type
 * - Use zero-based indexing
 */

public class ArraysInJava {

    public static void main(String[] args) {

        // ==================================================
        // 1. ARRAY DECLARATION & CREATION
        // ==================================================

        System.out.println(
                "=== 1. Array Declaration & Creation ===");

        // --------------------------------------------------
        // 1.1 Declaration
        // --------------------------------------------------

        /*
         * Declares an array reference.
         * No memory allocated yet.
         */

        int[] intArrayDeclaration;

        // Valid but not recommended:
        // int intArrayDeclaration[];

        // --------------------------------------------------
        // 1.2 Instantiation
        // --------------------------------------------------

        /*
         * Creates actual array in memory.
         * Elements get default values.
         */

        intArrayDeclaration = new int[5];

        System.out.println(
                "Created integer array of size 5");

        System.out.println(
                "Default first value: "
                        + intArrayDeclaration[0]);

        // --------------------------------------------------
        // 1.3 Declaration + Instantiation Together
        // --------------------------------------------------

        String[] stringArray = new String[3];

        System.out.println(
                "Created String array of size 3");

        System.out.println(
                "Default first value: "
                        + stringArray[0]);

        System.out.println();

        // ==================================================
        // 2. ARRAY INITIALIZATION
        // ==================================================

        System.out.println(
                "=== 2. Array Initialization ===");

        // --------------------------------------------------
        // 2.1 Assigning Values Manually
        // --------------------------------------------------

        int[] numbers = new int[4];

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;

        System.out.print("numbers array: ");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        // --------------------------------------------------
        // 2.2 Array Literal Initialization
        // --------------------------------------------------

        /*
         * Size automatically determined.
         */

        double[] temperatures =
                {25.5, 28.0, 22.3, 30.1};

        System.out.print("temperatures array: ");

        for (double temp : temperatures) {
            System.out.print(temp + " ");
        }

        System.out.println();

        // --------------------------------------------------
        // 2.3 Object Array Initialization
        // --------------------------------------------------

        String[] fruits =
                {"Apple", "Banana", "Cherry"};

        System.out.print("fruits array: ");

        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }

        System.out.println("\n");

        // ==================================================
        // 3. ACCESSING ARRAY ELEMENTS
        // ==================================================

        System.out.println(
                "=== 3. Accessing Array Elements ===");

        /*
         * Arrays use zero-based indexing.
         *
         * First Index  -> 0
         * Last Index   -> length - 1
         */

        System.out.println(
                "First fruit: "
                        + fruits[0]);

        System.out.println(
                "Last fruit: "
                        + fruits[fruits.length - 1]);

        // --------------------------------------------------
        // ArrayIndexOutOfBoundsException
        // --------------------------------------------------

        try {

            System.out.println(
                    "Trying to access invalid index 5");

            // fruits[5]

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println(
                    "Caught Exception: "
                            + e.getMessage());
        }

        System.out.println();

        // ==================================================
        // 4. ARRAY LENGTH
        // ==================================================

        System.out.println(
                "=== 4. Array Length ===");

        /*
         * length property gives total elements.
         */

        System.out.println(
                "numbers length: "
                        + numbers.length);

        System.out.println(
                "fruits length: "
                        + fruits.length);

        System.out.println();

        // ==================================================
        // 5. ITERATING ARRAYS
        // ==================================================

        System.out.println(
                "=== 5. Iterating Arrays ===");

        // --------------------------------------------------
        // 5.1 Traditional for loop
        // --------------------------------------------------

        /*
         * Useful when index is needed.
         */

        System.out.print(
                "Using traditional for loop: ");

        for (int i = 0; i < temperatures.length; i++) {

            System.out.print(
                    temperatures[i] + " ");
        }

        System.out.println();

        // --------------------------------------------------
        // 5.2 Enhanced for loop (for-each)
        // --------------------------------------------------

        /*
         * Simpler for normal iteration.
         */

        System.out.print(
                "Using enhanced for loop: ");

        for (String item : fruits) {

            System.out.print(item + " ");
        }

        System.out.println("\n");

        // ==================================================
        // 6. MULTIDIMENSIONAL ARRAYS
        // ==================================================

        System.out.println(
                "=== 6. Multidimensional Arrays ===");

        // --------------------------------------------------
        // 6.1 Two-Dimensional Array
        // --------------------------------------------------

        /*
         * Matrix format:
         * rows × columns
         */

        int[][] matrix = new int[2][3];

        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;

        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;

        System.out.println("2D Matrix:");

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0;
                 j < matrix[i].length;
                 j++) {

                System.out.print(
                        matrix[i][j] + " ");
            }

            System.out.println();
        }

        // --------------------------------------------------
        // 6.2 Jagged Array
        // --------------------------------------------------

        /*
         * Rows can have different lengths.
         */

        int[][] jaggedArray = new int[3][];

        jaggedArray[0] = new int[2];
        jaggedArray[1] = new int[4];
        jaggedArray[2] = new int[1];

        jaggedArray[0][0] = 10;
        jaggedArray[0][1] = 20;

        jaggedArray[1][0] = 30;
        jaggedArray[1][1] = 40;
        jaggedArray[1][2] = 50;
        jaggedArray[1][3] = 60;

        jaggedArray[2][0] = 70;

        System.out.println("\nJagged Array:");

        for (int i = 0;
             i < jaggedArray.length;
             i++) {

            for (int j = 0;
                 j < jaggedArray[i].length;
                 j++) {

                System.out.print(
                        jaggedArray[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println();

        // ==================================================
        // 7. COPYING ARRAYS
        // ==================================================

        System.out.println(
                "=== 7. Copying Arrays ===");

        int[] sourceArray =
                {1, 2, 3, 4, 5};

        int[] destinationArray =
                new int[sourceArray.length];

        // --------------------------------------------------
        // 7.1 Manual Copy using Loop
        // --------------------------------------------------

        for (int i = 0;
             i < sourceArray.length;
             i++) {

            destinationArray[i] =
                    sourceArray[i];
        }

        System.out.print("Manual Copy: ");

        for (int val : destinationArray) {
            System.out.print(val + " ");
        }

        System.out.println();

        // --------------------------------------------------
        // 7.2 System.arraycopy()
        // --------------------------------------------------

        int[] arrayCopyDestination =
                new int[sourceArray.length];

        System.arraycopy(
                sourceArray,
                0,
                arrayCopyDestination,
                0,
                sourceArray.length);

        System.out.print("System.arraycopy(): ");

        for (int val : arrayCopyDestination) {
            System.out.print(val + " ");
        }

        System.out.println();

        // --------------------------------------------------
        // 7.3 Arrays.copyOf()
        // --------------------------------------------------

        int[] copiedArray =
                java.util.Arrays.copyOf(
                        sourceArray,
                        sourceArray.length);

        System.out.print("Arrays.copyOf(): ");

        for (int val : copiedArray) {
            System.out.print(val + " ");
        }

        System.out.println();

        // --------------------------------------------------
        // 7.4 clone()
        // --------------------------------------------------

        int[] clonedArray =
                sourceArray.clone();

        System.out.print("clone(): ");

        for (int val : clonedArray) {
            System.out.print(val + " ");
        }

        System.out.println("\n");

        // ==================================================
        // 8. ARRAYS UTILITY METHODS
        // ==================================================

        System.out.println(
                "=== 8. Arrays Utility Methods ===");

        int[] unsortedArray =
                {5, 2, 8, 1, 9, 3};

        // --------------------------------------------------
        // 8.1 Arrays.sort()
        // --------------------------------------------------

        System.out.print("Original Array: ");

        for (int val : unsortedArray) {
            System.out.print(val + " ");
        }

        System.out.println();

        java.util.Arrays.sort(unsortedArray);

        System.out.print("Sorted Array: ");

        for (int val : unsortedArray) {
            System.out.print(val + " ");
        }

        System.out.println();

        // --------------------------------------------------
        // 8.2 Arrays.binarySearch()
        // --------------------------------------------------

        int searchKey = 8;

        int foundIndex =
                java.util.Arrays.binarySearch(
                        unsortedArray,
                        searchKey);

        System.out.println(
                "Index of 8: "
                        + foundIndex);

        // --------------------------------------------------
        // 8.3 Arrays.equals()
        // --------------------------------------------------

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {3, 2, 1};

        System.out.println(
                "arr1 equals arr2: "
                        + java.util.Arrays.equals(arr1, arr2));

        System.out.println(
                "arr1 equals arr3: "
                        + java.util.Arrays.equals(arr1, arr3));

        // --------------------------------------------------
        // 8.4 Arrays.fill()
        // --------------------------------------------------

        int[] fillArray = new int[5];

        java.util.Arrays.fill(fillArray, 7);

        System.out.print("Filled Array: ");

        for (int val : fillArray) {
            System.out.print(val + " ");
        }

        System.out.println();

        // --------------------------------------------------
        // 8.5 Arrays.toString()
        // --------------------------------------------------

        System.out.println(
                "toString(): "
                        + java.util.Arrays.toString(
                        unsortedArray));

        // --------------------------------------------------
        // 8.6 deepEquals() & deepToString()
        // --------------------------------------------------

        int[][] multiArray1 =
                {{1, 2}, {3, 4}};

        int[][] multiArray2 =
                {{1, 2}, {3, 4}};

        System.out.println(
                "deepEquals(): "
                        + java.util.Arrays.deepEquals(
                        multiArray1,
                        multiArray2));

        System.out.println(
                "deepToString(): "
                        + java.util.Arrays.deepToString(
                        multiArray1));

        System.out.println();

        // ==================================================
        // 9. PRIMITIVE VS OBJECT ARRAYS
        // ==================================================

        System.out.println(
                "=== 9. Primitive vs Object Arrays ===");

        // --------------------------------------------------
        // Primitive Array
        // --------------------------------------------------

        int[] primitiveValues =
                {1, 2, 3};

        primitiveValues[0] = 100;

        System.out.println(
                "Primitive value changed: "
                        + primitiveValues[0]);

        // --------------------------------------------------
        // Object Array
        // --------------------------------------------------

        String[] objectReferences =
                new String[2];

        objectReferences[0] = "First";
        objectReferences[1] = "Second";

        System.out.println(
                "Before change: "
                        + objectReferences[0]);

        objectReferences[0] =
                "New First";

        System.out.println(
                "After change: "
                        + objectReferences[0]);

        // --------------------------------------------------
        // Mutable Object Example
        // --------------------------------------------------

        class MutableObject {

            public int value;

            public MutableObject(int v) {
                this.value = v;
            }

            @Override
            public String toString() {
                return "MutableObject("
                        + value + ")";
            }
        }

        MutableObject[] mutableObjects =
                new MutableObject[1];

        mutableObjects[0] =
                new MutableObject(10);

        System.out.println(
                "Before modification: "
                        + mutableObjects[0]);

        mutableObjects[0].value = 20;

        System.out.println(
                "After modification: "
                        + mutableObjects[0]);

        System.out.println();

        // ==================================================
        // 10. BEST PRACTICES & COMMON MISTAKES
        // ==================================================

        System.out.println(
                "=== 10. Best Practices ===");

        // --------------------------------------------------
        // Fixed Size
        // --------------------------------------------------

        System.out.println(
                "Arrays have fixed size");

        System.out.println(
                "Use ArrayList for dynamic size");

        // --------------------------------------------------
        // NullPointerException
        // --------------------------------------------------

        String[] nullableStrings =
                new String[2];

        if (nullableStrings[0] == null) {

            System.out.println(
                    "Element is null");
        }

        nullableStrings[0] = "NonNull";

        System.out.println(
                "Length after assignment: "
                        + nullableStrings[0].length());

        System.out.println();

        // ==================================================
        // END
        // ==================================================

        System.out.println(
                "=== End of Array Revision Notes ===");
    }
}