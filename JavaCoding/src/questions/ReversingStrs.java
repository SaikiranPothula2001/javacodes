package questions;

import java.util.*;

public class ReversingStrs {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("ACS","EPAM","ERR","TCS"));
        System.out.println("Original List: " + words);

        reverseStringList(words);
        System.out.println("Reversed List: " + words);
    }

    public static void reverseStringList(List<String> list) {
        int start = 0;
        int end = list.size() - 1;

        while (start < end) {
            String temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
    }
}
