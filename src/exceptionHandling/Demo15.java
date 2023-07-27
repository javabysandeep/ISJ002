package exceptionHandling;

public class Demo15 {
    public static void main(String[] args) {
        System.out.println(getValue());//3
    }

    public static int getValue() {
        try {
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }
}
