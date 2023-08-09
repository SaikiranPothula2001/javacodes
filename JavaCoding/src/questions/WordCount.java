package questions;

public class WordCount {
    public static void main(String[] args) {
    	String str = "Hello World";

        int wordCount = countWords(str);
        System.out.println("Number of words in the sentence: " + wordCount);

        
    }

    public static int countWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0;
        }

        // Split the sentence into words using whitespace as a delimiter
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }
}

