package questions;

public class PrimeNumInRange {

    public static void main(String[] args) {
        int startRange = 10; // Replace this with the starting number of the range
        int endRange = 50;   // Replace this with the ending number of the range

        System.out.println("Prime numbers between " + startRange + " and " + endRange + ":");
        findPrimeNumbersInRange(startRange, endRange);
    }

    // Function to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        
        if (number == 2 || number == 3) {
            return true;
        }
        
        if (number % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Function to find and print prime numbers within a given range
    public static void findPrimeNumbersInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
