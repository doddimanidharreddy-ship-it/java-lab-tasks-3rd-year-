import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Session_11_Q2_NumberOfDaysBetweenTwoDates {
    public static int daysBetweenDates(String date1, String date2) {
        LocalDate d1 = LocalDate.parse(date1);
        LocalDate d2 = LocalDate.parse(date2);
        return (int) Math.abs(ChronoUnit.DAYS.between(d1, d2));
    }

    public static void main(String[] args) {
        String date1 = "2019-06-29";
        String date2 = "2019-06-30";
        int days = daysBetweenDates(date1, date2);
        System.out.println("Days between " + date1 + " and " + date2 + ": " + days);
    }
}
/*
OUTPUT:
Days between 2019-06-29 and 2019-06-30: 1
*/
