// Java Program to Find Factorial of a Number
// Using Recursion
public class Factorial {

    // Recursive method to calculate factorial of n
    // factorial(n) = n * factorial(n-1)
    // Base Case: factorial(0) = factorial(1) = 1
    static long factorial(int n)
    {
        // Base case: factorial of 0 or 1 is 1
        if (n == 0 || n == 1)
            return 1;

        // Recursive case: n multiplied by factorial of (n-1)
        return (long) n * factorial(n - 1);
    }

    // Main driver method
    public static void main(String[] args)
    {
        // Test factorial for different values of n
        int num = 10;

        // Display factorial result
        System.out.println("Factorial of " + num + " = " + factorial(num));
    }
}
