// Problem Statement: Simple Age Calculator using Java Date and Time API.
import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {
    public static void calculateAge(LocalDate birthDate, LocalDate currentDate) {
        Period period = Period.between(birthDate, currentDate);
        System.out.println("Birth Date: " + birthDate);
        System.out.println("Current Date: " + currentDate);
        System.out.println("Age: " + period.getYears() + " Years, " 
                           + period.getMonths() + " Months, " 
                           + period.getDays() + " Days");
    }

    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(2004, 5, 15);
        LocalDate currentDate = LocalDate.of(2026, 8, 7);
        calculateAge(birthDate, currentDate);
    }
}
/*
OUTPUT:
Birth Date: 2004-05-15
Current Date: 2026-08-07
Age: 22 Years, 2 Months, 23 Days
*/
