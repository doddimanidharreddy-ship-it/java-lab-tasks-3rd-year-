import java.util.*;

/**
 * Task 3: HackerRank - The Maximum Subarray
 * 
 * Problem Summary:
 * Given an array of integers, find the maximum contiguous subarray sum 
 * AND the maximum non-contiguous (subsequence) sum.
 * 
 * Approach:
 * 1. Contiguous Subarray: Kadane's Algorithm.
 * 2. Non-contiguous Subsequence: Sum of all positive numbers. 
 *    If all numbers are negative, return the single largest element.
 * 
 * Time Complexity: O(N) single pass.
 * Space Complexity: O(1).
 */
public class Task03_TheMaximumSubarray {

    public static List<Integer> maxSubarray(List<Integer> arr) {
        int maxSubarraySum = arr.get(0);
        int currentSum = arr.get(0);

        int maxSubsequenceSum = 0;
        int maxElement = arr.get(0);
        boolean hasPositive = false;

        for (int num : arr) {
            if (num > 0) {
                maxSubsequenceSum += num;
                hasPositive = true;
            }
            maxElement = Math.max(maxElement, num);
        }

        // If no positive numbers exist, max subsequence sum is the max single negative element
        if (!hasPositive) {
            maxSubsequenceSum = maxElement;
        }

        // Kadane's algorithm for contiguous subarray
        for (int i = 1; i < arr.size(); i++) {
            currentSum = Math.max(arr.get(i), currentSum + arr.get(i));
            maxSubarraySum = Math.max(maxSubarraySum, currentSum);
        }

        return Arrays.asList(maxSubarraySum, maxSubsequenceSum);
    }

    public static void main(String[] args) {
        List<Integer> arr1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> arr2 = Arrays.asList(2, -1, 2, 3, 4, -5);
        List<Integer> arr3 = Arrays.asList(-2, -3, -1, -4, -6);

        System.out.println("Test 1: " + maxSubarray(arr1)); // Expected: [10, 10]
        System.out.println("Test 2: " + maxSubarray(arr2)); // Expected: [10, 11]
        System.out.println("Test 3: " + maxSubarray(arr3)); // Expected: [-1, -1]
    }
}
