import java.util.*;

/**
 * Task 5: HackerRank - Time Conversion
 * 
 * Problem Summary:
 * Given a time in 12-hour AM/PM format (e.g. "07:05:45PM"), convert it to military (24-hour) time (e.g. "19:05:45").
 * Note: 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
 *       12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
 * 
 * Time Complexity: O(1).
 * Space Complexity: O(1).
 */
public class Task05_TimeConversion {

    public static String timeConversion(String s) {
        String ampm = s.substring(8);
        int hour = Integer.parseInt(s.substring(0, 2));
        String rest = s.substring(2, 8); // includes minutes, seconds and colons ":MM:SS"

        if (ampm.equals("AM")) {
            if (hour == 12) {
                hour = 0;
            }
        } else { // PM
            if (hour != 12) {
                hour += 12;
            }
        }

        return String.format("%02d", hour) + rest;
    }

    public static void main(String[] args) {
        String[] testTimes = {
            "07:05:45PM",
            "12:01:00AM",
            "12:00:00PM",
            "01:23:45AM"
        };

        for (String t : testTimes) {
            System.out.println(t + " -> " + timeConversion(t));
        }
    }
}
