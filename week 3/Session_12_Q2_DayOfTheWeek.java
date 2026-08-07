import java.time.LocalDate;

public class Session_12_Q2_DayOfTheWeek {
    public static String dayOfTheWeek(int day, int month, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        String dayName = date.getDayOfWeek().name();
        return dayName.charAt(0) + dayName.substring(1).toLowerCase();
    }

    public static void main(String[] args) {
        int day = 31, month = 8, year = 2019;
        String dayName = dayOfTheWeek(day, month, year);
        System.out.println("Day of the week for " + day + "/" + month + "/" + year + ": " + dayName);
    }
}
/*
OUTPUT:
Day of the week for 31/8/2019: Saturday
*/
