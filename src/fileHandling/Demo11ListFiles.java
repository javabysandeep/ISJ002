package fileHandling;

import java.io.File;
import java.io.IOException;

public class Demo11ListFiles {
    public static void main(String[] args) throws IOException {
        File folder = new File("C:\\Work\\ISJ002\\src\\exceptionHandling");
        String[] fileNameList = folder.list();// it will return only file name list
        for (String fileName : fileNameList) {
            System.out.println(fileName);
        }
    }
}
