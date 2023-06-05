package controlStatements.looping;

import java.util.Scanner;

public class Demo15PrimeNumber {
    public static void main(String[] args) {
        System.out.println("enter the number ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean isPrime = true;

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime ? "Its prime" : "its not prime");
    }
}
