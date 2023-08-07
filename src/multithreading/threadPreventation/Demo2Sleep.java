package multithreading.threadPreventation;

public class Demo2Sleep {
    public static void main(String[] args) throws InterruptedException {
        //main thread
        for (int i = 201; i <= 210; i++) {
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
