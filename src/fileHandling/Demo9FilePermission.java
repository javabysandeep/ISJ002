package fileHandling;

import java.io.File;
import java.io.IOException;

public class Demo9FilePermission {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        file.createNewFile();
      //  file.setReadable(true);
        file.setWritable(false);
        System.out.println("Permission set to read ony");

    }
}
