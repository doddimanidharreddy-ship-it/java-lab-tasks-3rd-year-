import java.util.*;

/**
 * Task 2: CodeChef - LAPIN (Lapindromes)
 * 
 * Problem Summary:
 * A Lapindrome is defined as a string which when split in the middle, gives two halves 
 * having the exact same frequency of characters. 
 * If the length is odd, the middle character is ignored.
 * 
 * Time Complexity: O(N) where N is the length of string s.
 * Space Complexity: O(1) fixed array of size 26.
 */
public class Task02_Lapindromes {

    public static boolean isLapindrome(String s) {
        int len = s.length();
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        
        int half = len / 2;
        
        // First half
        for (int i = 0; i < half; i++) {
            freq1[s.charAt(i) - 'a']++;
        }
        
        // Second half (skip middle character if length is odd)
        int startSecondHalf = (len % 2 == 0) ? half : half + 1;
        for (int i = startSecondHalf; i < len; i++) {
            freq2[s.charAt(i) - 'a']++;
        }
        
        // Compare frequencies
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        String[] testCases = {"gaga", "abcde", "rotor", "xyzxy", "abbaab", "ababc"};

        for (String s : testCases) {
            System.out.println(s + " -> " + (isLapindrome(s) ? "YES" : "NO"));
        }
    }
}
