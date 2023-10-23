package java_programme;

import java.util.Scanner;

/**
 * Write a program that tells us
 * input value is number or an alphabet or symbol.
 */
public class Programme_12_Alphabet {
    //main method
    public static void main(String[] args) {
      //scanner method
        Scanner scanner = new Scanner(System.in);
        //Print statement
        System.out.println("Enter a acharacter: ");
        char inputChar = scanner.next().charAt(0);

        //if else condition
        if (Character.isDigit(inputChar)) {
            System.out.println("The input is a number.");
        } else if (Character.isLetter(inputChar)) {
            System.out.println("The input is a alphabet.");
        } else if (Character.isLetterOrDigit(inputChar)) {
            System.out.println("The input is an alphanumeric character.");
        }else {
            System.out.println("The input is a symbol or special character.");
        }
        //scanner close
        scanner.close();

    }
}
