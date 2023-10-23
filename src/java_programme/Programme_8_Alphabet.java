package java_programme;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else)
 * if any other alphabet should be invalid entry
 */
public class Programme_8_Alphabet {
    //Main method
    public static void main(String[] args) {
        //scanner method
        Scanner scanner = new Scanner(System.in);

        //Print statement
        System.out.println("Enter an alphabet (A to F): ");
        char alphabet = scanner.next().charAt(0);
        //if condition

        if (alphabet == 'A' || alphabet == 'a') {
            System.out.println("City Name: Amsterdam");
        } else if (alphabet == 'B' || alphabet == 'b') {
            System.out.println("City Name: Berlin");
        } else if (alphabet == 'C' || alphabet == 'c') {
            System.out.println("City Name: Cario");
        } else if (alphabet == 'D' || alphabet == 'd') {
            System.out.println("City Name: Dublin");
        } else if (alphabet == 'E' || alphabet == 'e') {
            System.out.println("City Name: Edinburgh");
        } else if (alphabet == 'F' || alphabet == 'f') {
            System.out.println("City Name: France");
        }else {
            System.out.println("Invalid entry. Please enter an alphabet from A to F.");
        }
        //scanner close
        scanner.close();
    }
}
