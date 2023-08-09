package questions;

public class ArmInRange {

    public static void main(String[] args) {
        int startRange = 100; // Replace this with the starting number of the range
        int endRange = 1000;  // Replace this with the ending number of the range

        System.out.println("Armstrong numbers between " + startRange + " and " + endRange + ":");
        findArmstrongNumbersInRange(startRange, endRange);
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

    // Function to check if a number is an Armstrong number
    public static boolean isArmstrongNumber(int number) {
        int temp = number;
        int numDigits = countDigits(number);
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numDigits);
            temp /= 10;
        }

        return sum == number;
    }

    // Function to find and print Armstrong numbers within a given range
    public static void findArmstrongNumbersInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isArmstrongNumber(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
