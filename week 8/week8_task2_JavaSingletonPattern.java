import java.util.*;

/**
 * Task 3: HackerRank - Java Singleton Pattern
 * 
 * Problem Summary:
 * Implement a Singleton class with a private constructor and a public String variable `str`.
 * The class must have a static method `getSingleInstance()` returning the unique instance.
 * 
 * Concept: Singleton Design Pattern.
 */
public class week8_task2_JavaSingletonPattern {

    static class Singleton {
        public String str;
        private static Singleton instance;

        private Singleton() {}

        public static Singleton getSingleInstance() {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }
    }

    public static void main(String[] args) {
        Singleton s1 = Singleton.getSingleInstance();
        s1.str = "Hello I am a singleton!";

        Singleton s2 = Singleton.getSingleInstance();

        System.out.println("s1.str: " + s1.str);
        System.out.println("s2.str: " + s2.str);
        System.out.println("Same instance? " + (s1 == s2)); // Expected: true
    }
}

