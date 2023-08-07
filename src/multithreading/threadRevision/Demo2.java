package multithreading.threadRevision;

public class Demo2 {
    public static void main(String[] args) {
        Runnable runnable = new Task();
        Thread thread = new Thread(runnable);
        thread.start();

        //way 2: anonymous class
       Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 10; i++) {
                    System.out.println(i);
                }
            }
        };
        Thread thread2 = new Thread(runnable2);
        thread2.start();

        //way 3: Lambda expression
       Runnable lambda = () -> {
           for (int i = 0; i <= 10; i++) {
               System.out.println(i);
           }
       };
        Thread thread3 = new Thread(lambda);
        thread3.start();
    }
}
