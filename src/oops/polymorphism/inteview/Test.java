package oops.polymorphism.inteview;
public class Test {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.m1(parent);//parent class method

        Child child = new Child();
        parent.m1(child);//parent class method

        Child child1 = new Child();
        child1.m1(null);//child class

        parent = child;
        parent.m1(null);//child
        parent.m1(new Parent());//child
    }
}
