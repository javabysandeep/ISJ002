package stringHandling;

public class Demo1ImmutableTest {
    public static void main(String[] args) {
        Student student = new Student(1, "abc");
        System.out.println(student.getId() + "\t" + student.getName());
    }
}

