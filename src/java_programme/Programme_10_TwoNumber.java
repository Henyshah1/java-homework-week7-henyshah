package java_programme;

import java.util.Scanner;

/**
 * Write a java program to input any two number and ask user to enter their symbol (+, -, /, *)
 * find addition, Subtraction, multiplication and division according to their symbol (using if else)
 */
public class Programme_10_TwoNumber {
        //main method
        public static void main(String[] args) {
            //scanner method
            Scanner scanner = new Scanner(System.in);
            //print statement

            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            //print statement

            System.out.print("Enter a mathematical operation (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            double result = 0.0;
            //if else condition

            if (operator == '+') {
                result = num1 + num2;
            } else if (operator == '-') {
                result = num1 - num2;
            } else if (operator == '*') {
                result = num1 * num2;
            } else if (operator == '/') {
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Division by zero is not allowed.");
                    System.exit(0);
                }
            } else {
                System.out.println("Invalid operator. Please use +, -, *, or /.");
                System.exit(0);
            }

            System.out.println("Result: " + result);
            //scanner close
            scanner.close();
        }
    }
