package java_programme;

import java.util.Scanner;

/**
 * Write a java program to input any year like (ex.2007)
 * find out if it is leap year or not?
 */
public class Programme_2_LeapYear {
    //Main method
    public static void main(String[] args) {
        //Scanner method
        Scanner scanner = new Scanner(System.in);
        //Print statment
        System.out.println("Enter a year: ");
        //Integer used for scanner
        int year = scanner.nextInt();
        //boolean datatype used
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        //If condition used
        if (isLeapYear) {
            //print statement
            System.out.println(year + " is a leap year." );
        }else {
            //Print statement
            System.out.println(year + " is not a leap year.");
        }
        //Scanner close
        scanner.close();
    }

}
