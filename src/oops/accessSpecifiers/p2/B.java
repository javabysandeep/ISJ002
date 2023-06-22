package oops.accessSpecifiers.p2;

import oops.accessSpecifiers.p1.A;

public class B extends A{
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.a);
       // System.out.println(a.b);
       // System.out.println(a.c);
       /* B b = new B();
        System.out.println(b.a);
        System.out.println(b.b);
        System.out.println(b.c);
        System.out.println(b.d);

        System.out.println(a.d);*/
    }
}
