import java.util.*;

/**
 * Task 8: LeetCode 890 - Find and Replace Pattern
 * 
 * Problem Summary:
 * Given a list of strings words and a string pattern, return a list of words 
 * that match the pattern (i.e. there exists a bijection/isomorphism between pattern and word characters).
 * 
 * Approach:
 * For each word, check if word.length() == pattern.length() and both mappings are 1-to-1:
 * word[i] -> pattern[i] AND pattern[i] -> word[i].
 * 
 * Time Complexity: O(N * K) where N is number of words and K is length of pattern.
 * Space Complexity: O(K) for character mapping arrays.
 */
public class Task08_FindAndReplacePattern {

    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();

        for (String word : words) {
            if (matchesPattern(word, pattern)) {
                result.add(word);
            }
        }

        return result;
    }

    private static boolean matchesPattern(String word, String pattern) {
        if (word.length() != pattern.length()) return false;

        int[] mapWtoP = new int[256];
        int[] mapPtoW = new int[256];
        Arrays.fill(mapWtoP, -1);
        Arrays.fill(mapPtoW, -1);

        for (int i = 0; i < word.length(); i++) {
            char w = word.charAt(i);
            char p = pattern.charAt(i);

            if (mapWtoP[w] == -1 && mapPtoW[p] == -1) {
                mapWtoP[w] = p;
                mapPtoW[p] = w;
            } else if (mapWtoP[w] != p || mapPtoW[p] != w) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String[] words = {"abc", "deq", "mee", "aqq", "dkd", "ccc"};
        String pattern = "abb";

        List<String> matchingWords = findAndReplacePattern(words, pattern);
        System.out.println("Pattern: \"" + pattern + "\" -> Matching Words: " + matchingWords);
        // Expected: ["mee", "aqq"]
    }
}
