// Java Program to Sort an Array
// Using Selection Sort Algorithm
public class SelectionSort {

    // Method to sort array using selection sort
    // Finds minimum element and places it at correct position
    static void selectionSort(int[] arr)
    {
        int n = arr.length;

        // Move boundary of unsorted subarray one by one
        for (int i = 0; i < n - 1; i++) {

            // Find minimum element index in unsorted portion
            int minIdx = i;

            for (int j = i + 1; j < n; j++) {

                // Update minIdx if a smaller element is found
                if (arr[j] < arr[minIdx])
                    minIdx = j;
            }

            // Swap found minimum element with first unsorted element
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
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

        // Call selection sort to sort the array
        selectionSort(arr);

        System.out.print("\nArray after sorting:  ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
