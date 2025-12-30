package Collections;
/*
 * ================================================================
 *  📘 Java Collections Framework — List Interface Demonstration
 * ================================================================
 *
 *  The List Interface:
 *  -------------------
 *  The `List` interface in Java is part of the java.util package.
 *  It represents an ordered collection (also known as a sequence),
 *  allowing duplicate elements and maintaining insertion order.
 *
 *  Common Implementations of List:
 *  -------------------------------
 *  1. ArrayList   → Dynamic array-based list (fast random access)
 *  2. LinkedList  → Doubly-linked list (fast insertion/deletion)
 *  3. Vector      → Synchronized dynamic array (thread-safe)
 *  4. Stack       → A subclass of Vector (LIFO: Last-In-First-Out)
 *
 *  This example demonstrates how to:
 *   ✅ Declare and initialize different List types
 *   ✅ Perform CRUD operations (Create, Read, Update, Delete)
 *   ✅ Work with the Stack class (push, pop, peek, search)
 *
 * ================================================================
 */

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Stack;

public class ListInterfaceDemo {

    public static void main(String[] args) {

        /*
         * ================================================================
         * 🔹 STEP 1: Declare Lists using different Implementations
         */

        List<String> listOfNames = new ArrayList<>(); // Backed by a dynamic array
        List<String> listOfCountries = new Vector<>(); // Thread-safe dynamic array
        List<String> listOfCities = new LinkedList<>(); // Doubly-linked list

        // Stack is a subclass of Vector (LIFO structure)
        Stack<String> stackOfColors = new Stack<>();

        /*
         * ================================================================
         * 🔹 STEP 2: Add Initial Data
         * ================================================================
         */

        // ArrayList
        listOfNames.add("Alice");
        listOfNames.add("Bob");
        listOfNames.add("Charlie");

        // Vector
        listOfCountries.add("USA");
        listOfCountries.add("Canada");
        listOfCountries.add("Mexico");

        // LinkedList
        listOfCities.add("New York");
        listOfCities.add("Los Angeles");
        listOfCities.add("Chicago");

        // Stack (using push() for LIFO behavior)
        stackOfColors.push("Red");
        stackOfColors.push("Green");
        stackOfColors.push("Blue");

        /*
         * ================================================================
         * 🔹 STEP 3: Perform Common Operations
         * ================================================================
         */

        // ArrayList operations
        listOfNames.add("John"); // Add new element
        listOfNames.set(0, "Hamid"); // Update element at index 0

        // Vector operations
        listOfCountries.add("Saudi Arabia");
        listOfCountries.set(1, "New Zealand");

        // LinkedList operations
        listOfCities.add("Pune"); // Appends at end
        listOfCities.clear();
        // listOfCities.poll();
        // Stack operations
        stackOfColors.push("Magenta"); // Push new color on top
        // stackOfColors.pop(); // Removes top element
        // stackOfColors.peek(); // Returns top element without removing
        // stackOfColors.clear(); // Clears entire stack
        // stackOfColors.empty(); // Checks if stack is empty
        // stackOfColors.search("Green"); // Returns 1-based position from top

        /*
         * ================================================================
         * 🔹 STEP 4: Display Results
         * ================================================================
         */

        System.out.println();
        System.out.println("ArrayList of Names     → " + listOfNames);
        System.out.println("Vector of Countries    → " + listOfCountries);
        System.out.println("LinkedList of Cities   → " + listOfCities);
        System.out.println("Stack of Colors (LIFO) → " + stackOfColors);
        System.out.println();

        /*
         * ================================================================
         * 💡 Summary:
         * ================================================================
         * - ArrayList: Best for frequent read/access operations.
         * - LinkedList: Best for frequent insert/delete operations.
         * - Vector: Legacy thread-safe ArrayList.
         * - Stack: Special Vector for LIFO operations.
         *
         * All these classes implement the List interface, meaning:
         * - They maintain insertion order.
         * - They allow duplicate elements.
         * - They provide positional access using index.
         * ================================================================
         */
    }
}
