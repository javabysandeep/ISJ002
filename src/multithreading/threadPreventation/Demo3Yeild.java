package multithreading.threadPreventation;

public class Demo3Yeild {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
        }, "thread1");
        Thread thread2 = new Thread(() -> System.out.println(Thread.currentThread().getName()), "thread2");
        thread1.setPriority(10);
        thread2.setPriority(10);

        thread1.start();
        thread2.start();

        Thread.yield();// main method suggest
        // he is ready to give up the execution for other threads with same or higher priority

        //main thread
        for (int i = 201; i <= 210; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
