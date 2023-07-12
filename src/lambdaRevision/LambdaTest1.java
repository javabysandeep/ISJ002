package lambdaRevision;

public class LambdaTest1 {
    public static void main(String[] args) {
        Number number = (number1, number2) -> number1 + number2;
        System.out.println(number.add(100, 200));

        StringProcessor stringProcessor = (String str) -> System.out.println("you have passed " + str);
        stringProcessor.accept("Good afternoon");

        Function square = num -> num * num;
        System.out.println("Square of the given number is " + square.apply(15));
    }
}
