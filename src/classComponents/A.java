package classComponents;

public class A {
    class B {}//nested class - inner class or non-static nested class
    static class C{}//static nested class

    public static void main(String[] args) {
        //local inner class
        class D{
            int a = 100;
          /*  static int b = 200;
            static {}
            static void m(){}
            sttaic class C{}*/

        }
        D d = new D();
        System.out.println(d.a);

    }
    A(){
        class D{}//local inner class
    }
    {
        class D{}//local inner class
    }
}
