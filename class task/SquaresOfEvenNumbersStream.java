// Problem Statement: Display the squares of even numbers using Java Stream API.
import java.util.Arrays;
import java.util.List;

public class SquaresOfEvenNumbersStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("Squares of Even Numbers:");
        numbers.stream()
               .filter(num -> num % 2 == 0)
               .map(num -> num * num)
               .forEach(square -> System.out.println(square));
    }
}
/*
OUTPUT:
Squares of Even Numbers:
4
16
36
64
100
*/
