import java.util.*;

/**
 * Task 2: LeetCode 459 - Repeated Substring Pattern
 * 
 * Problem Summary:
 * Given a string s, check if it can be constructed by taking a substring of it and 
 * appending multiple copies of the substring together.
 * 
 * Approach: KMP LPS (Longest Prefix Suffix) Array.
 * Compute the KMP failure function (LPS array) for string s.
 * Let len = s.length() and lpsLen = lps[len - 1].
 * If lpsLen > 0 and len % (len - lpsLen) == 0, then s is made of repeated substrings.
 * 
 * Time Complexity: O(N) where N is length of string s.
 * Space Complexity: O(N) for LPS array.
 */
public class Task02_RepeatedSubstringPattern {

    public static boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        int[] lps = new int[n];
        int j = 0;

        for (int i = 1; i < n; i++) {
            while (j > 0 && s.charAt(i) != s.charAt(j)) {
                j = lps[j - 1];
            }
            if (s.charAt(i) == s.charAt(j)) {
                j++;
            }
            lps[i] = j;
        }

        int lpsLen = lps[n - 1];
        return lpsLen > 0 && n % (n - lpsLen) == 0;
    }

    public static void main(String[] args) {
        String[] testCases = {
            "abab",
            "aba",
            "abcabcabcabc",
            "a"
        };

        for (String str : testCases) {
            System.out.println("\"" + str + "\" -> Repeated Pattern? " + repeatedSubstringPattern(str));
        }
    }
}
