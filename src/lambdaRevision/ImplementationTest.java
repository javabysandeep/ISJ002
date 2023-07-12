package lambdaRevision;

public class ImplementationTest {
    public static void main(String[] args) {
        //anonymous class way
        I1 i1 = new I1() {
            @Override
            public void m1() {
                System.out.println("m1 method in anonymous class");
            }
        };
        i1.m1();
    }
}
