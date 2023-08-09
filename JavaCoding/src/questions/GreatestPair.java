package questions;

public class GreatestPair {

    public static void main(String[] args) {
        int[] array = {12, 34, 7, 23, 56, 45, 10, 78, 90}; // Replace this with your array

        if (array.length < 2) {
            System.out.println("Array must contain at least 2 elements.");
        } else {
            int[] greatestPair = findGreatestPair(array);
            System.out.println("Greatest Pair: " + greatestPair[0] + " and " + greatestPair[1]);
        }
    }

    // Function to find the greatest pair from an array
    public static int[] findGreatestPair(int[] array) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest) {
                secondLargest = num;
            }
        }

        int[] greatestPair = {largest, secondLargest};
        return greatestPair;
    }
}
