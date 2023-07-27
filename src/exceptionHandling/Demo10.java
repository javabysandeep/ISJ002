package exceptionHandling;

public class Demo10 {
    public static void main(String[] args) {
        try {
            System.out.println("opening the connection");
            System.out.println(10 / 1);
            String str = null;
            System.out.println(str.length());
        } catch (ArithmeticException arithmeticException) {
            System.out.println("catch");
        }
        finally {
            System.out.println("close the connection to the database --- finally");
        }
        System.out.println("Rest of the main");
    }
}
