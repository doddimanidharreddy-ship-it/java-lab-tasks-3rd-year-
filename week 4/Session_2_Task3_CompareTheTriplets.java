// Problem Statement: Compare the Triplets (HackerRank)
// Compare ratings of Alice and Bob and return points scored by [Alice, Bob].
import java.util.Arrays;
import java.util.List;

public class Session_2_Task3_CompareTheTriplets {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int alicePoints = 0;
        int bobPoints = 0;

        for (int i = 0; i < 3; i++) {
            if (a.get(i) > b.get(i)) {
                alicePoints++;
            } else if (a.get(i) < b.get(i)) {
                bobPoints++;
            }
        }
        return Arrays.asList(alicePoints, bobPoints);
    }

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(5, 6, 7);
        List<Integer> b = Arrays.asList(3, 6, 10);
        List<Integer> result = compareTriplets(a, b);
        System.out.println("Points [Alice, Bob]: " + result);
    }
}
/*
OUTPUT:
Points [Alice, Bob]: [1, 1]
*/
