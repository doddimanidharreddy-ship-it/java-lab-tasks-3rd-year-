import java.time.LocalDate;

public class Session_11_Q1_JavaDateAndTime {
    public static String getDay(int month, int day, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        return date.getDayOfWeek().name();
    }

    public static void main(String[] args) {
        int month = 8, day = 5, year = 2015;
        String dayOfWeek = getDay(month, day, year);
        System.out.println("Day of the week for " + month + "/" + day + "/" + year + ": " + dayOfWeek);
    }
}
/*
OUTPUT:
Day of the week for 8/5/2015: WEDNESDAY
*/
