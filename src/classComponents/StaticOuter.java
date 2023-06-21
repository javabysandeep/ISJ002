package classComponents;

public class StaticOuter {
    int a = 1;
    static int b = 10;
    static void m1(){
        System.out.println("static method of outer class");
    }

    static  class StaticNested{
        int a = 1;
        void m1(){
            System.out.println("instance method from static nested class");
        }
        static int b = 10;
        static void m2(){
            System.out.println("static method from static nested class");
        }
    }


}
