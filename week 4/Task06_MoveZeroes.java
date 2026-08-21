import java.util.*;

/**
 * Task 6: LeetCode 283 - Move Zeroes
 * 
 * Problem Summary:
 * Given an integer array nums, move all 0's to the end of it while maintaining 
 * the relative order of the non-zero elements.
 * Do this in-place without making a copy of the array.
 * 
 * Approach: Two Pointers (Read & Write pointer).
 * Time Complexity: O(N) where N is array length.
 * Space Complexity: O(1) in-place modification.
 */
public class Task06_MoveZeroes {

    public static void moveZeroes(int[] nums) {
        int lastNonZeroFoundAt = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[lastNonZeroFoundAt];
                nums[lastNonZeroFoundAt] = nums[i];
                nums[i] = temp;
                lastNonZeroFoundAt++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {0, 1, 0, 3, 12};
        moveZeroes(nums1);
        System.out.println("Test 1: " + Arrays.toString(nums1)); // Expected: [1, 3, 12, 0, 0]

        int[] nums2 = {0};
        moveZeroes(nums2);
        System.out.println("Test 2: " + Arrays.toString(nums2)); // Expected: [0]
    }
}
