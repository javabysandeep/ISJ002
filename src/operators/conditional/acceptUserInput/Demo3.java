package operators.conditional.acceptUserInput;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        System.out.println("Enter the character");
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(4);

        System.out.println("You have entered "+ch);
    }
}
