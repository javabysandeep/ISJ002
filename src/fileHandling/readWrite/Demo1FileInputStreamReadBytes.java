package fileHandling.readWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo1FileInputStreamReadBytes {
    public static void main(String[] args) throws IOException {
        //read from a file in terms of bytes : FileInputStream
        File file = new File("abc.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        int input = fileInputStream.read();
        while (input != -1) {
            System.out.print((char) input);
            input = fileInputStream.read();
        }
        fileInputStream.close();
    }
}
