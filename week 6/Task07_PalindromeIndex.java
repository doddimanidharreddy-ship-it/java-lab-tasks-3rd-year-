import java.util.*;

/**
 * Task 7: HackerRank - Palindrome Index
 * 
 * Problem Summary:
 * Given a string of lowercase letters, determine the index of a character that 
 * can be removed to make the string a palindrome. 
 * If the string is already a palindrome, return -1.
 * 
 * Approach: Two Pointers (left = 0, right = s.length() - 1).
 * Iterate while left < right:
 * If s.charAt(left) != s.charAt(right):
 *   Check if removing left character (checking s[left+1 ... right]) makes palindrome -> return left.
 *   Check if removing right character (checking s[left ... right-1]) makes palindrome -> return right.
 * If no mismatch, string is already a palindrome -> return -1.
 * 
 * Time Complexity: O(N) where N is length of string.
 * Space Complexity: O(1).
 */
public class Task07_PalindromeIndex {

    public static int palindromeIndex(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                if (isPalindrome(s, left + 1, right)) {
                    return left;
                }
                if (isPalindrome(s, left, right - 1)) {
                    return right;
                }
                return -1; // If neither removal yields a palindrome
            }
            left++;
            right--;
        }

        return -1; // Already a palindrome
    }

    private static boolean isPalindrome(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] testCases = {
            "aaab",
            "baa",
            "aaa",
            "racecar",
            "quyjjdcgswpsvcrssypidboupfwbbznejmoxkgwaawgkoxmjenzbbwfpbuobdipyssrcvspwsgcdjjyuq"
        };

        for (String str : testCases) {
            System.out.println("\"" + str + "\" -> Remove index: " + palindromeIndex(str));
        }
    }
}
