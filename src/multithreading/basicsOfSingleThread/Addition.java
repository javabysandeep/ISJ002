package multithreading.basicsOfSingleThread;

public class Addition {
    long start;
    long end;
    static long sum = 0;

    public Addition(long start, long end) {
        this.start = start;
        this.end = end;
    }

    void count() {
        for (long i = start; i <= end; i++) {
            sum = sum + i;
        }
    }
}
