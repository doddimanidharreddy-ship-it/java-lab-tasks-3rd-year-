public class Session_8_Q2_HighestAltitude {
    public static int largestAltitude(int[] gain) {
        int maxAlt = 0;
        int currentAlt = 0;

        for (int g : gain) {
            currentAlt += g;
            maxAlt = Math.max(maxAlt, currentAlt);
        }
        return maxAlt;
    }

    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7};
        int result = largestAltitude(gain);
        System.out.println("Highest Altitude: " + result);
    }
}
/*
OUTPUT:
Highest Altitude: 1
*/
