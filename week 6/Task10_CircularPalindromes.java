import java.util.*;

/**
 * Task 10: HackerRank - Circular Palindromes
 * 
 * Problem Summary:
 * A circular rotation of a string s of length n is obtained by moving its first character to the end.
 * For each of the n circular rotations of s, find the length of the longest palindromic substring.
 * 
 * Approach:
 * Expand Around Center for each rotation of string s (or over string s + s).
 * For each rotation k from 0 to n-1, compute the longest palindrome within window [k, k + n - 1].
 * 
 * Time Complexity: O(N^2) where N is length of string s.
 * Space Complexity: O(N) to store rotated string.
 */
public class Task10_CircularPalindromes {

    public static List<Integer> circularPalindromes(String s) {
        int n = s.length();
        List<Integer> result = new ArrayList<>();
        String doubleS = s + s;

        for (int k = 0; k < n; k++) {
            int maxPalindromeLen = getMaxPalindromeInWindow(doubleS, k, k + n - 1);
            result.add(maxPalindromeLen);
        }

        return result;
    }

    private static int getMaxPalindromeInWindow(String s, int winStart, int winEnd) {
        int maxLen = 1;

        for (int i = winStart; i <= winEnd; i++) {
            // Odd length expansion
            int l = i, r = i;
            while (l >= winStart && r <= winEnd && s.charAt(l) == s.charAt(r)) {
                maxLen = Math.max(maxLen, r - l + 1);
                l--;
                r++;
            }

            // Even length expansion
            l = i;
            r = i + 1;
            while (l >= winStart && r <= winEnd && s.charAt(l) == s.charAt(r)) {
                maxLen = Math.max(maxLen, r - l + 1);
                l--;
                r++;
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String test1 = "aaaa";
        String test2 = "cacbb";

        System.out.println("Circular Palindromes for \"" + test1 + "\": " + circularPalindromes(test1)); // Expected: [4, 4, 4, 4]
        System.out.println("Circular Palindromes for \"" + test2 + "\": " + circularPalindromes(test2)); // Expected: [3, 3, 3, 3, 3]
    }
}
