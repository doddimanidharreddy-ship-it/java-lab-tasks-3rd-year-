// Problem Statement: Write a Java program to generate and print the first N numbers of the Fibonacci series.
public class Fibonacci {
    public static void printFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series (" + n + " terms): ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + (i == n ? "" : ", "));
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int terms = 8;
        printFibonacci(terms);
    }
}
/*
OUTPUT:
Fibonacci Series (8 terms): 0, 1, 1, 2, 3, 5, 8, 13
*/
