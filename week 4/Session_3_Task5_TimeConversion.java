// Problem Statement: Time Conversion (HackerRank)
// Convert 12-hour AM/PM format to 24-hour military time.
public class Session_3_Task5_TimeConversion {
    public static String timeConversion(String s) {
        String ampm = s.substring(8);
        int hours = Integer.parseInt(s.substring(0, 2));
        String rest = s.substring(2, 8);

        if (ampm.equals("AM")) {
            if (hours == 12) hours = 0;
        } else { // PM
            if (hours != 12) hours += 12;
        }

        return String.format("%02d%s", hours, rest);
    }

    public static void main(String[] args) {
        String time1 = "07:05:45PM";
        String time2 = "12:01:00AM";
        System.out.println("12-hour: " + time1 + " -> 24-hour: " + timeConversion(time1));
        System.out.println("12-hour: " + time2 + " -> 24-hour: " + timeConversion(time2));
    }
}
/*
OUTPUT:
12-hour: 07:05:45PM -> 24-hour: 19:05:45
12-hour: 12:01:00AM -> 24-hour: 00:01:00
*/
