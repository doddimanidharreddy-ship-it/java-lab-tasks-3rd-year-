// Problem Statement: Finding Local Date, Local Time, and Current Date-Time in Java.
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentLocalDateTime {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        System.out.println("Current Date: " + currentDate);
        System.out.println("Current Time: " + currentTime);
        System.out.println("Current Date & Time: " + currentDateTime.format(formatter));
    }
}
/*
OUTPUT:
Current Date: 2026-08-07
Current Time: 11:53:46
Current Date & Time: 07-08-2026 11:53:46
*/
