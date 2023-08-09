package questions;

import java.util.ArrayList;

public class PrimeNumberList {
    public static void main(String[] args) {
        int limit = 100; // Change this value to set the limit for prime numbers
        ArrayList<Integer> primeList = new ArrayList<>();

        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                primeList.add(i);
            }
        }

        System.out.println("List of prime numbers up to " + limit + ":");
        System.out.println(primeList);
    }

    // Function to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

