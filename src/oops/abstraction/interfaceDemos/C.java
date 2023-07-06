package oops.abstraction.interfaceDemos;

public class C implements A, B {
    @Override
    public void m1() {
        System.out.println("m1 methods in c");
    }

    @Override
    public void m2() {
        System.out.println("m2 method in c");
    }
}
