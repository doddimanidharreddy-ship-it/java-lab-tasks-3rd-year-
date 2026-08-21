import java.util.*;

/**
 * Task 7: HackerRank - Diagonal Difference
 * 
 * Problem Summary:
 * Given a square matrix, calculate the absolute difference between the sums of its diagonals.
 * Primary diagonal: arr[i][i]
 * Secondary diagonal: arr[i][n - 1 - i]
 * 
 * Time Complexity: O(N) where N is matrix side length.
 * Space Complexity: O(1).
 */
public class Task07_DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int primarySum = 0;
        int secondarySum = 0;
        int n = arr.size();

        for (int i = 0; i < n; i++) {
            primarySum += arr.get(i).get(i);
            secondarySum += arr.get(i).get(n - 1 - i);
        }

        return Math.abs(primarySum - secondarySum);
    }

    public static void main(String[] args) {
        List<List<Integer>> matrix = Arrays.asList(
            Arrays.asList(11, 2, 4),
            Arrays.asList(4, 5, 6),
            Arrays.asList(10, 8, -12)
        );

        System.out.println("Diagonal Difference: " + diagonalDifference(matrix)); 
        // Primary: 11 + 5 + (-12) = 4
        // Secondary: 4 + 5 + 10 = 19
        // Difference: |4 - 19| = 15
    }
}
