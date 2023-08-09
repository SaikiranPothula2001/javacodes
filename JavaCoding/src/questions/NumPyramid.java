package questions;

import java.util.Scanner;

public class NumPyramid {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        printNumberPyramid(rows);

        scanner.close();
    }

    // Function to print the Number Pyramid
    public static void printNumberPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            // Print spaces before the numbers
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print increasing numbers in the first half
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Print decreasing numbers in the second half
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
