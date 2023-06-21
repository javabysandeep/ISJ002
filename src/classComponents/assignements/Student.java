package classComponents.assignements;

public class Student {
    int rollNumber;
    String name;
    int phoneNumber;
    String address;

    public static void main(String[] args) {
        Student john = new Student();
        john.rollNumber = 100;
        john.name = "John";

        Student sam = new Student();
        sam.rollNumber = 102;
        sam.name = "sam";

        System.out.println("John " + john.rollNumber + "\t" + john.name);
    }
}
