package multithreading.createThreadUsingThreadClass;

public class OddThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i = i + 2) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
