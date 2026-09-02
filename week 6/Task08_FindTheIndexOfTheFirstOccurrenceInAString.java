import java.util.*;

/**
 * Task 8: LeetCode 28 - Find the Index of the First Occurrence in a String
 * 
 * Problem Summary:
 * Given two strings haystack and needle, return the index of the first occurrence 
 * of needle in haystack, or -1 if needle is not part of haystack.
 * 
 * Approach: KMP (Knuth-Morris-Pratt) Pattern Matching Algorithm.
 * 1. Build the Longest Prefix Suffix (LPS) array for needle.
 * 2. Search needle in haystack using LPS array to skip unnecessary comparisons.
 * 
 * Time Complexity: O(N + M) where N = haystack.length(), M = needle.length().
 * Space Complexity: O(M) for LPS table.
 */
public class Task08_FindTheIndexOfTheFirstOccurrenceInAString {

    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;

        int n = haystack.length();
        int m = needle.length();

        // Step 1: Build LPS array for needle
        int[] lps = buildLPS(needle);

        // Step 2: KMP Search
        int i = 0; // index for haystack
        int j = 0; // index for needle

        while (i < n) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            }

            if (j == m) {
                return i - j; // Match found at start index (i - j)
            } else if (i < n && haystack.charAt(i) != needle.charAt(j)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }

        return -1; // Needle not found
    }

    private static int[] buildLPS(String pattern) {
        int m = pattern.length();
        int[] lps = new int[m];
        int len = 0;
        int i = 1;

        while (i < m) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps;
    }

    public static void main(String[] args) {
        String haystack1 = "sadbutsad", needle1 = "sad";
        String haystack2 = "leetcode", needle2 = "leeto";

        System.out.println("haystack=\"" + haystack1 + "\", needle=\"" + needle1 + "\" -> Index: " + strStr(haystack1, needle1)); // Expected: 0
        System.out.println("haystack=\"" + haystack2 + "\", needle=\"" + needle2 + "\" -> Index: " + strStr(haystack2, needle2)); // Expected: -1
    }
}
