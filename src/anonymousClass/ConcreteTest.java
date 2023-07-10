package anonymousClass;

public class ConcreteTest {
    public static void main(String[] args) {
        Parent parent = new Parent() {
            @Override
            void m1() {
                System.out.println("m1 method of anonymous class");
            }

            void m2() {
                System.out.println("m2 method od anonymous class");
            }
        };
        parent.m1();
//        parent.m2();//CTE
    }
}
