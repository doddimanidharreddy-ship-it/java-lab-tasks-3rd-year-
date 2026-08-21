// Problem Statement: Determine if String Halves Are Alike (LeetCode 1704)
// Given a string s of even length, split it into two equal halves. Return true if both halves have the same number of vowels.
import java.util.Set;

public class Session_1_Task1_DetermineIfStringHalvesAreAlike {
    public static boolean halvesAreAlike(String s) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        int n = s.length();
        int count1 = 0, count2 = 0;

        for (int i = 0; i < n / 2; i++) {
            if (vowels.contains(s.charAt(i))) count1++;
            if (vowels.contains(s.charAt(i + n / 2))) count2++;
        }

        return count1 == count2;
    }

    public static void main(String[] args) {
        String s1 = "book";
        String s2 = "textbook";
        System.out.println("Is \"" + s1 + "\" halves alike? " + halvesAreAlike(s1));
        System.out.println("Is \"" + s2 + "\" halves alike? " + halvesAreAlike(s2));
    }
}
/*
OUTPUT:
Is "book" halves alike? true
Is "textbook" halves alike? false
*/
