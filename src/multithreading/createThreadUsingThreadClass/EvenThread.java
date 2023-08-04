package multithreading.createThreadUsingThreadClass;

public class EvenThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 100; i = i + 2) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
