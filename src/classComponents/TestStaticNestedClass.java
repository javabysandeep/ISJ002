package classComponents;

public class TestStaticNestedClass {
    public static void main(String[] args) {
       /* StaticOuter outer = new StaticOuter();
        System.out.println(outer.a);//1*/

        System.out.println(StaticOuter.b);
        StaticOuter.m1();

        StaticOuter.StaticNested ref =
                new StaticOuter.StaticNested();

        System.out.println(ref.a);
        ref.m1();

        System.out.println(StaticOuter.StaticNested.b);
        StaticOuter.StaticNested.m2();

    }
}
