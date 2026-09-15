import java.util.*;

/**
 * Task 7: HackerRank - Java Inheritance I
 * 
 * Problem Summary:
 * Create a Bird class that inherits from Animal and adds a sing() method.
 * 
 * Concept: Inheritance (extends keyword).
 */
public class week7_task6_JavaInheritance1 {

    static class Animal {
        void walk() {
            System.out.println("I am walking");
        }
    }

    static class Bird extends Animal {
        void fly() {
            System.out.println("I am flying");
        }

        void sing() {
            System.out.println("I am singing");
        }
    }

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
    }
}

