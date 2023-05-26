package operators.assignments;

public class Question12SumOfDigits {
    public static void main(String[] args) {
        int number = 123;
        int sum = 0;

        int digit = number % 10;//digit = 3
        sum = sum + digit; // sum = 3
        number = number / 10; //number =12

        digit = number % 10; // 12 % 10 ==> 2
        sum = sum + digit;

        number = number / 10; // 12/10 ---> 1
        digit = number % 10; // 1 % 10 --> 1
        sum = sum + digit;
        System.out.println("Sum of digits is " + sum);

    }
}
