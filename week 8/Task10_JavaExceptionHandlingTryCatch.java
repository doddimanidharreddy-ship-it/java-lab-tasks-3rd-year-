import java.util.*;

/**
 * Task 10: HackerRank - Java Exception Handling (Try-catch)
 * 
 * Problem Summary:
 * Read two integers x and y, compute x / y:
 * - If x or y is not a 32-bit signed integer, handle InputMismatchException and print "java.util.InputMismatchException".
 * - If division by zero occurs, handle ArithmeticException and print "java.lang.ArithmeticException: / by zero".
 * 
 * Concept: Try-Catch Exception Handling.
 */
public class Task10_JavaExceptionHandlingTryCatch {

    public static String divide(String inputX, String inputY) {
        try {
            int x = Integer.parseInt(inputX);
            int y = Integer.parseInt(inputY);
            return String.valueOf(x / y);
        } catch (NumberFormatException e) {
            return "java.util.InputMismatchException";
        } catch (ArithmeticException e) {
            return "java.lang.ArithmeticException: / by zero";
        }
    }

    public static void main(String[] args) {
        System.out.println("Test 1 (10 / 3): " + divide("10", "3"));       // Expected: 3
        System.out.println("Test 2 (10 / Hello): " + divide("10", "Hello")); // Expected: java.util.InputMismatchException
        System.out.println("Test 3 (10 / 0): " + divide("10", "0"));       // Expected: java.lang.ArithmeticException: / by zero
        System.out.println("Test 4 (2147483648 / 1): " + divide("2147483648", "1")); // Expected: java.util.InputMismatchException
    }
}
