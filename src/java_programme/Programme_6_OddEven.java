package java_programme;

import java.util.Scanner;

/**
 * Write a java program to input any number
 * and find out if it’s odd or even
 */
public class Programme_6_OddEven {
    //main method
    public static void main(String[] args) {
        //scanner method
        Scanner scanner = new Scanner(System.in);
        //Print statement
        System.out.println("Enter a number: ");
        //integer used by scanner
        int number = scanner.nextInt();

        //if condition
        if (number % 2 == 0){
            System.out.println(number + " is even.");
        }else {
            System.out.println(number + " is odd.");
        }
        //scanner close
        scanner.close();
    }
}
