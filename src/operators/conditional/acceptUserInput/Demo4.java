package operators.conditional.acceptUserInput;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the ages of two persons");
        int age1 = scanner.nextInt();
        int age2 = scanner.nextInt();

        if (age1 > age2) {
            System.out.println(age1);
        } else {
            System.out.println(age2);
        }

    }
}
