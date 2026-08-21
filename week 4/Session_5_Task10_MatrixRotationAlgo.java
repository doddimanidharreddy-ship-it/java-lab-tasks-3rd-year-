// Problem Statement: Matrix Layer Rotation (HackerRank Matrix Rotation Algo)
// Rotate a m x n matrix anti-clockwise r times layer by layer.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Session_5_Task10_MatrixRotationAlgo {
    public static void matrixRotation(List<List<Integer>> matrix, int r) {
        int m = matrix.size();
        int n = matrix.get(0).size();
        int layers = Math.min(m, n) / 2;

        for (int layer = 0; layer < layers; layer++) {
            List<Integer> list = new ArrayList<>();

            // Top row
            for (int j = layer; j < n - layer; j++) list.add(matrix.get(layer).get(j));
            // Right col
            for (int i = layer + 1; i < m - layer - 1; i++) list.add(matrix.get(i).get(n - 1 - layer));
            // Bottom row
            for (int j = n - 1 - layer; j >= layer; j--) list.add(matrix.get(m - 1 - layer).get(j));
            // Left col
            for (int i = m - 2 - layer; i > layer; i--) list.add(matrix.get(i).get(layer));

            int len = list.size();
            int rot = r % len;

            // Reassign after anti-clockwise rotation
            int idx = 0;
            for (int j = layer; j < n - layer; j++) matrix.get(layer).set(j, list.get((idx++ + rot) % len));
            for (int i = layer + 1; i < m - layer - 1; i++) matrix.get(i).set(n - 1 - layer, list.get((idx++ + rot) % len));
            for (int j = n - 1 - layer; j >= layer; j--) matrix.get(m - 1 - layer).set(j, list.get((idx++ + rot) % len));
            for (int i = m - 2 - layer; i > layer; i--) matrix.get(i).set(layer, list.get((idx++ + rot) % len));
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
        matrix.add(new ArrayList<>(Arrays.asList(5, 6, 7, 8)));
        matrix.add(new ArrayList<>(Arrays.asList(9, 10, 11, 12)));
        matrix.add(new ArrayList<>(Arrays.asList(13, 14, 15, 16)));

        int r = 2;
        matrixRotation(matrix, r);

        System.out.println("Matrix Layer Rotated " + r + " times:");
        for (List<Integer> row : matrix) {
            System.out.println(row);
        }
    }
}
/*
OUTPUT:
Matrix Layer Rotated 2 times:
[3, 4, 8, 12]
[2, 11, 10, 16]
[1, 7, 6, 15]
[5, 9, 13, 14]
*/
