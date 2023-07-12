package callByValue;

public class Demo1 {
    public static void main(String[] args) {
        Student student = new Student(1, "Sachin");
        displayStudentDetails(student);//2, Dhoni
        System.out.println("Student details in main method :" + student.id + "\t" + student.name);//1 Sachin

    }

    private static void displayStudentDetails(Student student) {
        student = new Student(2, "Dhoni");
        System.out.println("Student details in display method " + student.id + "\t" + student.name);
    }
}
