// Problem Statement: Diagonal Difference (HackerRank)
// Calculate the absolute difference between the sums of the two diagonals of a square matrix.
import java.util.Arrays;
import java.util.List;

public class Session_4_Task7_DiagonalDifference {
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
        int diff = diagonalDifference(matrix);
        System.out.println("Absolute Diagonal Difference: " + diff);
    }
}
/*
OUTPUT:
Absolute Diagonal Difference: 15
*/
