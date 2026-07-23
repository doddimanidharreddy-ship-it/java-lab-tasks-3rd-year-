// Java Program to Reverse a String
// Using StringBuilder's built-in reverse() method
public class ReverseString {

    // Method to reverse a given string
    // Uses StringBuilder for efficient string manipulation
    static String reverseString(String str)
    {
        // Create StringBuilder object from input string
        StringBuilder sb = new StringBuilder(str);

        // Use built-in reverse() method to reverse the string
        return sb.reverse().toString();
    }

    // Main driver method
    public static void main(String[] args)
    {
        // Initialize string to be reversed
        String str = "GeeksForGeeks";

        // Display original string
        System.out.println("Original String: " + str);

        // Call reverse method and display reversed string
        System.out.println("Reversed String: " + reverseString(str));
    }
}
