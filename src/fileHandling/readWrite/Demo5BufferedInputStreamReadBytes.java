package fileHandling.readWrite;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo5BufferedInputStreamReadBytes {
    public static void main(String[] args) throws IOException {
        //read from a buffer in terms of bytes : BufferedInputStream
        File file = new File("abc.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        int input = bufferedInputStream.read();
        while (input != -1) {
            System.out.print((char) input);
            input = bufferedInputStream.read();
        }

        bufferedInputStream.close();
        fileInputStream.close();
    }
}
