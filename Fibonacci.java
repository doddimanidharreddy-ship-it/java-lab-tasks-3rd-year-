// Java Program to Print Fibonacci Series
// Using Iterative Approach
public class Fibonacci {

    // Method to print Fibonacci series up to n terms
    // Series: 0, 1, 1, 2, 3, 5, 8, 13, 21...
    static void printFibonacci(int n)
    {
        // Initialize first two terms of the series
        int first = 0, second = 1;

        System.out.print("Fibonacci Series (" + n + " terms): ");

        // Loop to print n terms of Fibonacci series
        for (int i = 0; i < n; i++) {

            // Print the current term
            System.out.print(first + " ");

            // Calculate next Fibonacci number
            int next = first + second;

            // Update values for next iteration
            first = second;
            second = next;
        }
    }

    // Main driver method
    public static void main(String[] args)
    {
        // Number of Fibonacci terms to print
        int n = 10;

        // Call method to print Fibonacci series
        printFibonacci(n);
    }
}
