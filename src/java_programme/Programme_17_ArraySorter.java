package java_programme;
/**
 * Write a Java program to sort a numeric array and a string array.
 */

import java.util.Arrays;

public class Programme_17_ArraySorter {
    // Main method
    public static void main(String[] args) {
        // Sorting a numeric array
        int[] numericArray = {10, 3, 7, 1, 5, 8, 2, 4, 6, 9};
        System.out.println("Original Numeric Array: " + Arrays.toString(numericArray));
        Arrays.sort(numericArray);
        System.out.println("Sorted Numeric Array: " + Arrays.toString(numericArray));

        // Sorting a string array
        String[] stringArray = {"apple", "banana", "cherry", "date", "fig", "grape"};
        System.out.println("\nOriginal String Array: " + Arrays.toString(stringArray));
        Arrays.sort(stringArray);
        System.out.println("Sorted String Array: " + Arrays.toString(stringArray));
    }
}
