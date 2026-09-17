package ClassRoom_Tasks;

import java.util.*;
import java.util.stream.*;

public class classtask_task1_SquareOfNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);

        List<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println(squares);
    }
}
