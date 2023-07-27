package exceptionHandling;

public class Demo13 {
    public static void main(String[] args) {
        try {
            try {
                System.out.println(10 / 0);
            } catch (Exception exception) {
                System.out.println("inner catch");
            }
        } catch (Exception exception) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
        System.out.println("rest of the main");

    }
}
//output: inner catch-> finally - rest of the main
