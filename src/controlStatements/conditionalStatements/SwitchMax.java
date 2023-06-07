package controlStatements.conditionalStatements;

import java.util.Scanner;

public class SwitchMax {
    public static void main(String[] args) {
        System.out.println("Enter three numbers");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        //switch
        switch (number1 > number2 && number1 > number3 ? 1 : 0) {
            case 1:
                System.out.println(number1 + " is maximum ");
                break;
            case 0:
                switch (number2 > number1 && number2 > number3 ? 1 : 0) {
                    case 1:
                        System.out.println(number2 + " is maximum");
                        break;
                    case 0:
                        System.out.println(number3 + " is maximum");
                        break;
                }
        }

    }

}
