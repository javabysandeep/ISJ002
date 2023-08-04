package multithreading.createThreadUsingThreadClass;

public class Demo1 {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.start();
    }
}
