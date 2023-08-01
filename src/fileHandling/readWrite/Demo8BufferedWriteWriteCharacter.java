package fileHandling.readWrite;

import java.io.*;

public class Demo8BufferedWriteWriteCharacter {
    public static void main(String[] args) throws IOException {
        File file = new File("pqr.txt");
        FileWriter fileWriter = new FileWriter(file,true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write('A');

        bufferedWriter.close();
        fileWriter.close();
        System.out.println("File write operation done");

    }
}
