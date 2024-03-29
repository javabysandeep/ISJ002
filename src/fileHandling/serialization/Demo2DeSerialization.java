package fileHandling.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo2DeSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("student.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Student student = (Student) objectInputStream.readObject();
        System.out.println(student.toString());
        objectInputStream.close();
        fileInputStream.close();
    }
}
