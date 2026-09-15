import java.util.*;

/**
 * Task 6: HackerRank - Java Interface
 * 
 * Problem Summary:
 * Implement the AdvancedArithmetic interface in MyCalculator class:
 * int divisor_sum(int n): Returns the sum of all divisors of n.
 * 
 * Concept: Java Interface & Divisor Calculation.
 */
public class Task06_JavaInterface {

    interface AdvancedArithmetic {
        int divisor_sum(int n);
    }

    static class MyCalculator implements AdvancedArithmetic {
        public int divisor_sum(int n) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();
        int n = 6;
        System.out.println("I implemented: AdvancedArithmetic");
        System.out.println("Divisor sum of " + n + ": " + myCalculator.divisor_sum(n));
        // Expected: 1 + 2 + 3 + 6 = 12
    }
}
