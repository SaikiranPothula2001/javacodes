package questions;

import java.util.*;
import java.util.stream.Collectors;

public class NumlistToMap {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Convert the list to a map where the number is the key, and its square is the value
        Map<Integer, Integer> numberMap = numbers.stream()
                .collect(Collectors.toMap(
                        number -> number,           // Key mapper: Identity function, using the number as key
                        number -> number * number   // Value mapper: Mapping the number to its square
                ));

        // Print the resulting map
        System.out.println(numberMap);
    }
}

