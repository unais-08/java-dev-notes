
/**
 * ============================================================================
 * Java Stream API - Documentation
 * ============================================================================
 * 
 * A Stream in Java represents a **sequence of elements** supporting **functional-style operations**.
 * Streams can process collections, arrays, or other data sources in a concise and readable way.
 * They allow filtering, mapping, reducing, and collecting data.
 * 
 * Key Points:
 * 1. Streams do **not store data**; they operate on a source.
 * 2. Streams **do not modify the source**; they produce a result.
 * 3. Streams support **intermediate operations** (lazy) and **terminal operations**.
 * 
 * ============================================================================
 * 1. Stream Creation
 * ============================================================================
 */
import java.util.*;
import java.util.stream.*;

public class StreamExamples {

        @SuppressWarnings("unused")
        public static void main(String[] args) {

                // From a Collection
                List<String> list = List.of("Alice", "Bob", "Charlie");
                Stream<String> stream1 = list.stream();

                // From an Array
                int[] arr = { 1, 2, 3, 4 };
                IntStream stream2 = Arrays.stream(arr);

                // From Values
                Stream<String> stream3 = Stream.of("x", "y", "z");

                // =========================================================================
                // 2. Intermediate Operations (Lazy)
                // =========================================================================
                // Examples: filter, map, sorted, distinct, limit, skip, peek

                List<String> fruits = List.of("apple", "banana", "mango", "apple");

                // Filter and map
                List<String> filtered = fruits.stream()
                                .filter(f -> f.startsWith("a")) // keep fruits starting with 'a'
                                .map(String::toUpperCase) // convert to uppercase
                                .toList(); // terminal operation
                System.out.println(filtered); // [APPLE, APPLE]

                // Remove duplicates and sort
                List<String> sortedUnique = fruits.stream()
                                .distinct()
                                .sorted()
                                .toList();
                System.out.println(sortedUnique); // [apple, banana, mango]

                // Peek (debug intermediate results)
                fruits.stream()
                                .filter(f -> f.length() > 4)
                                .peek(System.out::println) // prints filtered items
                                .map(String::toUpperCase)
                                .toList();

                // =========================================================================
                // 3. Terminal Operations
                // =========================================================================
                List<Integer> numbers = List.of(1, 2, 3, 4, 5);

                // forEach - print all numbers
                numbers.stream().forEach(System.out::println);

                // count - number of elements
                long count = numbers.stream().filter(n -> n % 2 == 0).count();
                System.out.println("Even numbers count: " + count); // 2

                // reduce - sum of all numbers
                int sum = numbers.stream().reduce(0, Integer::sum);
                System.out.println("Sum: " + sum); // 15

                // findFirst - get first element
                Optional<Integer> first = numbers.stream().findFirst();
                first.ifPresent(System.out::println); // 1

                // anyMatch - check if any number > 4
                boolean any = numbers.stream().anyMatch(n -> n > 4);
                System.out.println("Any number > 4? " + any); // true

                // =========================================================================
                // 4. Collectors - Collect results from streams
                // =========================================================================
                List<String> collectedList = fruits.stream()
                                .filter(f -> f.contains("a"))
                                .collect(Collectors.toList());
                System.out.println(collectedList); // [apple, banana, mango, apple]

                Set<String> collectedSet = fruits.stream()
                                .collect(Collectors.toSet());
                System.out.println(collectedSet); // [apple, banana, mango]

                String joined = fruits.stream()
                                .collect(Collectors.joining(", "));
                System.out.println(joined); // apple, banana, mango, apple

                Map<Integer, List<String>> grouped = fruits.stream()
                                .collect(Collectors.groupingBy(String::length));
                System.out.println(grouped); // {5=[apple, mango, apple], 6=[banana]}
        }
}

/**
 * ============================================================================
 * Summary
 * ============================================================================
 * 1. Streams are **functional pipelines** to process data.
 * 2. **Intermediate operations**: filter, map, sorted, distinct, peek, limit,
 * skip.
 * 3. **Terminal operations**: forEach, count, reduce, collect, findFirst,
 * anyMatch, allMatch.
 * 4. **Collectors** help to gather results: toList, toSet, joining, groupingBy,
 * partitioningBy.
 * 5. Streams are **lazy**, **non-modifying**, and can be **parallelized**.
 * ============================================================================
 */
