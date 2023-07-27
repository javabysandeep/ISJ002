package exceptionHandling;

public class Demo17Throw {
    public static void main(String[] args) {
        try {
            //System.out.println(10 / 0);
            //explicitly create exception object and give it to JRE
            throw new ArithmeticException("divide by zero");
        } catch (Exception exception) {
            System.out.println("invalid denominator");
        }
        System.out.println("rest of the main");
    }
}
