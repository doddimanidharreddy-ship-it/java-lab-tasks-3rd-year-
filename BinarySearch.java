// Java Program to Search an Element in Sorted Array
// Using Binary Search
public class BinarySearch {

    // Method to perform binary search
    // Array must be sorted before applying binary search
    static int binarySearch(int[] arr, int key)
    {
        // Initialize low and high pointers
        int low = 0;
        int high = arr.length - 1;

        // Keep searching while search space is valid
        while (low <= high) {

            // Calculate mid index to avoid integer overflow
            int mid = low + (high - low) / 2;

            // Check if key is present at mid
            if (arr[mid] == key)
                return mid;

            // If key is greater, ignore left half
            else if (arr[mid] < key)
                low = mid + 1;

            // If key is smaller, ignore right half
            else
                high = mid - 1;
        }
        return -1; // Element not found
    }

    // Main driver method
    public static void main(String[] args)
    {
        // Array must be sorted for binary search to work
        int[] arr = { -7, -5, 0, 3, 5, 10, 12, 20, 25 };
        int key = 10;

        // Call binary search method
        int result = binarySearch(arr, key);

        // Display result based on search outcome
        if (result != -1)
            System.out.println("Element " + key + " found at index: " + result);
        else
            System.out.println("Element " + key + " not found in array");
    }
}
