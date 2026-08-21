// Problem Statement: Move Zeroes (LeetCode 283)
// Move all zeroes to the end of array while maintaining relative order of non-zero elements.
import java.util.Arrays;

public class Session_3_Task6_MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int index = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[index++] = num;
            }
        }
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        System.out.println("Original Array: " + Arrays.toString(nums));
        moveZeroes(nums);
        System.out.println("After Move Zeroes: " + Arrays.toString(nums));
    }
}
/*
OUTPUT:
Original Array: [0, 1, 0, 3, 12]
After Move Zeroes: [1, 3, 12, 0, 0]
*/
