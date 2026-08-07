import java.util.*;

public class Session_13_Q1_JavaPriorityQueue {
    static class Student {
        int id;
        String name;
        double cgpa;

        public Student(int id, String name, double cgpa) {
            this.id = id;
            this.name = name;
            this.cgpa = cgpa;
        }

        public int getId() { return id; }
        public String getName() { return name; }
        public double getCgpa() { return cgpa; }
    }

    public static List<String> getStudents(List<String> events) {
        PriorityQueue<Student> pq = new PriorityQueue<>(
            Comparator.comparing(Student::getCgpa, Comparator.reverseOrder())
                .thenComparing(Student::getName)
                .thenComparingInt(Student::getId)
        );

        for (String event : events) {
            String[] parts = event.split(" ");
            if (parts[0].equals("ENTER")) {
                String name = parts[1];
                double cgpa = Double.parseDouble(parts[2]);
                int id = Integer.parseInt(parts[3]);
                pq.add(new Student(id, name, cgpa));
            } else if (parts[0].equals("SERVED")) {
                pq.poll();
            }
        }

        List<String> result = new ArrayList<>();
        while (!pq.isEmpty()) {
            result.add(pq.poll().getName());
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> events = Arrays.asList(
            "ENTER John 3.75 50",
            "ENTER Mark 3.8 24",
            "ENTER Shafaet 3.7 35",
            "SERVED",
            "ENTER Samiha 3.85 36",
            "SERVED"
        );
        List<String> remaining = getStudents(events);
        System.out.println("Remaining Students in PriorityQueue: " + remaining);
    }
}
/*
OUTPUT:
Remaining Students in PriorityQueue: [John, Shafaet]
*/
