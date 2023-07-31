package fileHandling;

import java.io.File;
import java.io.IOException;

public class Demo5DeleteFile {
    public static void main(String[] args) throws IOException {
        //Delete a new file
        File file = new File("abc.txt");
        System.out.println("File created "+file.delete());
    }
}
