package operators.conditional.acceptUserInput;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("Enter the string value");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("You have entered "+str);
    }
}
