package java_programme;
/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”.
 */

import java.util.Scanner;

public class Programme_16_CheckNumber {
    // Main Method
    public static void main(String[] args) {
        // Scanner
        Scanner scanner = new Scanner(System.in);

        //Input number to find Positive or Negative or Zero.
        System.out.println("Enter a number: ");
        double number = scanner.nextDouble();

        // If-else used for decision making
        if (number > 0) {
            System.out.println("The number is Positive.");
        } else if (number < 0) {
            System.out.println("The number is Negative.");
        }else {
            System.out.println("The number is Zero.");
        }
        scanner.close();
    }
}
