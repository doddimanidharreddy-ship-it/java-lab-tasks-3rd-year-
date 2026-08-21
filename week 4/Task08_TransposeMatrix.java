import java.util.*;

/**
 * Task 8: LeetCode 867 - Transpose Matrix
 * 
 * Problem Summary:
 * Given a 2D integer array matrix, return the transpose of matrix.
 * The transpose of a matrix is the matrix flipped over its main diagonal, 
 * switching the matrix's row and column indices.
 * 
 * Time Complexity: O(R * C) where R is rows and C is columns.
 * Space Complexity: O(R * C) to store the transposed matrix.
 */
public class Task08_TransposeMatrix {

    public static int[][] transpose(int[][] matrix) {
        int R = matrix.length;
        int C = matrix[0].length;
        int[][] result = new int[C][R];

        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                result[c][r] = matrix[r][c];
            }
        }

        return result;
    }

    public static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        int[][] mat1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(mat1);

        System.out.println("\nTransposed Matrix:");
        printMatrix(transpose(mat1));
    }
}
