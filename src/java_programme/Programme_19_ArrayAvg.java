package java_programme;

/**
 * Write a Java program to calculate the average value of array elements.
 */
public class Programme_19_ArrayAvg {
    // Main Method
    public static void main(String[] args) {
        // Create an array of numbers
        int[] numbers = {10, 20, 30, 40, 50};

        // Initialize variables for sum and average
        int sum = 0;
        double average;

        // Calculate the sum of the array elements
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // Calculate the average
        if (numbers.length > 0) {
            average = (double) sum / numbers.length;
        } else {
            average = 0.0; // Handle the case of an empty array
        }

        // Print the average
        System.out.println("The average of the array elements is: " + average);
    }
}
