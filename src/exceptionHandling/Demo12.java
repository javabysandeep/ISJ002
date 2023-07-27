package exceptionHandling;

public class Demo12 {
    public static void main(String[] args) {
        try{
            System.out.println("1");
            System.out.println("2");
            System.exit(0);
            System.out.println("3");
            System.out.println("4");
            System.out.println("5");
        } catch (ArithmeticException arithmeticException){
            System.out.println("Catch");
        }
        finally {
            System.out.println("finally");
        }
        System.out.println("rest of the main");

    }
}
