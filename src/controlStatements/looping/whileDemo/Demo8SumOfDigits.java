package controlStatements.looping.whileDemo;

import java.util.Scanner;

public class Demo8SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sumOfDigits = 0;

        while ( number > 0) {
            int digit = number % 10;
            sumOfDigits = sumOfDigits + digit;
            number = number/10;
        }
        System.out.println("Sum of digits is "+sumOfDigits);
    }
}
