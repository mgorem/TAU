package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main (String args[]){
        // Get Number of Hours Worked
        System.out.println("Enter the number of hours that the employee works: ");
        Scanner scanner = new Scanner(System.in);
        int hoursWorked =  scanner.nextInt();

        // Get the Hourly pay rate
        System.out.println("Enter the employees pay rate: ");
        double ratePerHour = scanner.nextDouble();
        scanner.close(); // CLose scanner after final usage to save on memory

        // Multiply Hours and Pay Rate
        double grossPay = hoursWorked * ratePerHour;

        // Display Result
        System.out.println("The employee's gross pay is $" + grossPay);
    }
}
