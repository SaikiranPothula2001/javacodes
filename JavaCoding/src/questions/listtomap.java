package questions;

import java.util.*;
import java.util.stream.Collectors;

 

public class listtomap {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 30, 2, 323, 23, 23, 123, 6, 34);

        Map<Integer, Integer> map = list.stream()
                .collect(Collectors.toMap(
                       
                        key -> key,                
                        value -> value,
                        (existingValue, newValue) -> newValue
                ));

 

        System.out.println(map);
    }
}