package questions;

public class EvenAndOdd {

    public static void main(String[] args) {
        // Create an array of random numbers
        int[] randomNumbers = {12, 34, 7, 23, 56, 45, 10, 78, 90}; // Replace this with your array

        // Print the array
        System.out.println("Array of numbers:");
        printArray(randomNumbers);

        // Print odd and even numbers
        System.out.println("\nOdd numbers:");
        printOddNumbers(randomNumbers);

        System.out.println("\nEven numbers:");
        printEvenNumbers(randomNumbers);
    }

    // Function to print odd numbers from the array
    public static void printOddNumbers(int[] array) {
        for (int num : array) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    // Function to print even numbers from the array
    public static void printEvenNumbers(int[] array) {
        for (int num : array) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    // Function to print the contents of an array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
