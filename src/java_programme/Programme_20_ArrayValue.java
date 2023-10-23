package java_programme;

/**
 * Write a Java program to test if an array contains a specific value.
 */
public class Programme_20_ArrayValue {
    // Main Method
    public static void main(String[] args) {
        // Create an array of numbers
        int[] numbers = {10, 20, 30, 40, 50};

        // Value to search for
        int targetValue = 30;

        // Initialize a flag to check if the value is found
        boolean found = false;

        // Iterate through the array to check if it contains the target value
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == targetValue) {
                found = true;
                break; // Exit the loop when the value is found
            }
        }

        // Check and print the result
        if (found) {
            System.out.println("The array contains the value " + targetValue);
        } else {
            System.out.println("The array does not contain the value " + targetValue);
        }
    }
}
