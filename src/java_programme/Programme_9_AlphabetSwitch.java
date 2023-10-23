package java_programme;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else)
 * if any other alphabet should be invalid entry
 * switch statement
 */
public class Programme_9_AlphabetSwitch {
    //main method
    public static void main(String[] args) {
    //scanner statement
        Scanner scanner = new Scanner(System.in);

        //print statement
        System.out.println("Enter an alphabet (A to F): ");
        char alphabet = scanner.next().charAt(0);

        //switch statement
        switch (alphabet) {
            case 'A':
            case 'a':
                System.out.println("City Name: Amsterdam");
                break;
            case 'B':
            case 'b':
                System.out.println("City Name: Berlin");
                break;
            case 'C':
            case 'c':
                System.out.println("City Name: Cario");
                break;
            case 'D':
            case 'd':
                System.out.println("City Name: Dublin");
                break;
            case 'E':
            case 'e':
                System.out.println("City Name: Edinburgh");
                break;
            case 'F':
            case 'f':
                System.out.println("City Name: France");
                break;
            default:
                System.out.println("Invalid entry. Please enter an alphabet from A to F.");
        }
        //scanner close
        scanner.close();
    }
}
