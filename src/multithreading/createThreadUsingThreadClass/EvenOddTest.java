package multithreading.createThreadUsingThreadClass;

public class EvenOddTest {
    public static void main(String[] args) {
        EvenThread evenThread = new EvenThread();
        evenThread.setName("even");

        OddThread oddThread = new OddThread();
        oddThread.setName("odd");

        evenThread.start();
        oddThread.start();
    }
}
