package fileHandling;

import java.io.File;
import java.io.IOException;

public class Demo6DeleteFileInFolder {
    public static void main(String[] args) throws IOException {
        //Delete a file in a folder
        File file = new File("C:\\Work\\ISJ002\\FileHandling\\abc.txt");
        System.out.println("File deleted "+file.delete());
    }
}
