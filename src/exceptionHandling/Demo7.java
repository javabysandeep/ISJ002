package exceptionHandling;

public class Demo7 {
    public static void main(String[] args) {
        System.out.println("*");
        System.out.println("*");
        try {
            //exception prone or mistake prone code
            System.out.println(10 / 1); //throw new ArithmeticException("/ by zero");

            String str = "null";
            System.out.println(str.length()); // NPE

            int[] array = {};
            System.out.println(array[0]);//AIOUBE
        }
        //custom exception handler
        catch (ArithmeticException arithmeticException) {
            System.out.println("invalid denominator " + arithmeticException.getMessage());
        }
        catch (NullPointerException nullPointerException){
            System.out.println("Null issue. Assign valid value");
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("Array index out of bounds");
        }
        System.out.println("*");
        System.out.println("*");
    }
}
