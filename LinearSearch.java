// Java Program to Search an Element in Array
// Using Linear Search
public class LinearSearch {

    // Method to perform linear search
    // Returns index if found, else returns -1
    static int linearSearch(int[] arr, int key)
    {
        // Traverse each element of the array
        for (int i = 0; i < arr.length; i++) {

            // Check if current element matches key
            if (arr[i] == key)
                return i; // Element found at index i
        }
        return -1; // Element not found
    }

    // Main driver method
    public static void main(String[] args)
    {
        // Initialize array and key to search
        int[] arr = { -7, -5, 5, 10, 0, 3, 20, 25, 12 };
        int key = 20;

        // Call linear search method
        int result = linearSearch(arr, key);

        // Display result based on search outcome
        if (result != -1)
            System.out.println("Element " + key + " found at index: " + result);
        else
            System.out.println("Element " + key + " not found in array");
    }
}
