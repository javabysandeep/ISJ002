package multithreading.countTask;

public class Addition {
    static long sum = 0;

    void count(long start, long end) {
        for (long i = start; i <= end; i++) {
            sum = sum + i;
        }
    }
}
