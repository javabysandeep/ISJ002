package fileHandling.fileClass;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class Demo12FilterListFiles {
    public static void main(String[] args) throws IOException {
        File folder = new File("C:\\Work\\ISJ002\\src\\exceptionHandling");
        FilenameFilter filenameFilter =  (dir, fileName)->fileName.startsWith("Demo1");//definition
        String[] fileNameList = folder.list(new FileNameFilterImpl());
        for (String fileName : fileNameList) {
            System.out.println(fileName);
        }
    }
}
class FileNameFilterImpl implements FilenameFilter{
    @Override
    public boolean accept(File dir, String fileName) {
        return fileName.startsWith("Demo1");
    }
}