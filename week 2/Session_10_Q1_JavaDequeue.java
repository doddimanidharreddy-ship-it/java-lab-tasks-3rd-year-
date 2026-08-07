import java.util.*;

public class Session_10_Q1_JavaDequeue {
    public static int maxUniqueInSubarray(int[] nums, int m) {
        Deque<Integer> deque = new ArrayDeque<>();
        Set<Integer> set = new HashSet<>();
        int maxUnique = 0;

        for (int num : nums) {
            deque.addLast(num);
            set.add(num);

            if (deque.size() == m) {
                maxUnique = Math.max(maxUnique, set.size());
                int removed = deque.removeFirst();
                if (!deque.contains(removed)) {
                    set.remove(removed);
                }
            }
        }
        return maxUnique;
    }

    public static void main(String[] args) {
        int[] nums = {5, 3, 5, 2, 3, 2};
        int m = 3;
        int maxUnique = maxUniqueInSubarray(nums, m);
        System.out.println("Max unique numbers in subarray of size " + m + ": " + maxUnique);
    }
}
/*
OUTPUT:
Max unique numbers in subarray of size 3: 3
*/
