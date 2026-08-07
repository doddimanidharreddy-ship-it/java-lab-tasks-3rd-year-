// Problem Statement: Print names in uppercase letters using Java Stream API.
import java.util.Arrays;
import java.util.List;

public class UppercaseNamesStream {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("john", "alice", "bob", "david", "emma");

        System.out.println("Names in Uppercase:");
        names.stream()
             .map(String::toUpperCase)
             .forEach(name -> System.out.println(name));
    }
}
/*
OUTPUT:
Names in Uppercase:
JOHN
ALICE
BOB
DAVID
EMMA
*/
