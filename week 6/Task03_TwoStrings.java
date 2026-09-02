import java.util.*;

/**
 * Task 3: HackerRank - Two Strings
 * 
 * Problem Summary:
 * Given two strings s1 and s2, determine if they share a common substring.
 * A substring may be as small as a single character.
 * Return "YES" if they share a common substring, else "NO".
 * 
 * Approach:
 * If two strings share any substring, they must share at least one character.
 * Store character occurrences of s1 in a boolean array/set, then check s2.
 * 
 * Time Complexity: O(|s1| + |s2|).
 * Space Complexity: O(1) using fixed size boolean[26] array.
 */
public class Task03_TwoStrings {

    public static String twoStrings(String s1, String s2) {
        boolean[] present = new boolean[26];

        for (int i = 0; i < s1.length(); i++) {
            present[s1.charAt(i) - 'a'] = true;
        }

        for (int i = 0; i < s2.length(); i++) {
            if (present[s2.charAt(i) - 'a']) {
                return "YES";
            }
        }

        return "NO";
    }

    public static void main(String[] args) {
        String s1 = "hello", s2 = "world";
        String s3 = "hi", s4 = "world";

        System.out.println("\"" + s1 + "\" & \"" + s2 + "\" -> " + twoStrings(s1, s2)); // Expected: YES ('l','o')
        System.out.println("\"" + s3 + "\" & \"" + s4 + "\" -> " + twoStrings(s3, s4)); // Expected: NO
    }
}
