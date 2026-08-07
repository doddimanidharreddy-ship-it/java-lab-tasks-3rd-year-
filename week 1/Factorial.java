// Problem Statement: Write a Java program to calculate the factorial of a given number.
public class Factorial {
    public static long getFactorial(int n) {
        if (n < 0) return -1;
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int num = 6;
        long result = getFactorial(num);
        System.out.println("Factorial of " + num + " is: " + result);
    }
}
/*
OUTPUT:
Factorial of 6 is: 720
*/
