import java.util.*;

/**
 * Task 7: HackerRank - Java HashSet
 * 
 * Problem Summary:
 * Given n pairs of strings, insert each pair into a HashSet and output the count of 
 * unique pairs after processing each pair.
 * 
 * Concept: HashSet for tracking unique combinations.
 */
public class week8_task6_JavaHashSet {

    public static List<Integer> countUniquePairs(String[] pair_left, String[] pair_right) {
        Set<String> set = new HashSet<>();
        List<Integer> counts = new ArrayList<>();

        for (int i = 0; i < pair_left.length; i++) {
            set.add(pair_left[i] + " " + pair_right[i]);
            counts.add(set.size());
        }

        return counts;
    }

    public static void main(String[] args) {
        String[] pair_left = {"john", "john", "john", "mary", "mary"};
        String[] pair_right = {"tom", "mary", "tom", "anna", "anna"};

        List<Integer> results = countUniquePairs(pair_left, pair_right);
        for (int res : results) {
            System.out.println(res);
        }
        // Expected output:
        // 1
        // 2
        // 2
        // 3
        // 3
    }
}

