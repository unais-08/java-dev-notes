package Collections;
/*
 * ================================================================
 *  📘 Java Collections Framework — Queue & Deque Demonstration
 * ================================================================
 *
 *  Interfaces Covered:
 *  -------------------
 *  1. Queue<E>          → FIFO (First-In-First-Out) data structure
 *  2. Deque<E>          → Double-ended queue (supports insertion/removal at both ends)
 *  3. PriorityQueue<E>  → Queue that orders elements by natural ordering or comparator
 *
 *  Implementations:
 *  ----------------
 *  - LinkedList       → Implements Queue & Deque
 *  - ArrayDeque       → Implements Deque (faster than LinkedList)
 *  - PriorityQueue    → Implements Queue (priority-based ordering)
 *
 *  Methods Demonstrated:
 *  ---------------------
 *  Queue/Deque:
 *      offer(), poll(), peek(), addFirst(), addLast(), push(), pop()
 *      peekFirst(), peekLast(), removeFirst(), removeLast()
 *
 * ================================================================
 */

import java.util.*;

public class QueueInterfaceDemo {

    public static void main(String[] args) {

        /*
         * ================================================================
         * 🔹 1. FIFO Queue using LinkedList
         * ================================================================
         */
        Queue<String> collegeQueue = new LinkedList<>();

        // Adding elements to the queue (FIFO)
        collegeQueue.offer("KCE's COEM");
        collegeQueue.offer("SSBT's COEM");
        collegeQueue.offer("Godavari COEM");
        collegeQueue.offer("Raisoni COEM");

        System.out.println("College Queue (FIFO): " + collegeQueue);

        // Removing the head of the queue
        String removedCollege = collegeQueue.poll(); // removes "KCE's COEM"
        System.out.println("Removed from College Queue: " + removedCollege);
        System.out.println("College Queue after poll: " + collegeQueue);
        System.out.println();

        /*
         * ================================================================
         * 🔹 2. Double-Ended Queue (Deque) using LinkedList
         * ================================================================
         */
        Deque<String> stateDeque = new LinkedList<>();

        // Add at both ends
        stateDeque.offerFirst("Maharashtra"); // adds at head
        stateDeque.offerFirst("Gujrat");
        stateDeque.offerFirst("TamilNadu");
        stateDeque.offerLast("Goa"); // adds at tail

        System.out.println("State Deque: " + stateDeque);
        System.out.println("Peek First: " + stateDeque.peekFirst());
        System.out.println("Peek Last: " + stateDeque.peekLast());

        // Remove elements from both ends
        stateDeque.pollFirst(); // removes "TamilNadu"
        stateDeque.pollLast(); // removes "Goa"

        System.out.println("State Deque after removing first & last: " + stateDeque);
        System.out.println();

        /*
         * ================================================================
         * 🔹 3. Bank Queue using ArrayDeque (FIFO)
         * ================================================================
         */
        Deque<String> bankQueue = new ArrayDeque<>();

        bankQueue.offer("John");
        bankQueue.offer("David");
        bankQueue.offer("Harry");

        System.out.println("Bank Queue (ArrayDeque FIFO): " + bankQueue);

        // Serve the first customer
        String servedCustomer = bankQueue.poll(); // removes "John"
        System.out.println("Served Customer: " + servedCustomer);
        System.out.println("Bank Queue after serving one: " + bankQueue);
        System.out.println();

        /*
         * ================================================================
         * 🔹 4. Stack using ArrayDeque (LIFO)
         * ================================================================
         */
        Deque<Integer> pinStack = new ArrayDeque<>();

        // Push elements onto stack
        pinStack.push(425001);
        pinStack.push(410002);
        pinStack.push(410011);

        System.out.println("PIN Stack (LIFO): " + pinStack);

        // Pop elements from stack
        System.out.println("Popped: " + pinStack.pop()); // removes 410011
        System.out.println("Popped: " + pinStack.pop()); // removes 410002
        System.out.println("Stack after popping: " + pinStack);
        System.out.println();

        /*
         * ================================================================
         * 🔹 5. PriorityQueue Example (min-heap by default)
         * ================================================================
         */
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Adding elements (automatically sorted)
        pq.add(30);
        pq.add(10);
        pq.add(20);
        pq.add(50);
        pq.add(80);
        pq.add(5);
        pq.add(500);

        System.out.println("PriorityQueue: " + pq);

        // Peek returns the smallest element
        System.out.println("Peek (smallest element): " + pq.peek());

        // Poll removes the smallest element
        System.out.println("Poll (removes smallest): " + pq.poll());
        System.out.println("PriorityQueue after poll: " + pq);
        System.out.println();

        /*
         * ================================================================
         * 🔹 Summary of Methods:
         * ================================================================
         *
         * Queue (FIFO):
         * - offer(e): Add element at tail
         * - poll(): Remove head (returns null if empty)
         * - peek(): Return head without removing
         *
         * Deque (Double-ended Queue):
         * - offerFirst(e) / offerLast(e)
         * - pollFirst() / pollLast()
         * - peekFirst() / peekLast()
         * - push(e) / pop(): Treat deque as LIFO stack
         *
         * PriorityQueue:
         * - add(e) / offer(e): Add element based on priority
         * - poll(): Remove element with highest priority (smallest by default)
         * - peek(): Return element with highest priority
         *
         * ================================================================
         */
    }
}
