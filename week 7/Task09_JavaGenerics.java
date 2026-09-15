import java.util.*;

/**
 * Task 9: HackerRank - Java Generics
 * 
 * Problem Summary:
 * Write a single generic method printArray that can print elements of any array type 
 * (e.g. Integer[], String[]).
 * 
 * Concept: Generics in Java.
 */
public class Task09_JavaGenerics {

    static class Printer {
        public <E> void printArray(E[] array) {
            for (E element : array) {
                System.out.println(element);
            }
        }
    }

    public static void main(String[] args) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };

        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
    }
}
