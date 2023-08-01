package fileHandling.fileClass;

import java.io.File;
import java.io.IOException;

public class Demo7DeleteFolderInFolder {
    public static void main(String[] args) throws IOException {
        //Delete a folder in a folder
        File folder = new File("C:\\Work\\ISJ002\\FileHandling\\folder1");
        System.out.println("Folder deleted " + folder.delete());
    }
}
