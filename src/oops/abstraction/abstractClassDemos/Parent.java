package oops.abstraction.abstractClassDemos;

abstract public class Parent {
    int a = 100;
    static int b = 200;
    void m1(){
        System.out.println("m1 from abstract class");
    }
    static void m2(){
        System.out.println("static method from parent class : m2");
    }

    abstract void m3();

    Parent(){
        System.out.println("abstract class constructor");
    }
}
