package fileHandling;

import java.io.File;
import java.io.IOException;

public class Demo8FileSize {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Work\\ISJ002\\FileHandling\\fileHandling.txt");
        System.out.println("File size "+file.length());

    }
}
