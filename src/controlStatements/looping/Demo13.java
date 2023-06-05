package controlStatements.looping;

import java.util.Scanner;

public class Demo13 {
    public static void main(String[] args) {
        //factors of given number
        System.out.println("enter the number to find out its factors");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 1; i <= number / 2; i++) {
            //to check if it is factor
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}
