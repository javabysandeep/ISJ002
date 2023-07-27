package exceptionHandling;

public class Demo6 {
    public static void main(String[] args) {
        System.out.println("*");
        System.out.println("*");
        try {
            //exception prone or mistake prone code
            System.out.println(10 / 1); //throw new ArithmeticException("/ by zero");
            //
        }
        //custom exception handler
        catch (ArithmeticException arithmeticException) {
            System.out.println("invalid denominator " + arithmeticException.getMessage());
        }
        System.out.println("*");
        System.out.println("*");
    }
}
