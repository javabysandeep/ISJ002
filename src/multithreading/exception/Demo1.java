package multithreading.exception;

public class Demo1 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 1; i < 10000; i++) {
                System.out.println(i);
            }
        });
        thread.start();
        System.out.println(10 / 0);
    }
}
