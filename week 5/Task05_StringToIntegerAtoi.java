import java.util.*;

/**
 * Task 5: LeetCode 8 - String to Integer (atoi)
 * 
 * Problem Summary:
 * Implement the myAtoi(String s) function, which converts a string to a 32-bit 
 * signed integer (similar to C/C++'s atoi function).
 * 
 * Steps:
 * 1. Ignore leading whitespace.
 * 2. Determine sign ('+' or '-').
 * 3. Read digits and build result.
 * 4. Handle 32-bit signed integer overflow (clamp to [Integer.MIN_VALUE, Integer.MAX_VALUE]).
 * 
 * Time Complexity: O(N) where N is length of s.
 * Space Complexity: O(1).
 */
public class Task05_StringToIntegerAtoi {

    public static int myAtoi(String s) {
        if (s == null || s.length() == 0) return 0;

        int index = 0;
        int n = s.length();

        // Step 1: Ignore leading whitespace
        while (index < n && s.charAt(index) == ' ') {
            index++;
        }

        if (index == n) return 0;

        // Step 2: Determine sign
        int sign = 1;
        if (s.charAt(index) == '+' || s.charAt(index) == '-') {
            sign = (s.charAt(index) == '-') ? -1 : 1;
            index++;
        }

        // Step 3: Read digits and check for overflow
        long result = 0;
        while (index < n && Character.isDigit(s.charAt(index))) {
            int digit = s.charAt(index) - '0';
            result = result * 10 + digit;

            // Overflow check
            if (sign == 1 && result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign == -1 && -result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            index++;
        }

        return (int) (sign * result);
    }

    public static void main(String[] args) {
        String[] testCases = {
            "42",
            " -042",
            "1337c0d3",
            "0-1",
            "words and 987",
            "-91283472332"
        };

        for (String str : testCases) {
            System.out.println("\"" + str + "\" -> " + myAtoi(str));
        }
    }
}
