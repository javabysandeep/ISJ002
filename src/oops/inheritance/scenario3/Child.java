package oops.inheritance.scenario3;

public class Child extends Parent {

    int a = 1000;

    void m1() {
        System.out.println("Child class m1 method");
    }

    void m2() {
        System.out.println("child class m2 method");
    }

    public static void main(String[] args) {

        // Scenario3: Parent class reference = child class object
        Parent parent = new Child();

        //Case1 :only present in parent class :--> Parent
        //case2: only present in child class :--> Compile Time error
        //case3:  present in both parent and child class :--> { Variable= Parent } ,  { Methods=Child  }
        System.out.println(parent.a);
        parent.m1();
        //parent.m2();

        //scenario 4: child class reference  = parent class object
        //Child c = new Parent();
    }
}
