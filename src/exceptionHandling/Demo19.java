package exceptionHandling;

public class Demo19 {
    public static void main(String[] args) {
        try {
            System.out.println(divide(100, 0));
        } catch (ArithmeticException arithmeticException) {
            System.out.println("exception handled in main method");
        }

    }

    private static int divide(int number1, int number2) {
        return number1 / number2;
    }
}
