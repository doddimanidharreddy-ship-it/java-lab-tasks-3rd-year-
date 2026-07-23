// Java Program to Check Whether a String is Palindrome or Not
// A palindrome string reads the same forward and backward
public class Palindrome {

    // Method to check if a given string is palindrome
    // Uses two pointer approach for efficient comparison
    static boolean isPalindrome(String str)
    {
        // Initialize left pointer at start of string
        int left = 0;

        // Initialize right pointer at end of string
        int right = str.length() - 1;

        // Compare characters from both ends toward center
        while (left < right) {

            // If characters at left and right don't match
            // String is not a palindrome
            if (str.charAt(left) != str.charAt(right))
                return false;

            // Move left pointer forward
            left++;

            // Move right pointer backward
            right--;
        }

        // All characters matched, string is a palindrome
        return true;
    }

    // Main driver method
    public static void main(String[] args)
    {
        // Test palindrome check for multiple strings
        String[] words = { "madam", "racecar", "hello", "level", "java" };

        // Check and display whether each word is palindrome
        for (String word : words) {
            if (isPalindrome(word))
                System.out.println(word + " -> Palindrome");
            else
                System.out.println(word + " -> Not a Palindrome");
        }
    }
}
