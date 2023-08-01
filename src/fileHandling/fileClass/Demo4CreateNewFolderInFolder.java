package fileHandling.fileClass;

import java.io.File;
import java.io.IOException;

public class Demo4CreateNewFolderInFolder {
    public static void main(String[] args) throws IOException {
        for (int index = 1; index <= 20; index++) {
            //create a new folder
            File directory = new File("C:\\Work\\ISJ002\\FileHandling\\folder" + index);
            System.out.println(directory.mkdir());
        }
    }
}
