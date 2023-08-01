package fileHandling.readWrite;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo4FileWriterWriteCharacters {
    public static void main(String[] args) throws IOException {
        File file = new File("pqr.txt");
        file.createNewFile();
        //to write to a file in terms of character : FileWriter
        FileWriter fileWriter = new FileWriter(file,true);
        fileWriter.write("welcome to file handling session");
        fileWriter.close();
        System.out.println("File write operation done");

    }
}
