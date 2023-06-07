package controlStatements.looping.whileDemo;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        while (number != 0) {
            System.out.println("You have entered "+number);
            System.out.println("Do you want to continue");
            number = scanner.nextInt();
        }
    }
}
