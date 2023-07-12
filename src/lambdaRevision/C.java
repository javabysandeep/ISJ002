package lambdaRevision;

public class C implements I1, I2{
    @Override
    public void m1() {
        System.out.println("M1 method override");
    }

    public static void main(String[] args) {
        C c = new C();
        c.m1();
    }
}
