// Problem Statement: Stream pipeline demonstration (Stream -> Filter -> Map -> forEach).
import java.util.Arrays;
import java.util.List;

public class StreamPipelineDemo {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "avocado", "cherry", "apricot", "mango");

        System.out.println("Filtered & Transformed Fruits (Starts with 'a'):");
        // 1. Convert collection into a stream
        // 2. Filter elements starting with 'a'
        // 3. Transform to Uppercase using map()
        // 4. Display result using forEach()
        fruits.stream()
              .filter(fruit -> fruit.startsWith("a"))
              .map(String::toUpperCase)
              .forEach(result -> System.out.println(result));
    }
}
/*
OUTPUT:
Filtered & Transformed Fruits (Starts with 'a'):
APPLE
AVOCADO
APRICOT
*/
