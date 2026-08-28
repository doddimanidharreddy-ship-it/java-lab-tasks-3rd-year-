import java.util.*;

/**
 * Task 2: HackerRank - Subarray Division (The Birthday Bar)
 * 
 * Problem Summary:
 * Two children, Lily and Ron, want to share a chocolate bar.
 * The bar consists of n squares, each with an integer written on it.
 * Lily wants to find contiguous segments of length m whose sum equals d.
 * 
 * Approach: Fixed Sliding Window of size m.
 * Calculate initial sum of first m elements, then slide window right by 1,
 * adding new element and subtracting left element.
 * 
 * Time Complexity: O(N) where N is list length.
 * Space Complexity: O(1).
 */
public class Task02_SubarrayDivision {

    public static int birthday(List<Integer> s, int d, int m) {
        if (s.size() < m) return 0;

        int count = 0;
        int currentSum = 0;

        // Sum of first window of size m
        for (int i = 0; i < m; i++) {
            currentSum += s.get(i);
        }

        if (currentSum == d) count++;

        // Slide window across array
        for (int i = m; i < s.size(); i++) {
            currentSum += s.get(i) - s.get(i - m);
            if (currentSum == d) count++;
        }

        return count;
    }

    public static void main(String[] args) {
        List<Integer> s1 = Arrays.asList(2, 2, 1, 3, 2);
        int d1 = 4, m1 = 2;

        List<Integer> s2 = Arrays.asList(1, 2, 1, 3, 2);
        int d2 = 3, m2 = 2;

        List<Integer> s3 = Arrays.asList(1, 1, 1, 1, 1, 1);
        int d3 = 3, m3 = 2;

        System.out.println("Test 1: " + birthday(s1, d1, m1)); // Expected: 2 ([2,2] and [1,3])
        System.out.println("Test 2: " + birthday(s2, d2, m2)); // Expected: 2 ([1,2] and [2,1])
        System.out.println("Test 3: " + birthday(s3, d3, m3)); // Expected: 0
    }
}
