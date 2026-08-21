// Problem Statement: Lapindromes (CodeChef LAPIN)
// Check if a string is a Lapindrome (left half has same character frequencies as right half).
import java.util.Arrays;

public class Session_1_Task2_Lapindromes {
    public static boolean isLapindrome(String s) {
        int n = s.length();
        int[] leftFreq = new int[26];
        int[] rightFreq = new int[26];

        int mid = n / 2;
        int rightStart = (n % 2 == 0) ? mid : mid + 1;

        for (int i = 0; i < mid; i++) {
            leftFreq[s.charAt(i) - 'a']++;
        }
        for (int i = rightStart; i < n; i++) {
            rightFreq[s.charAt(i) - 'a']++;
        }

        return Arrays.equals(leftFreq, rightFreq);
    }

    public static void main(String[] args) {
        String[] testStrings = {"gaga", "abcde", "rotor", "xyzxy"};
        for (String str : testStrings) {
            System.out.println("\"" + str + "\" is Lapindrome? " + (isLapindrome(str) ? "YES" : "NO"));
        }
    }
}
/*
OUTPUT:
"gaga" is Lapindrome? YES
"abcde" is Lapindrome? NO
"rotor" is Lapindrome? YES
"xyzxy" is Lapindrome? YES
*/
