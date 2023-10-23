package java_programme;

import java.util.Scanner;

/**
 * Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */
public class Programme_1_TernaryOperator {
    //Main method
    public static void main(String[] args) {
        //Scanner method
        Scanner scanner = new Scanner(System.in);
        //Print statement for scanner
        System.out.println("Enter a number: ");
        //Integer used for scanner
        int number = scanner.nextInt();
        //String used for result
        String result = (number % 2 == 0) ? "even" : "odd";
        //Print statement
        System.out.println("The input number is " + result + " . ");
        //scanner close
        scanner.close();
    }
}
