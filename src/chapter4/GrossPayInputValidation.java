package chapter4;

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String args[]){
        // Initialize known variables
        int ratePerHour = 15;
        int maxHours = 40;

        // Get input for unknown variables
        System.out.println("How many hours did you work this week? ");
        Scanner scanner = new Scanner(System.in);
        double hoursWorkedThisWeek = scanner.nextDouble();

        // Validate the input
        // Ensure you update the sentinel (in this case it's hoursWorkedPerWeek)
        while(hoursWorkedThisWeek > maxHours || hoursWorkedThisWeek < 1){
            System.out.println("Invalid entry. Hours worked must be between 1 and 40. Try again! ");
            hoursWorkedThisWeek = scanner.nextDouble();
        }
        scanner.close();

        // Calculate the gross salary
        double gross = ratePerHour * hoursWorkedThisWeek;
        System.out.println("Gross Pay: $" + gross);
    }
}
