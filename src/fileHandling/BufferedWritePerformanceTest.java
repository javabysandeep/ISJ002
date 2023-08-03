package fileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class BufferedWritePerformanceTest {
    public static void main(String[] args) throws IOException {
        File file = new File("pqr.txt");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= 10000000; i++) {
            bufferedWriter.write(i);
        }
        bufferedWriter.close();
        fileWriter.close();
        long endTime = System.currentTimeMillis();
        System.out.println("Taken to write " + (endTime - startTime));
    }
}
