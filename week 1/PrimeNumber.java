// Problem Statement: Write a Java program to check whether a given number is Prime or not.
public class PrimeNumber {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] testNumbers = {2, 17, 24, 29, 35};
        for (int num : testNumbers) {
            System.out.println(num + " is prime? " + isPrime(num));
        }
    }
}
/*
OUTPUT:
2 is prime? true
17 is prime? true
24 is prime? false
29 is prime? true
35 is prime? false
*/
