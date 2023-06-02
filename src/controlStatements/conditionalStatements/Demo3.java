package controlStatements.conditionalStatements;

public class Demo3 {
    public static void main(String[] args) {
        int number1 = 1000;
        int number2 = 200;

        if (number1 > number2) {
            System.out.println(number1 + " is bigger than " + number2);
        }
        //System.out.println("indepedent statements are not allowed between if and else");
        else {
            System.out.println(number2 + " is bigger than " + number1);
        }
    }
}
