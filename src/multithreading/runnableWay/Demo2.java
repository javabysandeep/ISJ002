package multithreading.runnableWay;

public class Demo2 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " " + i);
                }
            }
        };
        Thread thread = new Thread(runnable, "custom");
        //  thread.setName("custom");
        thread.start();
    }


}


