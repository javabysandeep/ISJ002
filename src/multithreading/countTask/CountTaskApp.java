package multithreading.countTask;

public class CountTaskApp {
    public static void main(String[] args) throws InterruptedException {
        Addition addition = new Addition();
        Thread thread1 = new Thread(() -> addition.count(0, Integer.MAX_VALUE / 2));
        Thread thread2 = new Thread(() -> addition.count(Integer.MAX_VALUE / 2 + 1, Integer.MAX_VALUE));


        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        //main thread job
        System.out.println("counter " + Addition.sum);
    }
}
