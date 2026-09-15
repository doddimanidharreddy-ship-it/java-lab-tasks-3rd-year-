import java.util.*;

/**
 * Task 6: HackerRank - Grading Students
 * 
 * Problem Summary:
 * Round grades according to the following rules:
 * - If the difference between grade and next multiple of 5 is less than 3, round grade up to next multiple of 5.
 * - If grade is less than 38, no rounding occurs as it's a failing grade.
 * 
 * Time Complexity: O(N) where N is number of grades.
 * Space Complexity: O(N) for result list.
 */
public class Task06_GradingStudents {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> roundedGrades = new ArrayList<>();

        for (int grade : grades) {
            if (grade < 38) {
                roundedGrades.add(grade);
            } else {
                int nextMultipleOf5 = ((grade / 5) + 1) * 5;
                if (nextMultipleOf5 - grade < 3) {
                    roundedGrades.add(nextMultipleOf5);
                } else {
                    roundedGrades.add(grade);
                }
            }
        }

        return roundedGrades;
    }

    public static void main(String[] args) {
        List<Integer> grades = Arrays.asList(73, 67, 38, 33);
        System.out.println("Original Grades: " + grades);
        System.out.println("Rounded Grades:  " + gradingStudents(grades));
        // Expected: [75, 67, 40, 33]
    }
}
