// Java Program to Print the Elements of an Array
// Using for loop
public class PrintArray {

    // Main driver method
    public static void main(String[] args)
    {
        // Initialize array of random numbers and size
        // Suppose array named 'arr' contains 9 elements
        int[] arr = { -7, -5, 5, 10, 0, 3, 20, 25, 12 };

        System.out.print("Elements of given array are: ");

        // Looping through array by incrementing value of i
        // 'i' is an index of array 'arr'
        for (int i = 0; i < arr.length; i++) {

            // Print array element present at index i
            System.out.print(arr[i] + " ");
        }
    }
}
