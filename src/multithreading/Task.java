package multithreading;

public class Task implements Runnable{
    @Override
    public void run() {
        System.out.println("Runnable run method : Task class");
    }
}
