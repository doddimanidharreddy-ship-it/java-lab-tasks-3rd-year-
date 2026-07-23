// Java Program to Sort an Array
// Using Insertion Sort Algorithm
public class InsertionSort {

    // Method to sort array using insertion sort
    // Picks element and inserts it at its correct sorted position
    static void insertionSort(int[] arr)
    {
        int n = arr.length;

        // Start from second element since first is trivially sorted
        for (int i = 1; i < n; i++) {

            // Store current element as key to be inserted
            int key = arr[i];

            // Move elements of arr[0..i-1] that are greater than key
            // one position ahead of their current position
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place key at its correct sorted position
            arr[j + 1] = key;
        }
    }

    // Main driver method
    public static void main(String[] args)
    {
        // Initialize unsorted array
        int[] arr = { -7, -5, 5, 10, 0, 3, 20, 25, 12 };

        System.out.print("Array before sorting: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        // Call insertion sort to sort the array
        insertionSort(arr);

        System.out.print("\nArray after sorting:  ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
