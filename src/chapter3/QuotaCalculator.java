package chapter3;

import java.util.Scanner;

/*
IF ELSE
All salespeople are expected to make at least 10 sales each week.
For those who do, they receive a congratulatory message.
For those who don't, they are informed of how many sales they were short.
 */
public class QuotaCalculator {
    public static void main(String args[]){
        // Initialize values we know
        int quota = 10;

        // Get values we don't
        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String salesPersonName = scanner.next();

        System.out.println("Enter the number of sales you made this week: ");
        int salesInAWeek = scanner.nextInt();
        scanner.close();

        // Make a decision on the path to take then, Output.
        if(salesInAWeek >= quota){
            System.out.println("Congrats" + " " + salesPersonName + "!" + " " +  "You've met your quota");
        }
        else{
            int salesShort = quota - salesInAWeek;
            System.out.println("Sorry " + salesPersonName + "!" + " " + "You did not meet your quota. You were " + salesShort + " " + "sales short.");
        }
    }
}
