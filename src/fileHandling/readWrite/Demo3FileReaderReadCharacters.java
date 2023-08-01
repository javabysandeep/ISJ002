package fileHandling.readWrite;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Demo3FileReaderReadCharacters {
    public static void main(String[] args) throws IOException {
        //read from a file in terms of characters : FileReader
        File file = new File("abc.txt");
        FileReader fileReader = new FileReader(file);
        int input = fileReader.read();
        while (input != -1) {
            System.out.print((char) input);
            input = fileReader.read();
        }
        fileReader.close();

    }
}
