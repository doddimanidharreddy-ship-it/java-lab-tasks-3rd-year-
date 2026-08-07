import java.util.HashSet;
import java.util.Set;

public class Session_10_Q2_JavaHashSet {
    public static void main(String[] args) {
        String[] pairLeft = {"john", "john", "john", "mary", "mary"};
        String[] pairRight = {"tom", "mary", "tom", "anna", "anna"};

        Set<String> set = new HashSet<>();
        
        System.out.println("Unique pairs count after each insertion:");
        for (int i = 0; i < pairLeft.length; i++) {
            set.add(pairLeft[i] + " " + pairRight[i]);
            System.out.println("Step " + (i + 1) + ": " + set.size());
        }
    }
}
/*
OUTPUT:
Unique pairs count after each insertion:
Step 1: 1
Step 2: 2
Step 3: 2
Step 4: 3
Step 5: 3
*/
