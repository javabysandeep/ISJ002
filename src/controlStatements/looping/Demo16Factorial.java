package controlStatements.looping;

import java.util.Scanner;

public class Demo16Factorial {
    public static void main(String[] args) {
        System.out.println("Enter the number to find the factorial");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of "+number+" is :"+factorial);
    }
}
