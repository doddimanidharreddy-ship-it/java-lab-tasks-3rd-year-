import java.util.*;

/**
 * Task 2: HackerRank - Java Instanceof Keyword
 * 
 * Problem Summary:
 * Count the number of instances of Student, Rockstar, and Hacker in an ArrayList 
 * using the Java 'instanceof' keyword.
 * 
 * Time Complexity: O(N) where N is list length.
 * Space Complexity: O(1).
 */
public class week7_task1_JavaInstanceOfKeyword {

    static class Student {}
    static class Rockstar {}
    static class Hacker {}

    public static String countInstances(ArrayList<Object> mylist) {
        int countStudent = 0;
        int countRockstar = 0;
        int countHacker = 0;

        for (int i = 0; i < mylist.size(); i++) {
            Object element = mylist.get(i);
            if (element instanceof Student) {
                countStudent++;
            }
            if (element instanceof Rockstar) {
                countRockstar++;
            }
            if (element instanceof Hacker) {
                countHacker++;
            }
        }
        return countStudent + " " + countRockstar + " " + countHacker;
    }

    public static void main(String[] args) {
        ArrayList<Object> mylist = new ArrayList<>();
        mylist.add(new Student());
        mylist.add(new Rockstar());
        mylist.add(new Rockstar());
        mylist.add(new Hacker());
        mylist.add(new Student());

        System.out.println("Counts (Student Rockstar Hacker): " + countInstances(mylist));
        // Expected: 2 2 1
    }
}

