package oops.inheritance.accessSpecifierLimitations.p2;

import oops.inheritance.accessSpecifierLimitations.p1.Parent;

public class Child extends Parent {
    void display() {
        // System.out.println(a);//private
        System.out.println(b);//public
        System.out.println(c);//protected
        //System.out.println(d);//default
    }

    public static void main(String[] args) {
        Parent parent = new Child();
        System.out.println(parent instanceof Child);//true
        System.out.println(parent instanceof Parent);//true

        A a = new A();
        B b = new B();
        C c = new C();

        System.out.println(a instanceof A); //true
        System.out.println(b instanceof A); //true
        System.out.println(b instanceof B); //true
        System.out.println(c instanceof A); //true
        System.out.println(c instanceof B); //true
        System.out.println(c instanceof C); //true
    }
}
class A {}
class B extends A {}
class C extends B {}