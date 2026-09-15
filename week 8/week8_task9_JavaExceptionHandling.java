import java.util.*;

/**
 * Task 9: HackerRank - Java Exception Handling
 * 
 * Problem Summary:
 * Implement a MyCalculator class with method long power(int n, int p) throws Exception:
 * - If n or p is negative: throw Exception("n or p should not be negative.")
 * - If n and p are zero: throw Exception("n and p should not be zero.")
 * - Else return n^p.
 * 
 * Concept: Custom Exception Handling.
 */
public class week8_task9_JavaExceptionHandling {

    static class MyCalculator {
        public long power(int n, int p) throws Exception {
            if (n < 0 || p < 0) {
                throw new Exception("n or p should not be negative.");
            }
            if (n == 0 && p == 0) {
                throw new Exception("n and p should not be zero.");
            }
            return (long) Math.pow(n, p);
        }
    }

    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();

        int[][] testCases = {
            {3, 5},
            {2, 4},
            {0, 0},
            {-1, -2},
            {-1, 3}
        };

        for (int[] test : testCases) {
            try {
                System.out.println(myCalculator.power(test[0], test[1]));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

