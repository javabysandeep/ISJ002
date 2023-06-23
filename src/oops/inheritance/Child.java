package oops.inheritance;

public class Child extends Parent {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.a);
        System.out.println(child.b);
        child.display();
    }
}
