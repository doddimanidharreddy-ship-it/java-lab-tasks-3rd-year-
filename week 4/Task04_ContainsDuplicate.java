import java.util.*;

/**
 * Task 4: LeetCode 217 - Contains Duplicate
 * 
 * Problem Summary:
 * Given an integer array nums, return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 * 
 * Approach: HashSet lookup for O(1) average time insert & check.
 * Time Complexity: O(N) where N is array length.
 * Space Complexity: O(N) to store elements in HashSet.
 */
public class Task04_ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (!seen.add(num)) {
                return true; // Duplicate found
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 1};
        int[] test2 = {1, 2, 3, 4};
        int[] test3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        System.out.println("Test 1: " + containsDuplicate(test1)); // Expected: true
        System.out.println("Test 2: " + containsDuplicate(test2)); // Expected: false
        System.out.println("Test 3: " + containsDuplicate(test3)); // Expected: true
    }
}
