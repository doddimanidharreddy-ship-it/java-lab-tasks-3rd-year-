import java.util.*;

/**
 * Task 6: HackerRank - Alternating Characters
 * 
 * Problem Summary:
 * You are given a string containing characters 'A' and 'B' only. 
 * Your task is to change it into a string such that there are no matching adjacent characters. 
 * Find the minimum number of character deletions required.
 * 
 * Approach:
 * Iterate through string and compare each character with the previous character.
 * If s.charAt(i) == s.charAt(i - 1), increment deletions count.
 * 
 * Time Complexity: O(N) where N is length of string.
 * Space Complexity: O(1).
 */
public class Task06_AlternatingCharacters {

    public static int alternatingCharacters(String s) {
        int deletions = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                deletions++;
            }
        }

        return deletions;
    }

    public static void main(String[] args) {
        String[] testCases = {
            "AAAA",
            "BBBBB",
            "ABABABAB",
            "BABABA",
            "AAABBB"
        };

        for (String str : testCases) {
            System.out.println(str + " -> Deletions needed: " + alternatingCharacters(str));
        }
    }
}
