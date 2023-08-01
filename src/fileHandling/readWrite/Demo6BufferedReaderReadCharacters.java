package fileHandling.readWrite;

import java.io.*;

public class Demo6BufferedReaderReadCharacters {
    public static void main(String[] args) throws IOException {
        //read from a buffer in terms of bytes : BufferedInputStream
        File file = new File("abc.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        int input = bufferedReader.read();
        while (input != -1) {
            System.out.print((char) input);
            input = bufferedReader.read();
        }

        bufferedReader.close();
        fileReader.close();
    }
}
