import java.util.*;

/**
 * Task 4: LeetCode 918 - Maximum Sum Circular Subarray
 * 
 * Problem Summary:
 * Given a circular integer array nums of length n, return the maximum possible sum 
 * of a non-empty subarray of nums.
 * 
 * Approach:
 * A circular subarray sum can be either:
 * Case 1: Non-wrapped (Standard Kadane's Max Subarray Sum).
 * Case 2: Wrapped (Total Array Sum - Standard Kadane's Min Subarray Sum).
 * 
 * Edge Case: If all elements are negative, maxSubarraySum will be negative,
 * and totalSum == minSubarraySum. In this case, return maxSubarraySum.
 * 
 * Time Complexity: O(N) single pass.
 * Space Complexity: O(1).
 */
public class Task04_MaximumSumCircularSubarray {

    public static int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        
        int maxSubarraySum = nums[0];
        int currentMax = 0;
        
        int minSubarraySum = nums[0];
        int currentMin = 0;

        for (int num : nums) {
            totalSum += num;

            // Kadane's for Max Subarray
            currentMax = Math.max(num, currentMax + num);
            maxSubarraySum = Math.max(maxSubarraySum, currentMax);

            // Kadane's for Min Subarray
            currentMin = Math.min(num, currentMin + num);
            minSubarraySum = Math.min(minSubarraySum, currentMin);
        }

        // If all numbers are negative
        if (maxSubarraySum < 0) {
            return maxSubarraySum;
        }

        return Math.max(maxSubarraySum, totalSum - minSubarraySum);
    }

    public static void main(String[] args) {
        int[] test1 = {1, -2, 3, -2};
        int[] test2 = {5, -3, 5};
        int[] test3 = {-3, -2, -3};

        System.out.println("Test 1: " + maxSubarraySumCircular(test1)); // Expected: 3
        System.out.println("Test 2: " + maxSubarraySumCircular(test2)); // Expected: 10
        System.out.println("Test 3: " + maxSubarraySumCircular(test3)); // Expected: -2
    }
}
