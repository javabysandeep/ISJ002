package oops.inheritance.scenario2;

public class Child extends Parent {

    int a = 1000;
    void m1(){
        System.out.println("Child class m1 method");
    }

    public static void main(String[] args) {

        // Scenario2:
        Child child = new Child();

        //Case1 :only present in parent class :--> Parent
        //case2: only present in child class :--> Child
        //case3:  present in both parent and child class :--> Child
        System.out.println(child.a);
        child.m1();
    }
}
