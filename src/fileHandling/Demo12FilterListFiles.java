package fileHandling;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class Demo12FilterListFiles {
    public static void main(String[] args) throws IOException {
        File folder = new File("C:\\Work\\ISJ002\\src\\exceptionHandling");
        FilenameFilter filenameFilter =  (dir, fileName)->fileName.startsWith("Demo1");
        String[] fileNameList = folder.list(filenameFilter);
        for (String fileName : fileNameList) {
            System.out.println(fileName);
        }
    }
}
