package controlStatements.looping.whileDemo;

import java.util.Scanner;

public class Demo10SumDigitCube {
    public static void main(String[] args) {
        //armstrong number : sum of digit cube = given number
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int originalNumber = number;
        int sumOfDigits = 0;

        while (number > 0) {
            int digit = number % 10;
            sumOfDigits = sumOfDigits + digit * digit * digit;
            number = number / 10;
        }
        System.out.println("Sum of digit cube is " + sumOfDigits);
        System.out.println(originalNumber == sumOfDigits ? "Armstrong number" : "not an Armstrong number");
    }
}
