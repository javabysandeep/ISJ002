package fileHandling.fileClass;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class Demo14FileObjectListingFilter {
    public static void main(String[] args) throws IOException {
        File folder = new File("C:\\Work\\ISJ002\\src\\exceptionHandling");
        FilenameFilter filenameFilter = (dir, name) -> name.startsWith("Demo1");
        File[] files = folder.listFiles((dir, name) -> name.startsWith("Demo1"));
        for (File file : files) {
            System.out.println(file.getName() + "\t" + file.length());
        }
    }
}
