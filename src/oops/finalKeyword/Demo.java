package oops.finalKeyword;

public class Demo {
    public static void main(String[] args) {
        final int a = 100;
        //a = 200;//reassignment
        int b = 50;
        int c = a + b;
        System.out.println(a);
        int d = a;

       final Student student1 = new Student(100, "Sachin");
        Student student2 = new Student(200, "abc");
        //student1 = student2;//reassignment is not possible
       /* System.out.println(student1.id+"\t"+student1.name);
        System.out.println("After change");
        student1.id = 10000;
        student1.name = "Sachin Tendulkar";
        System.out.println(student1.id+"\t"+student1.name);*/

    }
}
