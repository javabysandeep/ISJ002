package classComponents.assignements;

import classComponents.Outer;

public class TestInnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println(outer.a);
        outer.m1();

        System.out.println("Inner class object creation");
        Outer.Inner inner = outer.new Inner();//inner class ka object
        System.out.println(inner.a);
        inner.m1();
    }
}
