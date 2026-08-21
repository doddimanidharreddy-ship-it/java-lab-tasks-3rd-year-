import java.util.*;

/**
 * Task 1: LeetCode 1704 - Determine if String Halves Are Alike
 * 
 * Problem Summary:
 * You are given a string s of even length. Split s into two halves of equal length, 
 * a and b. Two strings are alike if they have the same number of vowels 
 * ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U').
 * Return true if a and b are alike, otherwise return false.
 * 
 * Time Complexity: O(N) where N is the length of string s.
 * Space Complexity: O(1) auxiliary space.
 */
public class Task01_DetermineIfStringHalvesAreAlike {

    public static boolean halvesAreAlike(String s) {
        int n = s.length();
        int count1 = 0;
        int count2 = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < n / 2; i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                count1++;
            }
            if (vowels.indexOf(s.charAt(i + n / 2)) != -1) {
                count2++;
            }
        }

        return count1 == count2;
    }

    public static void main(String[] args) {
        // Test Cases
        String test1 = "book";
        String test2 = "textbook";

        System.out.println("Test 1 (\"" + test1 + "\"): " + halvesAreAlike(test1)); // Expected: true ('o' vs 'o')
        System.out.println("Test 2 (\"" + test2 + "\"): " + halvesAreAlike(test2)); // Expected: false ('e','o' vs 'o')
    }
}
