package fileHandling.fileClass;

import java.io.File;
import java.io.IOException;

public class Demo2CreateNewFileInFolder {
    public static void main(String[] args) throws IOException {
        //create a new file
        File file = new File("C:\\Work\\ISJ002\\FileHandling\\abc.txt");
        boolean isFileCreated = file.createNewFile();
        System.out.println("File created "+isFileCreated);
    }
}
