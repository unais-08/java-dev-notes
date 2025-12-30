package Collections;
// ===============================================
// 🌍 MAP INTERFACE IN JAVA — COMPLETE DOCUMENTATION
// ===============================================
//
// ➤ The Map interface maps unique KEYS → VALUES.
// ➤ It is not part of Collection, as it stores pairs.
// ➤ Common implementations:
//      • HashMap         → Unordered, fastest (O(1))
//      • LinkedHashMap   → Maintains insertion order
//      • TreeMap         → Sorted by key (O(log n))
//
// ===============================================
// ⚙️  Common Methods
// ===============================================
//  put(K,V)             → Add or update key-value pair
//  get(K)               → Get value by key
//  remove(K)            → Remove entry by key
//  containsKey(K)       → Check if key exists
//  containsValue(V)     → Check if value exists
//  size()               → Count entries
//  clear()              → Remove all entries
//  keySet()             → Returns Set of all keys
//  values()             → Returns Collection of all values
//  entrySet()           → Returns Set of key-value pairs
// ===============================================

import java.util.*;

public class MapInterfaceDemo {
    public static void main(String[] args) {

        // ===============================
        // 1️⃣ Basic Example using HashMap
        // ===============================
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");
        map.put(4, "JavaScript");
        map.put(2, "Kotlin"); // Key 2 updated from "Python" → "Kotlin"

        System.out.println("Map: " + map);
        System.out.println("Value for key 3 → " + map.get(3));
        System.out.println("Contains key 2? " + map.containsKey(2));
        System.out.println("Contains value 'Python'? " + map.containsValue("Python"));
        System.out.println("Map size: " + map.size());

        map.remove(4);
        System.out.println("After removing key 4: " + map);

        // ===============================
        // 2️⃣ Different Implementations
        // ===============================
        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();

        int[] keys = { 3, 1, 2 };
        for (int k : keys) {
            hashMap.put(k, "Value" + k);
            linkedHashMap.put(k, "Value" + k);
            treeMap.put(k, "Value" + k);
        }

        System.out.println("\nHashMap (unordered): " + hashMap);
        System.out.println("LinkedHashMap (insertion order): " + linkedHashMap);
        System.out.println("TreeMap (sorted by key): " + treeMap);

        // ===============================
        // 3️⃣ Traversing / Iterating a Map
        // ===============================

        System.out.println("\n➡️  Iterating Map using entrySet():");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        System.out.println("\n➡️  Iterating Map using keySet():");
        for (Integer key : map.keySet()) {
            System.out.println(key + " → " + map.get(key));
        }

        System.out.println("\n➡️  Iterating Map using forEach() (Java 8+):");
        map.forEach((key, value) -> System.out.println(key + " = " + value));

        System.out.println("\n➡️  Iterating Map using Iterator:");
        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> entry = it.next();
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        // ===============================
        // 4️⃣ Real-World Example: Word Frequency
        // ===============================
        System.out.println("\n📊 Real-World Example — Word Frequency:");
        String[] words = { "apple", "banana", "apple", "mango", "banana", "apple" };

        Map<String, Integer> freq = new HashMap<>();

        for (String w : words) {
            freq.put(w, freq.getOrDefault(w, 0) + 1);
        }

        freq.forEach((word, count) -> System.out.println(word + " → " + count));

        // ===============================
        // 5️⃣ Common Views
        // ===============================
        System.out.println("\n🔍 Map Views:");
        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: " + map.values());
        System.out.println("Entries: " + map.entrySet());

        // ===============================
        // ✅ Summary
        // ===============================
        //
        // ✔ Use HashMap when you only care about fast access.
        // ✔ Use LinkedHashMap when order of insertion matters.
        // ✔ Use TreeMap when you need sorted keys.
        //
        // Map interface is heavily used in:
        // • Frequency counting
        // • Lookup tables
        // • Caching (LRUCache using LinkedHashMap)
        // • Database-like key-value mappings
    }
}
