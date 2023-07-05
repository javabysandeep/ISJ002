package oops.abstraction;

public class ConstructorCallCheck {
    public static void main(String[] args) {
       // Parent parent = new Parent();
        Child child = new Child();

        //instance members

        System.out.println(child.a);
        child.m1();


        //static members
        System.out.println(Parent.b);
        Parent.m2();

        child.m3();

    }
}
