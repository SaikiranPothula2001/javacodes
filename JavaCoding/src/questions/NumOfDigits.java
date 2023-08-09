package questions;

public class NumOfDigits {

    public static void main(String[] args) {
        int number = 12345; // Replace this with the number you want to find the number of digits

        int numberOfDigits = countDigits(number);

        System.out.println("Number of digits in " + number + " is: " + numberOfDigits);
    }

    // Function to calculate the number of digits in a number
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}
