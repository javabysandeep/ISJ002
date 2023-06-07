package controlStatements.looping.whileDemo;

import java.util.Scanner;

public class Demo9SumDigitSquare {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sumOfDigits = 0;

        while (number > 0) {
            int digit = number % 10;
            sumOfDigits = sumOfDigits + digit * digit;
            number = number / 10;
        }
        System.out.println("Sum of digit square is " + sumOfDigits);
    }
}
