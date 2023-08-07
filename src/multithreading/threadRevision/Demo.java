package multithreading.threadRevision;

public class Demo {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.start();
        //anonymous class
        Thread thread = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                }
            }
        };
        thread.setName("anonymous");
        thread.start();
    }
}
