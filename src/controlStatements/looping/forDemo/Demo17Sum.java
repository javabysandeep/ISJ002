package controlStatements.looping.forDemo;

public class Demo17Sum {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 3;

        int sum = 0;
        for (int i = 1; i <=number1 ; i++) {
            sum = sum + number2;
        }
        System.out.println("Multiplication of "+number1+" and "+number2+" is "+sum);
    }
}
