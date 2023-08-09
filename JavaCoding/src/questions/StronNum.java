package questions;

public class StronNum { //Sum of the factorials of the given num

    public static void main(String[] args) {
        int number = 145; // Replace this with the number you want to check

        if (isStrongNumber(number)) {
            System.out.println(number + " is a strong number.");
        } else {
            System.out.println(number + " is not a strong number.");
        }
    }

    // Function to calculate the factorial of a number
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // Function to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int temp = number;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        return sum == number;
    }
}
