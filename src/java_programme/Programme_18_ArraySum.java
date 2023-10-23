package java_programme;

/**
 * Write a Java program to sum values of an array.
 */
public class Programme_18_ArraySum {
    // Main Method
    public static void main(String[] args) {
        // Create an array of numbers
        int[] numbers = {10, 20, 30, 40, 50};

        // Initialize a variable to store the sum
        int sum = 0;

        // Calculate the sum of the array elements
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // Print the sum
        System.out.println("The sum of the array elements is: " + sum);
    }
}
