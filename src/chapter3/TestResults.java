package chapter3;

import java.util.Scanner;

public class TestResults {
    public static void main(String args[]){
        // Get the test score from the user
        System.out.println("Enter your test score: ");
        Scanner scanner = new Scanner(System.in);
        double testScore = scanner.nextDouble();

        // Determine the letter grade
        // Choose grade from A, B, C, D, E
        char grade;

        if(testScore < 60){
            grade = 'F';
        } else if (testScore < 70) {
            grade = 'D';
        } else if (testScore < 80) {
            grade = 'C';
        } else if (testScore < 90) {
            grade = 'B';
        }
        else {
            grade = 'A';
        }
        System.out.println("Your grade is " + grade);
    }
}
