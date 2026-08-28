import java.util.*;

/**
 * Task 9: LeetCode 1408 - String Matching in an Array
 * 
 * Problem Summary:
 * Given an array of string words, return all strings in words that is a substring of another word in words.
 * You can return the answer in any order.
 * 
 * Approach:
 * Compare every pair of words (i, j) where i != j.
 * If words[j] contains words[i], add words[i] to the result set.
 * 
 * Time Complexity: O(N^2 * K) where N is number of words and K is average word length.
 * Space Complexity: O(N) to store result.
 */
public class Task09_StringMatchingInAnArray {

    public static List<String> stringMatching(String[] words) {
        Set<String> resultSet = new HashSet<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j && words[j].contains(words[i])) {
                    resultSet.add(words[i]);
                    break; // No need to check further if already found substring
                }
            }
        }

        return new ArrayList<>(resultSet);
    }

    public static void main(String[] args) {
        String[] words1 = {"mass", "as", "hero", "superhero"};
        String[] words2 = {"leetcode", "et", "code"};
        String[] words3 = {"blue", "green", "bu"};

        System.out.println("Test 1: " + stringMatching(words1)); // Expected: ["as", "hero"]
        System.out.println("Test 2: " + stringMatching(words2)); // Expected: ["et", "code"]
        System.out.println("Test 3: " + stringMatching(words3)); // Expected: []
    }
}
