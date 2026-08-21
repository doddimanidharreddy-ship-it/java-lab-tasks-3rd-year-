import java.util.*;

/**
 * Task 3: HackerRank - Compare the Triplets
 * 
 * Problem Summary:
 * Compare two triplets of scores (a and b) for Alice and Bob across 3 categories.
 * If a[i] > b[i], Alice gets 1 point.
 * If a[i] < b[i], Bob gets 1 point.
 * If a[i] == b[i], neither receives a point.
 * Return a list containing [Alice's score, Bob's score].
 * 
 * Time Complexity: O(1) fixed size 3.
 * Space Complexity: O(1).
 */
public class Task03_CompareTheTriplets {

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int scoreA = 0;
        int scoreB = 0;

        for (int i = 0; i < 3; i++) {
            if (a.get(i) > b.get(i)) {
                scoreA++;
            } else if (a.get(i) < b.get(i)) {
                scoreB++;
            }
        }

        return Arrays.asList(scoreA, scoreB);
    }

    public static void main(String[] args) {
        List<Integer> a1 = Arrays.asList(5, 6, 7);
        List<Integer> b1 = Arrays.asList(3, 6, 10);
        System.out.println("Result 1: " + compareTriplets(a1, b1)); // Expected: [1, 1]

        List<Integer> a2 = Arrays.asList(17, 28, 30);
        List<Integer> b2 = Arrays.asList(99, 16, 8);
        System.out.println("Result 2: " + compareTriplets(a2, b2)); // Expected: [2, 1]
    }
}
