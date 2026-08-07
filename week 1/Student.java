// Problem Statement: Write a Java program demonstrating Object-Oriented Programming (Classes & Objects).
public class Student {
    private int id;
    private String name;
    private double marks;

    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public void displayDetails() {
        System.out.println("Student ID: " + id + " | Name: " + name + " | Marks: " + marks);
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Alice", 92.5);
        Student s2 = new Student(102, "Bob", 88.0);

        System.out.println("Student Records:");
        s1.displayDetails();
        s2.displayDetails();
    }
}
/*
OUTPUT:
Student Records:
Student ID: 101 | Name: Alice | Marks: 92.5
Student ID: 102 | Name: Bob | Marks: 88.0
*/
