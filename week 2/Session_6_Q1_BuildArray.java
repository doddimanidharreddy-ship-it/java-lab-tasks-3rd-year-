import java.util.Arrays;

public class Session_6_Q1_BuildArray {
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};
        int[] result = buildArray(nums);
        System.out.println("Output: " + Arrays.toString(result));
    }
}
/*
OUTPUT:
Output: [0, 1, 2, 4, 5, 3]
*/
