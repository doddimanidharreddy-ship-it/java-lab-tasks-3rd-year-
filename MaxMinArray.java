// Java Program to Find Maximum and Minimum Element in Array
public class MaxMinArray {

    // Main driver method
    public static void main(String[] args)
    {
        // Initialize array of elements
        int[] arr = { -7, -5, 5, 10, 0, 3, 20, 25, 12 };

        // Assume first element is max and min
        int max = arr[0];
        int min = arr[0];

        // Traverse array to find actual max and min
        for (int i = 1; i < arr.length; i++) {

            // Update max if current element is greater
            if (arr[i] > max)
                max = arr[i];

            // Update min if current element is smaller
            if (arr[i] < min)
                min = arr[i];
        }

        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}
