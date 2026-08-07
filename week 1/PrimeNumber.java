// Java Program to Check Whether a Number is Prime or Not
// A prime number is divisible only by 1 and itself
public class PrimeNumber {

    // Method to check if a given number is prime
    // Uses optimized approach checking up to sqrt(n)
    static boolean isPrime(int n)
    {
        // Numbers less than 2 are not prime numbers
        if (n < 2)
            return false;

        // Check divisibility from 2 to square root of n
        // If divisible by any number in this range, not prime
        for (int i = 2; i <= Math.sqrt(n); i++) {

            // If n is divisible by i, it's not a prime number
            if (n % i == 0)
                return false;
        }

        // Number is prime if no divisor found
        return true;
    }

    // Main driver method
    public static void main(String[] args)
    {
        // Test prime check for multiple numbers
        int[] numbers = { 2, 3, 4, 17, 25, 97, 100 };

        // Check and display whether each number is prime
        for (int num : numbers) {
            if (isPrime(num))
                System.out.println(num + " is Prime");
            else
                System.out.println(num + " is Not Prime");
        }
    }
}
