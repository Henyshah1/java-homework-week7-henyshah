package java_programme;

import java.util.Scanner;

public class Programme_5_SalarySlip {
    // Main Method
    public static void main(String[] args) {
        // Scanner
        Scanner scanner = new Scanner(System.in);

        //Input Employee Details
        System.out.println("Enter Employee ID: ");
        int employeeId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.println("Enter Employee Name: ");
        String employeeName = scanner.nextLine();
        System.out.println("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        // Calculate HRA, TA, DA, PF and Gross Salary
        double hra = 0.10 * basicSalary;
        double ta = 0.09 * basicSalary;
        double da = 0.08 * basicSalary;
        double pf = 0.20 * basicSalary;
        double grosssalary = basicSalary + hra + ta + da - pf;

        // Print the salary slip
        System.out.println("\nsalary details for employee" + employeeName + " (ID: " + employeeId + ")" );
        System.out.println("Basic salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("TA: " + ta);
        System.out.println("DA: " + da);
        System.out.println("PF: " + pf);
        System.out.println("Gross Salary: " + grosssalary);
        //scanner close
        scanner.close();
    }
}
