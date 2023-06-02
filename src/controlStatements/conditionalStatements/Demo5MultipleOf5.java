package controlStatements.conditionalStatements;

public class Demo5MultipleOf5 {
    public static void main(String[] args) {
        //is number multiple of 5
        int number = 99;
        if (number % 5 == 0) {
            System.out.println(number + " is a multiple of 5");
        } else {
            System.out.println(number + " is not a multiple of 5");
        }
    }
}
