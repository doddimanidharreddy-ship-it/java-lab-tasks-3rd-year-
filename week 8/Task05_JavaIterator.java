import java.util.*;

/**
 * Task 5: HackerRank - Java Iterator
 * 
 * Problem Summary:
 * Given an ArrayList containing integers, string "###", and strings, 
 * modify the iterator logic to skip elements until "###" is encountered, 
 * then print only the remaining string elements.
 * 
 * Concept: Java Iterator interface.
 */
public class Task05_JavaIterator {

    public static Iterator func(ArrayList mylist) {
        Iterator it = mylist.iterator();
        while (it.hasNext()) {
            Object element = it.next();
            if (element instanceof String && element.equals("###")) {
                break; // Stop at "###", so subsequent calls to it.next() return elements after "###"
            }
        }
        return it;
    }

    public static void main(String[] args) {
        ArrayList mylist = new ArrayList();
        mylist.add(42);
        mylist.add(10);
        mylist.add("###");
        mylist.add("Hello");
        mylist.add("Java");

        Iterator it = func(mylist);
        while (it.hasNext()) {
            Object element = it.next();
            System.out.println((String) element);
        }
        // Expected output:
        // Hello
        // Java
    }
}
