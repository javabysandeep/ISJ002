package oops.abstraction.interfaceDemos;

public class Child implements I1{
    @Override
    public void m1() {
        System.out.println("m1 in child");
    }

    @Override
    public void m2() {
        System.out.println("m2 in child");
    }
    void m3(){
        System.out.println("m3 in child");
    }
}
