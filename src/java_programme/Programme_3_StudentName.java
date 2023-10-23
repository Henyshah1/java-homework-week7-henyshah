package java_programme;

import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and English marks (marks is between 0 to 100
 * if it is out of range print error message “Invalid Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C
 * print Mark Sheet in following format
 */
public class Programme_3_StudentName {
    //Main Method
    public static void main(String[] args) {
        //Scanner method
        Scanner scanner = new Scanner(System.in);

        //Input student details
        System.out.println("Enter Student name: ");
        String name = scanner.nextLine();
        System.out.println("Enter roll number: ");
        int rollNo = scanner.nextInt();

        //Input subject marks (Math, Science, English)
        System.out.println("Enter Math Marks: ");
        int mathMArks = scanner.nextInt();
        System.out.println("Enter Science Marks: ");
        int scienceMarks = scanner.nextInt();
        System.out.println("Enter English Marks: ");
        int englishMArks = scanner.nextInt();

        // Check for valid marks (0 to 100)
        if (isValidMarks(mathMArks) && isValidMarks(scienceMarks) && isValidMarks(englishMArks)) {
            //Calculate total marks
            int totalMarks = mathMArks + scienceMarks + englishMArks;

            //calculate percentage
            double percentage = (totalMarks / 300.0) * 100;

            //Determine result and grade
            String result = (percentage >= 35) ? "Pass" : "Fail";
            String grade = calculateGrade(percentage);

            //Print Mark sheet
            System.out.println(" ------------------------------ ");
            System.out.println("|                              |");
            System.out.println("|        Mark Sheet            |");
            System.out.println("|                              |");
            System.out.println(" ------------------------------ ");
            System.out.println("|  Name: " + name + "          |");
            System.out.println("|  Roll No: " + rollNo+"       |");
            System.out.println("|______________________________|");
            System.out.println("|  Subjects :     Marks        |");
            System.out.println("|______________________________|");
            System.out.println("| Math: " + mathMArks + "      |");
            System.out.println("| Science: "+ scienceMarks+"   |");
            System.out.println("| English : "+ englishMArks+"  |");
            System.out.println("|______________________________|");
            System.out.println("| Total: "+ totalMarks +"      |");
            System.out.println("|______________________________|");
            System.out.println("| Percentage: " + percentage +"|");
            System.out.println("| Result: "+ result +"         |");
            System.out.println("| Grade: "+ grade +"           |");
            System.out.println("|______________________________|");
        } else {
            System.out.println("Invalid Input. Marks should be between 0 to 100.");
        }
        scanner.close();
    }
    // Function to check if marks are within the valid range (0 to 100)
    public static boolean isValidMarks(int marks) {
        return marks >= 0 && marks <= 100;
    }
    // Function to calculate grade based on percentage
    public static String calculateGrade(double percentage){
        if (percentage >= 80){
            return "A+";
        } else if (percentage >= 60) {
            return "A";
        } else if (percentage >= 50) {
            return "B";
        } else if (percentage >= 35) {
            return "C";
        }else {
            return "F";
        }
    }
}

