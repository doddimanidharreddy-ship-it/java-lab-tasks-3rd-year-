// Problem Statement: Write a Java program to find the maximum and minimum elements in an array.
public class MaxMinArray {
    public static void findMaxMin(int[] arr) {
        if (arr == null || arr.length == 0) return;

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }

        System.out.println("Minimum Element: " + min);
        System.out.println("Maximum Element: " + max);
    }

    public static void main(String[] args) {
        int[] arr = {15, 42, 7, 89, 23, 56};
        findMaxMin(arr);
    }
}
/*
OUTPUT:
Minimum Element: 7
Maximum Element: 89
*/
