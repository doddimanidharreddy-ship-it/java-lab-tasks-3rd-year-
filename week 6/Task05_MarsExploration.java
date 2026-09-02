import java.util.*;

/**
 * Task 5: HackerRank - Mars Exploration
 * 
 * Problem Summary:
 * A space explorer sends SOS messages continuously ("SOSSOSSOS...").
 * Due to cosmic radiation, some characters are altered during transmission.
 * Given the received string s, count how many characters were changed.
 * 
 * Approach:
 * The target message pattern repeats "SOS" every 3 characters.
 * Compare s.charAt(i) with "SOS".charAt(i % 3) for all i from 0 to s.length() - 1.
 * 
 * Time Complexity: O(N) where N is length of string s.
 * Space Complexity: O(1).
 */
public class Task05_MarsExploration {

    public static int marsExploration(String s) {
        String target = "SOS";
        int alteredCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != target.charAt(i % 3)) {
                alteredCount++;
            }
        }

        return alteredCount;
    }

    public static void main(String[] args) {
        String test1 = "SOSSPSSQSSOR";
        String test2 = "SOSSOT";

        System.out.println("\"" + test1 + "\" -> Altered characters: " + marsExploration(test1)); // Expected: 3
        System.out.println("\"" + test2 + "\" -> Altered characters: " + marsExploration(test2)); // Expected: 1
    }
}
