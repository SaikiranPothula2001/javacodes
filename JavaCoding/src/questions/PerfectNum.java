package questions;

public class PerfectNum {

    public static void main(String[] args) { //Sum of the divisors of a given num
        int number = 28; // Replace this with the number you want to check

        if (isPerfectNumber(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }

    // Function to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int sum = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }
}
