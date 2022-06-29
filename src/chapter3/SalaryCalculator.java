package chapter3;

import java.util.Scanner;

/*
If statement
All sales people get a payment of 1000 a week.
Salespeople who exceed 10 sales get an additional bonus of $250
 */
public class SalaryCalculator {
    public static void main(String args[]){
        // Initialize the known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;
        // Get values for the unknown
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int salesInAWeek = scanner.nextInt();
        scanner.close();

        // Quick Detour for the bonus
        if(salesInAWeek > quota){
            salary += bonus;
        }
        // Output
        System.out.println("The employee's pay is: $ " + salary);
    }
}
