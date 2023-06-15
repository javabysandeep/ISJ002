package classComponents;

public class Demo2 {
    int a = 100;
    static int b= 200;
    public static void main(String[] args) {
        int b = 2000;
        Demo2 ref = new Demo2();
        System.out.println(ref.a);

        System.out.println(Demo2.b);// static variable accessed with class name
        System.out.println(b);// static variable accessed directly without class name in the same class
        System.out.println(ref.b);// static variable accessed directly with ref. --> it will be replaced with class Name

    }
}
