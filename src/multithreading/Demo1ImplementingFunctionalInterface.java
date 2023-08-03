package multithreading;

public class Demo1ImplementingFunctionalInterface {
    public static void main(String[] args) {
        //way 1 : Traditional way
        Runnable runnable1 = new Task();
        runnable1.run();

        //way 2 : anonymous class way
        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable run method : Anonymous class");
            }
        };
        runnable2.run();

        //way 3 : Lambda way : since Runnable is a functional interface.
        Runnable runnable3 = () -> System.out.println("Runnable run method : Lambda Expression");
        runnable3.run();

        //way 4 : method reference
        Runnable runnable4 = Demo1ImplementingFunctionalInterface::display;
        runnable4.run();
    }

    public static void display() {
        System.out.println("Display method reference");
    }
}
