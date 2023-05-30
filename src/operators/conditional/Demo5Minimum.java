package operators.conditional;

public class Demo5Minimum {
    public static void main(String[] args) {
        int number1 = 1;
        int number2 = 0;
        int number3 = 10;

        System.out.println(
                number1 < number2 && number1 < number3 ? number1 : (
                        number2 < number1 && number2 < number3 ? number2 : number3))
        ;
    }
}
