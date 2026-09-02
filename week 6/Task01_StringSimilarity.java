import java.util.*;

/**
 * Task 1: HackerRank - String Similarity
 * 
 * Problem Summary:
 * For a string s, calculate the sum of lengths of the longest common prefixes (LCP)
 * between s and all of its suffixes (including s itself).
 * 
 * Approach: Z-Algorithm
 * The Z-array for a string s stores in Z[i] the length of the longest common prefix 
 * between s and the suffix of s starting at index i.
 * Sum = s.length() + sum(Z[1] to Z[n-1]).
 * 
 * Time Complexity: O(N) where N is length of string.
 * Space Complexity: O(N) for Z-array.
 */
public class Task01_StringSimilarity {

    public static long stringSimilarity(String s) {
        int n = s.length();
        int[] z = new int[n];
        int l = 0, r = 0;

        long totalSimilarity = n; // s compared with itself (suffix at index 0)

        for (int i = 1; i < n; i++) {
            if (i <= r) {
                z[i] = Math.min(r - i + 1, z[i - l]);
            }
            while (i + z[i] < n && s.charAt(z[i]) == s.charAt(i + z[i])) {
                z[i]++;
            }
            if (i + z[i] - 1 > r) {
                l = i;
                r = i + z[i] - 1;
            }
            totalSimilarity += z[i];
        }

        return totalSimilarity;
    }

    public static void main(String[] args) {
        String test1 = "ababaa";
        String test2 = "aa";

        System.out.println("Similarity of \"" + test1 + "\": " + stringSimilarity(test1)); // Expected: 11
        System.out.println("Similarity of \"" + test2 + "\": " + stringSimilarity(test2)); // Expected: 3
    }
}
