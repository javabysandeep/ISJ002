package multithreading;

public class Demo2 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("run method");
            }
        };
        Thread thread = new Thread(() -> System.out.println("run method"));
    }
}
