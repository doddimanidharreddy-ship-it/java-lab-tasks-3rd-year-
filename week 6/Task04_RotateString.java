import java.util.*;

/**
 * Task 4: LeetCode 796 - Rotate String
 * 
 * Problem Summary:
 * Given two strings s and goal, return true if and only if s can become goal 
 * after some number of shifts on s.
 * A shift consists of moving the leftmost character of s to the rightmost position.
 * 
 * Approach:
 * If s can be rotated to form goal, then goal must be a substring of (s + s) 
 * AND s.length() == goal.length().
 * 
 * Time Complexity: O(N) where N is length of s.
 * Space Complexity: O(N) to store concatenated string s + s.
 */
public class Task04_RotateString {

    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        String doubled = s + s;
        return doubled.contains(goal);
    }

    public static void main(String[] args) {
        String s1 = "abcde", g1 = "cdeab";
        String s2 = "abcde", g2 = "abced";

        System.out.println("Can \"" + s1 + "\" rotate to \"" + g1 + "\"? " + rotateString(s1, g1)); // Expected: true
        System.out.println("Can \"" + s2 + "\" rotate to \"" + g2 + "\"? " + rotateString(s2, g2)); // Expected: false
    }
}
