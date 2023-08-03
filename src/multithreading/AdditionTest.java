package multithreading;

public class AdditionTest {
    public static void main(String[] args) {
        Addition addition = new Addition(1, 10000000);
        long startTime = System.currentTimeMillis();
        addition.count();
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken to calculate sum = " + (endTime - startTime)
                + "\t Addition = " + Addition.sum);
    }
}
