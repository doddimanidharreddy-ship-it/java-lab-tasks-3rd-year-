// Problem Statement: Write a Java program to check if a string or number is a Palindrome.
public class Palindrome {
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "radar";
        String str2 = "hello";
        System.out.println("\"" + str1 + "\" is palindrome? " + isPalindrome(str1));
        System.out.println("\"" + str2 + "\" is palindrome? " + isPalindrome(str2));
    }
}
/*
OUTPUT:
"radar" is palindrome? true
"hello" is palindrome? false
*/
