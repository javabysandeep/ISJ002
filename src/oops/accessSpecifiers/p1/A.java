package oops.accessSpecifiers.p1;

public class A {
    public int a = 100;
    private int b = 200;
    protected int c = 300;
    int d = 400;

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.a);
        System.out.println(a.b);
        System.out.println(a.c);
        System.out.println(a.d);
    }
}
