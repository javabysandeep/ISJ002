package controlStatements.assignments;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        //Take a number from user and print whether it is positive or negative. (Use switch statement)
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String output = number >= 0 ? "Positive" : "Negative";
        switch (output) {
            case "Positive":
                System.out.println("Its positive number");
                break;
            case "Negative":
                System.out.println("Its negative number");
                break;
        }
    }
}
