package exceptionHandling;

public class Demo8 {
    public static void main(String[] args) {
        System.out.println("*");
        System.out.println("*");
        try {
            //exception prone or mistake prone code
            System.out.println(10 / 0); //throw new ArithmeticException("/ by zero");

            String str = "null";
            System.out.println(str.length()); // NPE

            int[] array = {1};
            System.out.println(array[0]);//AIOUBE
        }
        //custom exception handler : Multi-catch
        catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException exception) {
            System.out.println("issue because of "+exception.getMessage());
        }

        System.out.println("*");
        System.out.println("*");
    }
}
