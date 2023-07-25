package objectClassMethods;

public class Dem04HashCodeMethod {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Pooja");
        Student student2 = new Student(1, "Pooja");
        System.out.println(student1==student2); //reference check : false
        System.out.println(student1.equals(student2)); //: content check in overriden method : true
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
    }
}
