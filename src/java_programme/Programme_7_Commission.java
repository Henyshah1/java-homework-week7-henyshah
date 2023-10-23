package java_programme;

import java.util.Scanner;

/**
 * Write a java program input sales id, seller's name, sales amount,
 * and salary basic and then fined this sales
 */
public class Programme_7_Commission {
    //main method
    public static void main(String[] args) {
        //scanner method

        Scanner scanner = new Scanner(System.in);

        // Input sales details
        System.out.print("Enter Sales ID: ");
        int salesId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter Seller's Name: ");
        String sellerName = scanner.nextLine();
        System.out.print("Enter Sales Amount: ");
        double salesAmount = scanner.nextDouble();
        System.out.print("Enter Salary Basic: ");
        double salaryBasic = scanner.nextDouble();

        // Calculate commission based on sales amount
        double commission = 0.0;
        if (salesAmount >= 50000) {
            commission = 0.35 * salesAmount;
        } else if (salesAmount >= 30000) {
            commission = 0.20 * salesAmount;
        } else if (salesAmount >= 20000) {
            commission = 0.10 * salesAmount;
        } else if (salesAmount >= 10000) {
            commission = 0.05 * salesAmount;
        }else {
            commission = 0.02 * salesAmount;
        }
        //print statement
        System.out.println("\nSales Commission for " + sellerName + " (sales ID: " + salesId + ")");
        System.out.println("Sales Amount: " + salesAmount);
        System.out.println("Salary Basic: " + salaryBasic);
        System.out.println("Sales Commission: " + commission);
        //scanner close
        scanner.close();
    }
}