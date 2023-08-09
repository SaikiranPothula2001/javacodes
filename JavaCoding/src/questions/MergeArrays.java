package questions;

public class MergeArrays {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};

        // Merge the arrays
        int[] mergedArray = mergeArrays(array1, array2);

        // Print the merged array
        System.out.println("Merged array:");
        printArray(mergedArray);
    }

    // Function to merge two arrays into one array
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int length1 = arr1.length;
        int length2 = arr2.length;
        int[] merged = new int[length1 + length2];

        System.arraycopy(arr1, 0, merged, 0, length1);
        System.arraycopy(arr2, 0, merged, length1, length2);

        return merged;
    }

    // Function to print the contents of an array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
