import java.util.*;

/**
 * Task 9: LeetCode 5 - Longest Palindromic Substring
 * 
 * Problem Summary:
 * Given a string s, return the longest palindromic substring in s.
 * 
 * Approach: Manacher's Algorithm / Expand Around Center.
 * For each index i, expand outward around center i (odd length palindrome) 
 * and around center i, i+1 (even length palindrome).
 * Manacher's Algorithm transforms s by inserting '#' separators, computing palindrome radii 
 * P[i] in linear O(N) time.
 * 
 * Time Complexity: O(N) using Manacher's Algorithm / O(N^2) Expand Around Center.
 * Space Complexity: O(N).
 */
public class Task09_LongestPalindromicSubstring {

    // Method 1: Expand Around Center (Clean, Fast & Optimal for standard tests)
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);     // Odd length palindromes
            int len2 = expandAroundCenter(s, i, i + 1); // Even length palindromes
            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    // Method 2: Manacher's Algorithm (Strict O(N) time)
    public static String longestPalindromeManacher(String s) {
        if (s == null || s.length() == 0) return "";

        StringBuilder sb = new StringBuilder("#");
        for (char c : s.toCharArray()) {
            sb.append(c).append("#");
        }
        String t = sb.toString();
        int n = t.length();
        int[] p = new int[n];
        int center = 0, right = 0;
        int maxLen = 0, maxCenter = 0;

        for (int i = 0; i < n; i++) {
            int mirror = 2 * center - i;
            if (i < right) {
                p[i] = Math.min(right - i, p[mirror]);
            }

            while (i + 1 + p[i] < n && i - 1 - p[i] >= 0 && t.charAt(i + 1 + p[i]) == t.charAt(i - 1 - p[i])) {
                p[i]++;
            }

            if (i + p[i] > right) {
                center = i;
                right = i + p[i];
            }

            if (p[i] > maxLen) {
                maxLen = p[i];
                maxCenter = i;
            }
        }

        int start = (maxCenter - maxLen) / 2;
        return s.substring(start, start + maxLen);
    }

    public static void main(String[] args) {
        String[] testCases = {
            "babad",
            "cbbd",
            "a",
            "ac"
        };

        for (String str : testCases) {
            System.out.println("\"" + str + "\" -> Longest Palindrome: \"" + longestPalindrome(str) + "\"");
        }
    }
}
