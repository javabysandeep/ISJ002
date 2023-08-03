package lombok;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student(1,"Tushar","Pune");
        student.setStudentAddress("Mumbai");
        student.setStudentId(1001);
        System.out.println(student);
    }
}
