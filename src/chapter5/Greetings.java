package chapter5;

import java.util.Scanner;

/*
* METHODS
* Write a method that asks a user for their name, then greets them by name.
 */

// Main method is used to control the flow of the program.
public class Greetings {
    public static void main(String args[]){
        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();

        scanner.close();

        // Call the greetUser Method
        greetUser(userName);
    }

    // Greet User Method (returns nothing, but when triggered, greets user).
    public static void greetUser(String name){
        System.out.println("Hi there, " + name);
    }
}
