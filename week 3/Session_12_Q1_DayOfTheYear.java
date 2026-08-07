import java.time.LocalDate;

public class Session_12_Q1_DayOfTheYear {
    public static int dayOfYear(String date) {
        LocalDate d = LocalDate.parse(date);
        return d.getDayOfYear();
    }

    public static void main(String[] args) {
        String date = "2019-01-09";
        int result = dayOfYear(date);
        System.out.println("Day of the year for " + date + ": " + result);
    }
}
/*
OUTPUT:
Day of the year for 2019-01-09: 9
*/
