// Problem Statement: Write a Java program to perform Linear Search to find an element's index in an array.
public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {24, 18, 95, 33, 47};
        int target = 33;
        int index = linearSearch(arr, target);

        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found.");
        }
    }
}
/*
OUTPUT:
Element 33 found at index: 3
*/
