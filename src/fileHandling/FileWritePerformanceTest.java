package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class FileWritePerformanceTest {
    public static void main(String[] args) throws IOException {
        File file = new File("pqr.txt");
        FileWriter fileWriter = new FileWriter(file);
        LocalDateTime startTime = LocalDateTime.now();
        for (int i = 1; i <= 10000000; i++) {
            fileWriter.write(i);
        }
        fileWriter.close();
        LocalDateTime endTime = LocalDateTime.now();
        System.out.println("Taken to write " + (startTime.getNano() - endTime.getNano()));
    }
}
