// Problem Statement: Transpose Matrix (LeetCode 867)
// Return the transpose of a 2D matrix (switching row and column indices).
import java.util.Arrays;

public class Session_4_Task8_TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                result[c][r] = matrix[r][c];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        int[][] transposed = transpose(matrix);

        System.out.println("Transposed Matrix:");
        for (int[] row : transposed) {
            System.out.println(Arrays.toString(row));
        }
    }
}
/*
OUTPUT:
Transposed Matrix:
[1, 4]
[2, 5]
[3, 6]
*/
