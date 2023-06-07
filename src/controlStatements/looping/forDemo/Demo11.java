package controlStatements.looping.forDemo;

public class Demo11 {
    public static void main(String[] args) {
        //sum of numbers from 1 to 100
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            // sum += i;
            sum = sum + i;
        }
        System.out.println("Sum of numbers from 1 to 100 : " + sum);
    }
}
