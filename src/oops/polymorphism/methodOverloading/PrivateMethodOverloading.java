package oops.polymorphism.methodOverloading;

public class PrivateMethodOverloading {
    private static int add(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }

    private static float add(float number1, int number2, int number3) {
        return (float) (number1 + number2 + number3);
    }

    private static float add(float number1, float number2, float number3) {
        return number1 + number2 + number3;
    }

    public static void main(String[] args) {
        System.out.println(add(100, 200, 300));
        System.out.println(add(100.5f, 200, 300));
        System.out.println(add(100.5f, 200.5f, 300.5f));
    }
}
