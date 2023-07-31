package fileHandling;

import java.io.File;
import java.io.IOException;

public class Demo3CreateNewFolderInFolder {
    public static void main(String[] args) throws IOException {
        //create a new folder
        File file = new File("C:\\Work\\ISJ002\\FileHandling\\folder1");
        boolean isFolderCreated = file.mkdir();
        System.out.println("Folder created " + isFolderCreated);
    }
}
