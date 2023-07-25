package objectClassMethods;

public class Demo2EqualsMethod {
    public static void main(String[] args) {
        int a = 100;
        int b = 100;
        System.out.println(a == b);//true : primitive value check
       // System.out.println(a.equals(b));//equals method does not work on primitive

        Student student1 = new Student(1, "Lalit");
        Student student2 = new Student(1, "Lalit");
        System.out.println(student1 == student2);//false : reference check
        System.out.println(student1.equals(student2));//
    }
}
