package multithreading.createThreadUsingThreadClass;

public class Worker extends Thread {
    @Override
    public void run() {
        //job of worker or thread
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }
    }
}
