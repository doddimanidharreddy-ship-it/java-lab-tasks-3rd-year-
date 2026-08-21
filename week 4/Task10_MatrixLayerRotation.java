import java.util.*;

/**
 * Task 10: HackerRank - Matrix Layer Rotation (Matrix Rotation Algo)
 * 
 * Problem Summary:
 * Given a 2D matrix of size m x n and an integer r, rotate the matrix elements 
 * in concentric anti-clockwise rings r times.
 * 
 * Approach:
 * 1. For each concentric ring l (from 0 to min(m, n)/2 - 1):
 *    a. Traversal order counter-clockwise: Left column down, Bottom row right, Right column up, Top row left.
 *    b. Extract values into a List.
 *    c. Rotate the list counter-clockwise by `r % list.size()`.
 *    d. Write the rotated values back into the matrix.
 * 
 * Time Complexity: O(M * N) total operations.
 * Space Complexity: O(M + N) to store ring elements.
 */
public class Task10_MatrixLayerRotation {

    public static void matrixRotation(List<List<Integer>> matrix, int r) {
        int m = matrix.size();
        int n = matrix.get(0).size();
        int numLayers = Math.min(m, n) / 2;

        for (int l = 0; l < numLayers; l++) {
            List<Integer> layer = new ArrayList<>();

            // 1. Extract layer elements anti-clockwise
            // Left column (top to bottom)
            for (int i = l; i < m - l; i++) layer.add(matrix.get(i).get(l));
            // Bottom row (left to right, skip first element)
            for (int j = l + 1; j < n - l; j++) layer.add(matrix.get(m - 1 - l).get(j));
            // Right column (bottom to top, skip first element)
            for (int i = m - 2 - l; i >= l; i--) layer.add(matrix.get(i).get(n - 1 - l));
            // Top row (right to left, skip first and last element)
            for (int j = n - 2 - l; j > l; j--) layer.add(matrix.get(l).get(j));

            int len = layer.size();
            int rot = r % len;

            // 2. Rotate layer anti-clockwise by rot positions
            List<Integer> rotated = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                rotated.add(layer.get((i + rot) % len));
            }

            // 3. Place rotated elements back into matrix
            int idx = 0;
            for (int i = l; i < m - l; i++) matrix.get(i).set(l, rotated.get(idx++));
            for (int j = l + 1; j < n - l; j++) matrix.get(m - 1 - l).set(j, rotated.get(idx++));
            for (int i = m - 2 - l; i >= l; i--) matrix.get(i).set(n - 1 - l, rotated.get(idx++));
            for (int j = n - 2 - l; j > l; j--) matrix.get(l).set(j, rotated.get(idx++));
        }
    }

    public static void printMatrix(List<List<Integer>> matrix) {
        for (List<Integer> row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
        matrix.add(new ArrayList<>(Arrays.asList(5, 6, 7, 8)));
        matrix.add(new ArrayList<>(Arrays.asList(9, 10, 11, 12)));
        matrix.add(new ArrayList<>(Arrays.asList(13, 14, 15, 16)));

        int r = 2;
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        matrixRotation(matrix, r);

        System.out.println("\nMatrix After " + r + " Anti-Clockwise Rotations:");
        printMatrix(matrix);
    }
}
