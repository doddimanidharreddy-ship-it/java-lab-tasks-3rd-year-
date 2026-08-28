import java.util.*;

/**
 * Task 7: LeetCode 3 - Longest Substring Without Repeating Characters
 * 
 * Problem Summary:
 * Given a string s, find the length of the longest substring without repeating characters.
 * 
 * Approach: Sliding Window + Last Seen Index Tracking.
 * Maintain a left pointer for window start.
 * Store the last seen index of each character in an array/map.
 * When a repeated character is encountered, update left = max(left, lastSeenIndex + 1).
 * Update maxLen = max(maxLen, right - left + 1).
 * 
 * Time Complexity: O(N) where N is length of s.
 * Space Complexity: O(1) using fixed-size 128 ASCII array.
 */
public class Task07_LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLen = 0;
        int left = 0;

        // Stores last seen index of characters (initialized to -1)
        int[] lastSeen = new int[128];
        Arrays.fill(lastSeen, -1);

        for (int right = 0; right < n; right++) {
            char currentChar = s.charAt(right);

            if (lastSeen[currentChar] >= left) {
                left = lastSeen[currentChar] + 1;
            }

            lastSeen[currentChar] = right;
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String[] testCases = {
            "abcabcbb",
            "bbbbb",
            "pwwkew",
            ""
        };

        for (String str : testCases) {
            System.out.println("\"" + str + "\" -> Longest unique substring length: " + lengthOfLongestSubstring(str));
        }
    }
}
