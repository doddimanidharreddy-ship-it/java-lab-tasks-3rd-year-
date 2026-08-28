import java.util.*;

/**
 * Task 1: LeetCode 53 - Maximum Subarray
 * 
 * Problem Summary:
 * Given an integer array nums, find the contiguous subarray (containing at least one number)
 * which has the largest sum and return its sum.
 * 
 * Approach: Kadane's Algorithm.
 * Maintain currentSum and maxSum.
 * At each index i, currentSum = max(nums[i], currentSum + nums[i]).
 * maxSum = max(maxSum, currentSum).
 * 
 * Time Complexity: O(N) where N is array length.
 * Space Complexity: O(1) auxiliary space.
 */
public class Task01_MaximumSubarray {

    public static int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] test1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] test2 = {1};
        int[] test3 = {5, 4, -1, 7, 8};

        System.out.println("Test 1: " + maxSubArray(test1)); // Expected: 6 ([4,-1,2,1])
        System.out.println("Test 2: " + maxSubArray(test2)); // Expected: 1
        System.out.println("Test 3: " + maxSubArray(test3)); // Expected: 23
    }
}
