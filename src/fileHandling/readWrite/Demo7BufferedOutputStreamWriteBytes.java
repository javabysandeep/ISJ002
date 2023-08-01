package fileHandling.readWrite;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo7BufferedOutputStreamWriteBytes {
    public static void main(String[] args) throws IOException {
        File file = new File("pqr.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file,true);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

        bufferedOutputStream.write('A');


        bufferedOutputStream.close();
        fileOutputStream.close();
        System.out.println("File write operation done");

    }
}
