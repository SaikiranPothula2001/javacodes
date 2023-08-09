package questions;

import java.util.HashSet;
import java.util.Set;

public class SameElemntsInArrays {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 5, 1, 2, 4};

        boolean result = areArraysEqual(array1, array2);

        if (result) {
            System.out.println("Both arrays contain the same elements.");
        } else {
            System.out.println("Arrays do not contain the same elements.");
        }
    }

    // Function to check if two arrays contain the same elements
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : arr1) {
            set1.add(num);
        }

        for (int num : arr2) {
            set2.add(num);
        }

        return set1.equals(set2);
    }
}
