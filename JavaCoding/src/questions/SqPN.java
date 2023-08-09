package questions;

public class SqPN {
    public static void main(String[] args) {
        int[] numbers = { 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        squarePrimeNumbers(numbers);

        System.out.println("Array after squaring prime numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static void squarePrimeNumbers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                arr[i] *= arr[i]; // Square the prime number
            }
        }
    }

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

