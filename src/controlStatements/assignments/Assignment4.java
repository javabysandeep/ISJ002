package controlStatements.assignments;

import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        //Take two numbers from user and an operator (+, -, *, /) and then calculate the value. (Use switch statement)
        System.out.println("Enter two numbers and operator");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        char operator = scanner.next().charAt(0);
        int number2 = scanner.nextInt();
        switch (operator) {
            case '+':
                System.out.println(number1 + number2);
                break;
            case '-':
                System.out.println(number1 - number2);
                break;
            case '*':
                System.out.println(number1 * number2);
                break;
            case '/':
                System.out.println(number1 / number2);
                break;
            case '%':
                System.out.println(number1 % number2);
                break;
            default:
                System.out.println("Invalid Operator");
                break;
        }
    }
}
