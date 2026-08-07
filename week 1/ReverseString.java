// Problem Statement: Write a Java program to reverse a given string.
public class ReverseString {
    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String input = "JavaProgramming";
        String reversed = reverse(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }
}
/*
OUTPUT:
Original String: JavaProgramming
Reversed String: gnimmargorPavaJ
*/
