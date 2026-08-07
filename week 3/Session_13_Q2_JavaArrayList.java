import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Session_13_Q2_JavaArrayList {
    public static void processQueries(List<List<Integer>> list, int[][] queries) {
        for (int[] q : queries) {
            int x = q[0] - 1;
            int y = q[1] - 1;

            if (x >= 0 && x < list.size() && y >= 0 && y < list.get(x).size()) {
                System.out.println("Query (" + (x + 1) + "," + (y + 1) + "): " + list.get(x).get(y));
            } else {
                System.out.println("Query (" + (x + 1) + "," + (y + 1) + "): ERROR!");
            }
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(41, 77, 74, 22, 44));
        list.add(Arrays.asList(12));
        list.add(Arrays.asList(37, 34, 36, 52));
        list.add(new ArrayList<>());
        list.add(Arrays.asList(20, 22, 33));

        int[][] queries = {{1, 3}, {3, 4}, {3, 1}, {4, 3}, {5, 5}};
        processQueries(list, queries);
    }
}
/*
OUTPUT:
Query (1,3): 74
Query (3,4): 52
Query (3,1): 37
Query (4,3): ERROR!
Query (5,5): ERROR!
*/
