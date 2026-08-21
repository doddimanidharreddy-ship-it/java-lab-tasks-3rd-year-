// Problem Statement: Matrix Block Sum (LeetCode 1314)
// Given m x n matrix mat and integer k, return answer where answer[i][j] is sum of elements mat[r][c] for i-k <= r <= i+k and j-k <= c <= j+k.
import java.util.Arrays;

public class Session_5_Task9_MatrixBlockSum {
    public static int[][] matrixBlockSum(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] prefix = new int[m + 1][n + 1];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                prefix[i + 1][j + 1] = mat[i][j] + prefix[i][j + 1] + prefix[i + 1][j] - prefix[i][j];
            }
        }

        int[][] ans = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int r1 = Math.max(0, i - k);
                int c1 = Math.max(0, j - k);
                int r2 = Math.min(m - 1, i + k);
                int c2 = Math.min(n - 1, j + k);

                ans[i][j] = prefix[r2 + 1][c2 + 1] - prefix[r1][c2 + 1] - prefix[r2 + 1][c1] + prefix[r1][c1];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int k = 1;
        int[][] result = matrixBlockSum(mat, k);

        System.out.println("Matrix Block Sum:");
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}
/*
OUTPUT:
Matrix Block Sum:
[12, 21, 16]
[27, 45, 33]
[24, 39, 28]
*/
