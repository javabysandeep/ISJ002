package operators.conditional.controlStatements.conditionalStatements;

import java.util.Scanner;

public class AssignemntQuestion {
    public static void main(String[] args) {
        /*
        * 1. Ask user to enter age, gender ( M or F ), marital status ( Y or N )
        * and then using following rules print their place of service.

2. if employee is female, then she will work only in urban areas.
3. if employee is a male and age is in between 20 to 40 then he may work in anywhere
4. if employee is male and age is in between 40 t0 60 then he will work in urban areas only.
5. And any other input of age should print "ERROR".
        *
        * */
        System.out.println("Enter age, Gender, Marital Status");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        char gender = scanner.next().charAt(0);
        char maritalStatus = scanner.next().charAt(0);

        if (gender == 'F') {
            System.out.println("She will work only in Urban areas");
        } else if (gender == 'M' && (age > 20 && age <= 40)) {
            System.out.println("you can work anywhere");
        } else if (gender == 'M' && (age > 40 && age <= 60)) {
            System.out.println("can work only in urban areas");
        } else {
            System.out.println("Error");
        }


    }
}
