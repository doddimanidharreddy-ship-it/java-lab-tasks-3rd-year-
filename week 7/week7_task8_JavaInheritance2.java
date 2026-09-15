import java.util.*;

/**
 * Task 8: HackerRank - Java Inheritance II
 * 
 * Problem Summary:
 * Create a class Arithmetic with method add(int a, int b) returning sum.
 * Create class Adder extending Arithmetic.
 * 
 * Concept: Inheritance.
 */
public class week7_task8_JavaInheritance2 {

    static class Arithmetic {
        public int add(int a, int b) {
            return a + b;
        }
    }

    static class Adder extends Arithmetic {}

    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println("My superclass is: " + adder.getClass().getSuperclass().getName());
        System.out.print(adder.add(10, 32) + " " + adder.add(10, 3) + " " + adder.add(10, 10) + "\n");
    }
}

