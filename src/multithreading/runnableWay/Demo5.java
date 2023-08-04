package multithreading.runnableWay;

public class Demo5 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        }, "custom");
        thread.start();
    }

}


