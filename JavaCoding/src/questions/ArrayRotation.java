package questions;

public class ArrayRotation {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int rotationSteps = 2; // Replace this with the number of steps you want to rotate

        // Print the original array
        System.out.println("Original array:");
        printArray(array);

        // Rotate the array to the left
        int[] rotatedLeft = rotateLeft(array, rotationSteps);
        System.out.println("\nArray after rotating left:");
        printArray(rotatedLeft);

        // Rotate the array to the right
        int[] rotatedRight = rotateRight(array, rotationSteps);
        System.out.println("\nArray after rotating right:");
        printArray(rotatedRight);
    }

    // Function to rotate an array to the left
    public static int[] rotateLeft(int[] arr, int steps) {
        int n = arr.length;
        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) {
            rotated[(i - steps + n) % n] = arr[i];
        }
        return rotated;
    }

    // Function to rotate an array to the right
    public static int[] rotateRight(int[] arr, int steps) {
        int n = arr.length;
        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) {
            rotated[(i + steps) % n] = arr[i];
        }
        return rotated;
    }

    // Function to print the contents of an array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
