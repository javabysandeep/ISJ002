package operators.conditional;

public class Demo3 {
    public static void main(String[] args) {
        int number1 = 190;
        int number2 = 1000;

        int maxNumber = number1 > number2 ? number1 : number2;
        System.out.println("Maximum number " + maxNumber);

        int minNumber = number1 < number2 ? number1 : number2;
        System.out.println("Minimum number " + minNumber);
    }
}
