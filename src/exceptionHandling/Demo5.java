package exceptionHandling;

import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        try {
            System.out.println(number1 / number2);//ArithmeticException
        }
        //custom exception handler : which can handle ArithmeticException
        catch (ArithmeticException arithmeticException) {
            System.out.println("invalid denominator "+arithmeticException.getMessage());
        }

        System.out.println("Rest of the main");
    }
}
