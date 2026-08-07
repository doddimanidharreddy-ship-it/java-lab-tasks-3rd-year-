// Problem Statement: Write a Java program to traverse and print all elements of an array.
import java.util.Arrays;

public class PrintArray {
    public static void printElements(int[] arr) {
        System.out.print("Array Elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i == arr.length - 1 ? "" : ", "));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        printElements(arr);
    }
}
/*
OUTPUT:
Array Elements: 10, 20, 30, 40, 50
*/
