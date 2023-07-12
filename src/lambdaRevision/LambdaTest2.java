package lambdaRevision;

public class LambdaTest2 {
    public static void main(String[] args) {
        Supplier supplier = () -> "hello";
        System.out.println(supplier.provide());


        Runnable runnable = () -> System.out.println("running");
        runnable.run();

    }
}
