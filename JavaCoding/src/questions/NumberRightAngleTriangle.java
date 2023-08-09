package questions;

public class NumberRightAngleTriangle {

    public static void main(String[] args) {
        int rows = 5; // Replace this with the number of rows you want in the triangle

        // Print the number right-angle triangle
        printNumberRightAngleTriangle(rows);
    }

    // Function to print the number right-angle triangle
    public static void printNumberRightAngleTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
