package oops.abstraction;

public class MultiLevel {
    public static void main(String[] args) {
        A ac = new C();
        ac.m1();
        //ac.m2();
        //ac.m3();


        B bc = new C();
        bc.m1();
        bc.m2();
        //bc.m3();

        C c = new C();
        c.m1();
        c.m2();
        c.m3();
    }
}
