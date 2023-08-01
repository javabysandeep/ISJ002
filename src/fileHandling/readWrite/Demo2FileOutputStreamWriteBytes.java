package fileHandling.readWrite;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2FileOutputStreamWriteBytes {
    public static void main(String[] args) throws IOException {
        File file = new File("pqr.txt");
        file.createNewFile();
        //to write to a file in terms of byte :
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write('A');
        fileOutputStream.close();
        System.out.println("File write operation done");

    }
}
