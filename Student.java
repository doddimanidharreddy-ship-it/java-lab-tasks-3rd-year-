// Java Program to Demonstrate OOP Concepts
// Class, Objects, Constructor, and Methods
public class Student {

    // Instance variables representing attributes of a Student
    String name;      // Name of the student
    int age;          // Age of the student
    double grade;     // Grade/marks of the student

    // Parameterized constructor to initialize Student object
    // Called automatically when a new Student object is created
    Student(String name, int age, double grade)
    {
        this.name = name;     // Assign name to current object
        this.age = age;       // Assign age to current object
        this.grade = grade;   // Assign grade to current object
    }

    // Method to display all details of the student
    void displayInfo()
    {
        System.out.println("--- Student Details ---");
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("Grade : " + grade);
    }

    // Method to check if student has passed or failed
    // Minimum passing grade is 40
    void checkResult()
    {
        if (grade >= 40)
            System.out.println(name + " has PASSED");
        else
            System.out.println(name + " has FAILED");
    }

    // Main driver method
    public static void main(String[] args)
    {
        // Create three Student objects using parameterized constructor
        Student s1 = new Student("Alice", 20, 85.5);
        Student s2 = new Student("Bob", 22, 35.0);
        Student s3 = new Student("Charlie", 21, 72.0);

        // Display info and check result for Student 1
        s1.displayInfo();
        s1.checkResult();

        System.out.println();

        // Display info and check result for Student 2
        s2.displayInfo();
        s2.checkResult();

        System.out.println();

        // Display info and check result for Student 3
        s3.displayInfo();
        s3.checkResult();
    }
}
