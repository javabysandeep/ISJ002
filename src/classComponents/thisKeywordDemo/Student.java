package classComponents.thisKeywordDemo;

public class Student {
    int id;
    String name;
    void registerStudent(){
        System.out.println("register student");
    }

    Student(){
        this(100, "abc");//call to the same class constructor
        System.out.println("zero param constructor");
    }
    Student(int id){
        this.id = id;
        System.out.println("one param constructor");
    }
    Student(String name){
        this.name = name;
        System.out.println("one param constructor");
    }
    Student(int id, String name){
        this.id = id;
        this.name = name;
        System.out.println("two param constructor");
    }

    public static void main(String[] args) {
        Student student = new Student();
    }
}
