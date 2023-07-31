package fileHandling;

import java.io.File;
import java.io.IOException;

public class Demo10FilePermission {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        System.out.println("File permission "+file.canWrite());

    }
}
