package chapter4;

import java.util.Scanner;

/*
* FOR LOOP
* Write a Cashier program that will scan a given number of items and tally the cost.
 */
public class Cashier {
    public static void main(String args[]){

        // Get the number of items to scan
        System.out.println("Enter the number of items you would like to scan: ");
        Scanner scanner = new Scanner(System.in);
        int numberOfItems = scanner.nextInt();

        // Total price for all items at the beginning before scanning
        double total = 0;

        // Create a loop to iterate through all the items, accumulate and store the cost into variable total
        for (int i = 0; i < numberOfItems; i++){

            System.out.print("Enter the cost of the item: ");
            double price = scanner.nextDouble();

            total += price;
        }

        scanner.close();

        System.out.println("Your total is $" + total);
    }
}
