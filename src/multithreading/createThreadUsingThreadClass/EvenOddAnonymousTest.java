package multithreading.createThreadUsingThreadClass;

public class EvenOddAnonymousTest {
    public static void main(String[] args) {
        Thread evenThread = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i <= 100; i = i + 2) {
                    System.out.println(Thread.currentThread().getName() + " " + i);
                }
            }
        };
        evenThread.setName("even");

        Thread oddThread = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i = i + 2) {
                    System.out.println(Thread.currentThread().getName() + " " + i);
                }
            }
        };
        oddThread.setName("odd");

        evenThread.start();
        oddThread.start();
    }
}
