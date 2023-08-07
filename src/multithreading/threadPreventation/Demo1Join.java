package multithreading.threadPreventation;

public class Demo1Join {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName());
        }, "thread1");
        Thread thread2 = new Thread(() -> System.out.println(Thread.currentThread().getName()), "thread2");

        thread1.start();
        thread2.start();

        thread1.join(5000);
        thread2.join(5000);

        //main thread
        for (int i = 201; i <= 210; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
