public class week4_task3_DetermineIfStringHalvesAreAlike {
    public static boolean halvesAreAlike(String s) {
        int n = s.length(), count1 = 0, count2 = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < n / 2; i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) count1++;
            if (vowels.indexOf(s.charAt(i + n / 2)) != -1) count2++;
        }
        return count1 == count2;
    }
    public static void main(String[] args) {
        System.out.println(halvesAreAlike("book"));
    }
}