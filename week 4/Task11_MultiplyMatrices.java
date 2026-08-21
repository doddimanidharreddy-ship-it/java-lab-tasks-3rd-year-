import java.util.*;

/**
 * Task 11 (Bonus): GeeksforGeeks - Multiply the Matrices
 * Link: https://www.geeksforgeeks.org/problems/multiply-the-matrices-1587115620/
 * 
 * Problem Summary:
 * Given two matrices A and B, multiply them if possible.
 * Matrix multiplication A (n1 x m1) and B (n2 x m2) is possible if m1 == n2.
 * The resulting matrix C will be of dimensions n1 x m2.
 * 
 * Time Complexity: O(n1 * m1 * m2).
 * Space Complexity: O(n1 * m2) for the result matrix.
 */
public class Task11_MultiplyMatrices {

    public static int[][] multiplyMatrix(int A[][], int B[][]) {
        int n1 = A.length;
        int m1 = A[0].length;
        int n2 = B.length;
        int m2 = B[0].length;

        // Matrix multiplication is only possible if columns of A equal rows of B
        if (m1 != n2) {
            return new int[0][0]; // Return empty matrix if multiplication not possible
        }

        int[][] C = new int[n1][m2];

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m2; j++) {
                for (int k = 0; k < m1; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return C;
    }

    public static void printMatrix(int[][] mat) {
        if (mat.length == 0) {
            System.out.println("Invalid matrix multiplication!");
            return;
        }
        for (int[] row : mat) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        int[][] A = {
            {1, 2},
            {3, 4}
        };

        int[][] B = {
            {1, 1},
            {1, 1}
        };

        System.out.println("Matrix A x Matrix B:");
        printMatrix(multiplyMatrix(A, B));
    }
}
