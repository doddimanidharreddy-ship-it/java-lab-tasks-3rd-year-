import java.util.*;

/**
 * Task 10: GeeksforGeeks - Naive Algorithm for Pattern Searching
 * 
 * Problem Summary:
 * Given a text txt and a pattern pat, find all occurrences of pat in txt.
 * 
 * Approach: Naive Pattern Searching Algorithm.
 * Slide pattern pat over text txt one character at a time.
 * For each position i in txt, check if pat matches txt[i ... i + m - 1].
 * 
 * Time Complexity: O((N - M + 1) * M) where N is txt length and M is pat length.
 * Space Complexity: O(1) auxiliary space.
 */
public class Task10_NaivePatternSearching {

    public static List<Integer> searchPattern(String txt, String pat) {
        List<Integer> resultIndices = new ArrayList<>();
        int n = txt.length();
        int m = pat.length();

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (txt.charAt(i + j) != pat.charAt(j)) {
                    break;
                }
            }

            // If pattern matched fully
            if (j == m) {
                resultIndices.add(i);
            }
        }

        return resultIndices;
    }

    public static void main(String[] args) {
        String txt1 = "AABAACAADAABAABA";
        String pat1 = "AABA";

        String txt2 = "THIS IS A TEST TEXT";
        String pat2 = "TEST";

        System.out.println("Text: \"" + txt1 + "\", Pattern: \"" + pat1 + "\"");
        System.out.println("Pattern found at index positions: " + searchPattern(txt1, pat1));

        System.out.println("\nText: \"" + txt2 + "\", Pattern: \"" + pat2 + "\"");
        System.out.println("Pattern found at index positions: " + searchPattern(txt2, pat2));
    }
}
