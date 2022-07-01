package chapter5;

import java.util.Scanner;

/*
* VARIABLE SCOPE
* Write an 'instant credit check' program that approves
* anyone who makes more than $25,000 and has a credit score
* of 700 or better. Reject all others.
 */
public class InstantCreditCheck {

    // Initialize what we know in the class level due to scope
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);


    public static void main(String args[]) {

        // Get what we don't know by calling the method getFormData
        double salaryS = getSalary();
        int creditScoreC = getCreditScore();
        scanner.close();

        // Check if user is qualified
        // NB Value in creditScoreC is stored in creditScore
        // Argument list maps to parameter list
        boolean qualified = isUserQualified(creditScoreC, salaryS);

        // Notify the user
        // argument qualified and parameter isQualified are two separate variables
        notifyUser(qualified);
    }

    // Method that gets the form data of what we don't know
    public static double getSalary() {
        System.out.println("Enter your salary: ");
        double salary = scanner.nextDouble();
        return salary;
    }

    public static int getCreditScore() {
        System.out.println("Enter your credit score: ");
        int creditScore = scanner.nextInt();
        return creditScore;
    }

    // Method to check whether user is qualified
    // creditScore = creditScore salary = salary
    public static boolean isUserQualified(int creditScore, double salary) {
        if (creditScore >= requiredCreditScore && salary >= requiredSalary) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void notifyUser(boolean isQualified){
        if (isQualified){
            System.out.println("Congrats! You've been approved.");
        }
        else {
            System.out.println("Sorry, You've been declined.");
        }
    }
}
