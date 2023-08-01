package fileHandling.fileClass;

import java.io.File;
import java.io.IOException;

public class Demo13FileObjectListing {
    public static void main(String[] args) throws IOException {
        File folder = new File("C:\\Work\\ISJ002\\src\\exceptionHandling");
        File[] files = folder.listFiles();
        for (File file : files) {
            System.out.println(file.getName() + "\t" + file.length());
        }
    }
}
