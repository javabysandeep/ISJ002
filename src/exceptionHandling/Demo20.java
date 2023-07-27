package exceptionHandling;

import java.io.FileNotFoundException;

public class Demo20 {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }

    }

    private static void readFile() throws FileNotFoundException {
        System.out.println("reading the file ");
    }
}
