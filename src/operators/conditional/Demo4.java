package operators.conditional;

public class Demo4 {
    public static void main(String[] args) {
        int number1 = 190;
        int number2 = 1000;
        int number3 = 10;

        System.out.println(
                number1 > number2 && number1 > number3 ? number1 : (
                        number2 > number1 && number2 > number3 ? number2 : number3
                ));
        System.out.println(
                number3 > number1 && number3 > number2 ?
                number3 :
                (number1 > number2 && number1 > number3
                        ? number1
                        : number2));

    }
}
