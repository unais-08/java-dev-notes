package Collections;
/*
 * ================================================================
 *  📘 Java Collections Framework — Set Interface Demonstration
 * ================================================================
 *
 *  The Set Interface:
 *  ------------------
 *  - Represents a collection of unique elements (no duplicates allowed).
 *  - Part of java.util package.
 *  - Order depends on the implementation used.
 *
 *  Common Implementations:
 *  -----------------------
 *  1. HashSet       → Unordered, fast, uses HashMap internally.
 *  2. LinkedHashSet → Maintains insertion order (slower than HashSet).
 *  3. TreeSet       → Sorted set (uses Red-Black Tree internally).
 *
 *  Real-world Example:
 *  -------------------
 *  - Storing unique student names.
 *  - Maintaining a unique list of visited cities.
 *  - Keeping sorted list of unique product codes.
 *
 * ================================================================
 */

import java.util.*;

public class SetInterfaceDemo {

    public static void main(String[] args) {

        /*
         * ================================================================
         * 🔹 1. HashSet Example — Unordered, Fast, Unique Elements
         * ================================================================
         */

        Set<String> courseSet = new HashSet<>();

        // Add elements
        courseSet.add("Data Structures");
        courseSet.add("Operating Systems");
        courseSet.add("Computer Networks");
        courseSet.add("Database Systems");
        courseSet.add("Data Structures"); // Duplicate — will be ignored

        System.out.println("HashSet (Unordered, Unique): " + courseSet);

        // Check if element exists
        System.out.println("Contains 'Operating Systems'? " + courseSet.contains("Operating Systems"));

        // Remove an element
        courseSet.remove("Database Systems");
        System.out.println("After removing 'Database Systems': " + courseSet);

        System.out.println();

        /*
         * ================================================================
         * 🔹 2. LinkedHashSet Example — Maintains Insertion Order
         * ================================================================
         */

        Set<String> citySet = new LinkedHashSet<>();

        citySet.add("Mumbai");
        citySet.add("Pune");
        citySet.add("Nashik");
        citySet.add("Nagpur");
        citySet.add("Pune"); // duplicate ignored

        System.out.println("LinkedHashSet (Ordered, Unique): " + citySet);

        // Remove first element
        citySet.remove("Mumbai");
        System.out.println("After removing 'Mumbai': " + citySet);

        // Check size
        System.out.println("Number of cities: " + citySet.size());
        System.out.println();

        /*
         * ================================================================
         * 🔹 3. TreeSet Example — Sorted Order (Natural Ordering)
         * ================================================================
         */

        Set<String> studentSet = new TreeSet<>();

        studentSet.add("Zoya");
        studentSet.add("Aman");
        studentSet.add("Rehan");
        studentSet.add("Kiran");
        studentSet.add("Aman"); // duplicate ignored

        System.out.println("TreeSet (Sorted, Unique): " + studentSet);

        // Get first and last elements
        System.out.println("First student: " + ((TreeSet<String>) studentSet).first());
        System.out.println("Last student: " + ((TreeSet<String>) studentSet).last());

        // Subset Example
        System.out.println("Students before 'R': " + ((TreeSet<String>) studentSet).headSet("R"));
        System.out.println();

        /*
         * ================================================================
         * 🔹 4. Common Set Operations
         * ================================================================
         */
        Set<String> setA = new HashSet<>(Arrays.asList("A", "B", "C", "D"));
        Set<String> setB = new HashSet<>(Arrays.asList("C", "D", "E", "F"));

        // Union
        Set<String> union = new HashSet<>(setA);
        union.addAll(setB);
        System.out.println("Union: " + union);

        // Intersection
        Set<String> intersection = new HashSet<>(setA);
        intersection.retainAll(setB);
        System.out.println("Intersection: " + intersection);

        // Difference
        Set<String> difference = new HashSet<>(setA);
        difference.removeAll(setB);
        System.out.println("Difference (A - B): " + difference);

        System.out.println();

        // Looping / Traversing
        System.out.println(courseSet.size());
        courseSet.forEach(course -> System.out.println(course));

        /*
         * ================================================================
         * 💡 Summary of Important Methods:
         * ================================================================
         *
         * add(E e) → Adds element (ignores duplicates)
         * addAll(Collection c) → Adds all elements from another collection
         * remove(Object o) → Removes element
         * contains(Object o) → Checks if element exists
         * clear() → Removes all elements
         * size() → Returns number of elements
         * isEmpty() → Checks if set is empty
         * iterator() → Returns iterator for traversal
         * retainAll() → Keeps only elements present in both sets
         *
         * ================================================================
         *
         * 🧭 When to Use:
         * --------------------------------------------------------------
         * - Use HashSet → Fastest for general use (no order needed)
         * - Use LinkedHashSet → When you care about insertion order
         * - Use TreeSet → When you need sorted elements
         *
         * ================================================================
         */
    }
}
