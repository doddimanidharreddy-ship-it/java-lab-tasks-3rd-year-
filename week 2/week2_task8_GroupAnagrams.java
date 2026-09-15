import java.util.*;
import java.util.stream.Collectors;

public class week2_task8_GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        return new ArrayList<>(
            Arrays.stream(strs).collect(Collectors.groupingBy(str -> {
                char[] chars = str.toCharArray();
                Arrays.sort(chars);
                return new String(chars);
            })).values()
        );
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> grouped = groupAnagrams(strs);
        System.out.println("Grouped Anagrams: " + grouped);
    }
}
/*
OUTPUT:
Grouped Anagrams: [[eat, tea, ate], [bat], [tan, nat]]
*/

