package multithreading.basicsOfSingleThread;

public class AdditionTest {
    public static void main(String[] args) {
        Addition addition = new Addition(1, 1000000000);
        long startTime = System.currentTimeMillis();
        addition.count();
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken to calculate sum = " + (endTime - startTime)
                + "\t Addition = " + Addition.sum);
        //Time taken to calculate sum = 4818	 Addition = 500000000500000000
    }
}
