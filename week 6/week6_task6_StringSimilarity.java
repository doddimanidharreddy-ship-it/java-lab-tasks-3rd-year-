public class week6_task6_StringSimilarity {
    public static long stringSimilarity(String s) {
        int n = s.length(), z[] = new int[n], l = 0, r = 0;
        long total = n;
        for (int i = 1; i < n; i++) {
            if (i <= r) z[i] = Math.min(r - i + 1, z[i - l]);
            while (i + z[i] < n && s.charAt(z[i]) == s.charAt(i + z[i])) z[i]++;
            if (i + z[i] - 1 > r) { l = i; r = i + z[i] - 1; }
            total += z[i];
        }
        return total;
    }
    public static void main(String[] args) {
        System.out.println(stringSimilarity("ababaa"));
    }
}