package questions;

public class PrimeFactor {

    public static void main(String[] args) {
        int number = 60; // Replace this with the number for which you want to find prime factors
        System.out.println("Prime factors of " + number + ":");
        findPrimeFactors(number);
    }

    // Function to find and print the prime factors of a number
    public static void findPrimeFactors(int number) {
        // Check for factors of 2
        while (number % 2 == 0) {
            System.out.print(2 + " ");
            number /= 2;
        }

        // Check for factors of odd numbers from 3 to the square root of the number
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                System.out.print(i + " ");
                number /= i;
            }
        }

        // If the remaining number is greater than 2, it is also a prime factor
        if (number > 2) {
            System.out.print(number);
        }
    }
}
