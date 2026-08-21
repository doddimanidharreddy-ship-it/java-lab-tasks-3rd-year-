// Problem Statement: Contains Duplicate (LeetCode 217)
// Given an integer array nums, return true if any value appears at least twice in the array.
import java.util.HashSet;
import java.util.Set;

public class Session_2_Task4_ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 3, 4};
        System.out.println("nums1 contains duplicate? " + containsDuplicate(nums1));
        System.out.println("nums2 contains duplicate? " + containsDuplicate(nums2));
    }
}
/*
OUTPUT:
nums1 contains duplicate? true
nums2 contains duplicate? false
*/
