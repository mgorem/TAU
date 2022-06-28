package chapter3;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String args[]){
        System.out.println("Enter your letter grade: ");
        Scanner scanner = new Scanner(System.in);
        String letterGrade = scanner.next();

        String message;

        switch (letterGrade){
            case "A":
                message = "Excellent Job!";
                break;
            case "B":
                message = "Great Job!";
                break;
            case "C":
                message = "Good Job!";
                break;
            case "D":
                message = "You need to work a bit harder.";
                break;
            case "E":
                message = "Uh oh!";
                break;
            default:
                message = "Error! Invalid grade.";
                break;
        }
        System.out.println(message);
    }
}
