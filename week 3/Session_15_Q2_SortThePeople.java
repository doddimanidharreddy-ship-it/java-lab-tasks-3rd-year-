import java.util.Arrays;

public class Session_15_Q2_SortThePeople {
    public static String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices, (a, b) -> Integer.compare(heights[b], heights[a]));

        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = names[indices[i]];
        }
        return result;
    }

    public static void main(String[] args) {
        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};

        String[] sortedPeople = sortPeople(names, heights);
        System.out.println("People Sorted by Height Descending: " + Arrays.toString(sortedPeople));
    }
}
/*
OUTPUT:
People Sorted by Height Descending: [Mary, Emma, John]
*/
