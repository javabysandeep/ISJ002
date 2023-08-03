package fileHandling;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        //for writing Purpose
        File targetFile = new File("abcCopy.txt");
        FileWriter fileWriter = new FileWriter(targetFile);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);


        //file content copy operation
        File sourceFile = new File("abc.txt");
        FileReader fileReader = new FileReader(sourceFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int input = bufferedReader.read();
        while (input != -1) {
            bufferedWriter.write((char) input);
            input = bufferedReader.read();
        }
        bufferedReader.close();
        fileReader.close();

        bufferedWriter.close();
        fileWriter.close();
        System.out.println("File copy operation done");
    }
}
