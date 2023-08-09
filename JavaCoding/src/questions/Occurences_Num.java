package questions;

import java.util.HashMap;
import java.util.Map;

public class Occurences_Num {

	public static void main(String[] args) {
        String sentence = "Capgemini";
        Map<Character, Integer> alphabetCountMap = countAlphabets(sentence);
        System.out.println("Alphabet count: " + alphabetCountMap);
    }

 

    public static Map<Character, Integer> countAlphabets(String sentence) {
        Map<Character, Integer> alphabetCountMap = new HashMap<>();

 

        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
                alphabetCountMap.put(c, alphabetCountMap.getOrDefault(c, 0) + 1);
            }
        }

 

        return alphabetCountMap;
    }

}
