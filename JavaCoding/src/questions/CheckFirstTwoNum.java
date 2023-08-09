package questions;

public class CheckFirstTwoNum {

    public static void main(String[] args) {
        String str = "hello worldhe"; // Replace this with the string you want to check

        if (checkFirstTwoAtEnd(str)) {
            System.out.println("The first two characters are present at the end of the string.");
        } else {
            System.out.println("The first two characters are NOT present at the end of the string.");
        }
    }

    public static boolean checkFirstTwoAtEnd(String str) {
        if (str.length() < 2) {
            return false;
        }

        String firstTwoCharacters = str.substring(0, 2);
        return str.endsWith(firstTwoCharacters);
    }
}
