package operators.conditional.acceptUserInput;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        System.out.println("You have entered " + age);

        //InputMismatchException
        float floatValue = scanner.nextFloat();
        System.out.println("You have entered float value "+floatValue);
    }
}
