// Java Program to Sort an Array
// Using Bubble Sort Algorithm
public class BubbleSort {

    // Method to sort array using bubble sort
    // Time Complexity: O(n^2), Space Complexity: O(1)
    static void bubbleSort(int[] arr)
    {
        int n = arr.length;

        // Outer loop for each pass through array
        for (int i = 0; i < n - 1; i++) {

            // Inner loop to compare adjacent elements
            // Last i elements are already in place
            for (int j = 0; j < n - i - 1; j++) {

                // Swap if current element is greater than next
                if (arr[j] > arr[j + 1]) {

                    // Swap arr[j] and arr[j+1] using temp variable
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
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

        // Call bubble sort to sort the array
        bubbleSort(arr);

        System.out.print("\nArray after sorting:  ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
