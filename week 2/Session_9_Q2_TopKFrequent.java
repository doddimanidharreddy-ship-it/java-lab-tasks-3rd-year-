import java.util.*;

public class Session_9_Q2_TopKFrequent {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int n : nums) {
            countMap.put(n, countMap.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> heap = 
            new PriorityQueue<>((a, b) -> Integer.compare(b.getValue(), a.getValue()));

        heap.addAll(countMap.entrySet());

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = heap.poll().getKey();
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] topK = topKFrequent(nums, k);
        System.out.println("Top " + k + " Frequent Elements: " + Arrays.toString(topK));
    }
}
/*
OUTPUT:
Top 2 Frequent Elements: [1, 2]
*/
