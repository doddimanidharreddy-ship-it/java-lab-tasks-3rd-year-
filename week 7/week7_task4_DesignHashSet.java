import java.util.*;

/**
 * Task 5: LeetCode 705 - Design HashSet
 * 
 * Problem Summary:
 * Design a HashSet without using any built-in hash table libraries.
 * Implement add(key), remove(key), and contains(key).
 * 
 * Approach:
 * Boolean lookup table or array of buckets for fast O(1) operations.
 * 
 * Time Complexity: O(1) for add, remove, and contains.
 * Space Complexity: O(N) where N is maximum key range (10^6).
 */
public class week7_task4_DesignHashSet {

    static class MyHashSet {
        private boolean[] set;

        public MyHashSet() {
            set = new boolean[1000001];
        }

        public void add(int key) {
            set[key] = true;
        }

        public void remove(int key) {
            set[key] = false;
        }

        public boolean contains(int key) {
            return set[key];
        }
    }

    public static void main(String[] args) {
        MyHashSet hs = new MyHashSet();
        hs.add(1);
        hs.add(2);
        System.out.println("Contains 1? " + hs.contains(1)); // Expected: true
        System.out.println("Contains 3? " + hs.contains(3)); // Expected: false
        hs.add(2);
        System.out.println("Contains 2? " + hs.contains(2)); // Expected: true
        hs.remove(2);
        System.out.println("Contains 2? " + hs.contains(2)); // Expected: false
    }
}

