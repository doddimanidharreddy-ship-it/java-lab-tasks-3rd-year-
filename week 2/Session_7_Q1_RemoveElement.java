public class Session_7_Q1_RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for (int num : nums) {
            if (num != val) {
                nums[index++] = num;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int k = removeElement(nums, val);

        System.out.println("New Length (k): " + k);
        System.out.print("Modified Array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
/*
OUTPUT:
New Length (k): 2
Modified Array: 2 2 
*/
