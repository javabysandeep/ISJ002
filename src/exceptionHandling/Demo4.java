package exceptionHandling;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println(number1/number2);//
        System.out.println("Rest of the main");
    }
}
