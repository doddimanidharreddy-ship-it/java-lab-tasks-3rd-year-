// Problem Statement: Write a Java program to perform Binary Search on a sorted array.
public class BinarySearch {
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) return mid;
            else if (arr[mid] < key) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-7, -5, 0, 3, 5, 10, 12, 20, 25};
        int key = 10;
        int index = binarySearch(arr, key);

        if (index != -1) {
            System.out.println("Element " + key + " found at index: " + index);
        } else {
            System.out.println("Element " + key + " not found.");
        }
    }
}
/*
OUTPUT:
Element 10 found at index: 5
*/
