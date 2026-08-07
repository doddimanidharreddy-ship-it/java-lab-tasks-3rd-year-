import java.util.Arrays;

public class Session_14_Q1_LargestNumber {
    public static String largestNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strs, (a, b) -> (b + a).compareTo(a + b));

        if (strs[0].equals("0")) return "0";

        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] nums = {3, 30, 34, 5, 9};
        String result = largestNumber(nums);
        System.out.println("Largest Formed Number: " + result);
    }
}
/*
OUTPUT:
Largest Formed Number: 9534330
*/
