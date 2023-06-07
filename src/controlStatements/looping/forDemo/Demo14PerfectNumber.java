package controlStatements.looping.forDemo;

import java.util.Scanner;

public class Demo14PerfectNumber {
    public static void main(String[] args) {
        System.out.println("enter the number to find out its factors");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sumOfFactors = 0;


        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sumOfFactors = sumOfFactors + i;
            }
        }

        //50 : 1, 2,4,5,10,25--> 47


        //su of factors == given number --> perfect
        System.out.println(sumOfFactors == number ? "Its perfect" : "not a perfect number");
    }
}
