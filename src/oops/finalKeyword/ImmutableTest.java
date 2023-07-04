package oops.finalKeyword;

public class ImmutableTest {

    public static void main(String[] args) {
        Student student = new Student(100, "abc");
        System.out.println(student.getId()+"\t"+student.getName());
        //student.id = 300;
        //student.name = "xyz";

        //2. do not provide public setters
       /* student.setId(300);
        student.setName("xyz");*/

    }
}
