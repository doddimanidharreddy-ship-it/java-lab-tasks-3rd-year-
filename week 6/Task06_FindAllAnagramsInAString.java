import java.util.*;

/**
 * Task 6: LeetCode 438 - Find All Anagrams in a String
 * 
 * Problem Summary:
 * Given two strings s and p, return an array of all the start indices of p's anagrams in s.
 * 
 * Approach: Fixed Sliding Window of size p.length().
 * Maintain two frequency arrays of size 26 (pFreq and sFreq).
 * Slide window across s: add incoming character, remove outgoing character.
 * Whenever arrays match (Arrays.equals(pFreq, sFreq)), record start index.
 * 
 * Time Complexity: O(|s|) where |s| is length of string s.
 * Space Complexity: O(1) using fixed size 26 arrays.
 */
public class Task06_FindAllAnagramsInAString {

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int sLen = s.length();
        int pLen = p.length();

        if (sLen < pLen) return result;

        int[] pFreq = new int[26];
        int[] sFreq = new int[26];

        for (int i = 0; i < pLen; i++) {
            pFreq[p.charAt(i) - 'a']++;
            sFreq[s.charAt(i) - 'a']++;
        }

        if (Arrays.equals(pFreq, sFreq)) {
            result.add(0);
        }

        for (int i = pLen; i < sLen; i++) {
            sFreq[s.charAt(i) - 'a']++;            // add new char to window
            sFreq[s.charAt(i - pLen) - 'a']--;     // remove old char from window

            if (Arrays.equals(pFreq, sFreq)) {
                result.add(i - pLen + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s1 = "cbaebabacd", p1 = "abc";
        String s2 = "abab", p2 = "ab";

        System.out.println("s=\"" + s1 + "\", p=\"" + p1 + "\" -> Anagram start indices: " + findAnagrams(s1, p1)); // Expected: [0, 6]
        System.out.println("s=\"" + s2 + "\", p=\"" + p2 + "\" -> Anagram start indices: " + findAnagrams(s2, p2)); // Expected: [0, 1, 2]
    }
}
