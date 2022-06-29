package chapter3;

import java.util.Scanner;

public class ChangeForDollar {
    public static void main(String args[]){

        //Initialise the known values
        double penny = .01; // 0.01 of a dollar (1 cent in ksh)
        double nickel = .05; // 0.05 of a dollar (5 cents in ksh)
        double dime = .10; // 0.1 of a dollar 10 cents (10 cents in ksh)
        double quarter = .25; // quarter of a dollar (25 cents in ksh)
        int dollar = 1; // 1 dollar (1 Kenyan shilling)

        // Welcome the player
        System.out.println("Welcome to change for a Kenyan Shilling! " +
                " Your goal is to enter enough change to make exactly 1 Kenyan Shilling.");

        // What I need to know from the user
        System.out.println("Enter the number of pennies you would like: ");
        Scanner scanner = new Scanner(System.in);
        int numOfPennies = scanner.nextInt();

        System.out.println("Enter the number of nickels you would like: ");
        int numOfNickels = scanner.nextInt();

        System.out.println("Enter the number of dimes you would like: ");
        int numOfDimes = scanner.nextInt();

        System.out.println("Enter the number of quarters you would like: ");
        int numOfQuarters = scanner.nextInt();

        //Total output depending on the player's input
        double total = numOfPennies * penny + numOfNickels * nickel + numOfDimes * dime + numOfQuarters * quarter;

        // Logic and if statements
        if (total < dollar){
            double amountShort = dollar - total;
            //Decimal to print only two decimal places
            System.out.println("Sorry, you lose! You were short " + String.format("%.2f", amountShort) + " cents.");
        } else if(total > dollar){
            double amountOver = total - dollar;

            //Decimal to print only 2 decimal places
            System.out.println("Sorry, you lose! You were over " + String.format("%.2f", amountOver) + " cents.");
        }
        else {
            System.out.print("Yay! That's exactly $1.00. You win.");
        }
    }
}
