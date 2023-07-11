package lambdaExpression;

public class RunnableTest {
    public static void main(String[] args) {
        Runnable runnable = new RunnableImpl();
        runnable.run();

        Runnable anonymous = new Runnable() {
            @Override
            public void run() {
                System.out.println("running with anonymous");
            }
        };
        anonymous.run();

        Runnable lambda = () -> System.out.println("running with lambda");
        lambda.run();


    }
}
class RunnableImpl implements  Runnable{
    @Override
    public void run() {
        System.out.println("run");
    }
}