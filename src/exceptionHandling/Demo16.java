package exceptionHandling;

public class Demo16 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
            String str = null;
            System.out.println(str.length());
            int[] array = {};
            System.out.println(array[0]);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("invalid denominator");
        } catch (NullPointerException nullPointerException) {
            System.out.println("null pointer exception");
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("index is out of range");
        } catch (Exception exception) {
            System.out.println("Generic custom handler");
        }
        System.out.println("rest of the main");
    }
}
