import java.util.*;
public class week5_task5_TheMaximumSubarray {
    public static List<Integer> maxSubarray(List<Integer> arr) {
        int maxSubarraySum = arr.get(0), currentSum = arr.get(0);
        int maxSubsequenceSum = 0, maxElement = arr.get(0);
        boolean hasPositive = false;
        for (int num : arr) {
            if (num > 0) { maxSubsequenceSum += num; hasPositive = true; }
            maxElement = Math.max(maxElement, num);
        }
        if (!hasPositive) maxSubsequenceSum = maxElement;
        for (int i = 1; i < arr.size(); i++) {
            currentSum = Math.max(arr.get(i), currentSum + arr.get(i));
            maxSubarraySum = Math.max(maxSubarraySum, currentSum);
        }
        return Arrays.asList(maxSubarraySum, maxSubsequenceSum);
    }
    public static void main(String[] args) {
        System.out.println(maxSubarray(Arrays.asList(1, 2, 3, 4)));
    }
}