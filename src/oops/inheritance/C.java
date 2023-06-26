package oops.inheritance;

public class C extends A/*extends A,B*/ {

    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.a);
        c.display();
    }

}
