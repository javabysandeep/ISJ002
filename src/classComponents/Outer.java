package classComponents;

public class Outer {
    public int a = 10000;
   public void m1(){
        System.out.println("outer instance method");
    }
    public class Inner{
          /*  static int a = 100;
            static {}
            static void m(){}
            static class A{}*/
       public int a = 100;
       public void m1(){
            System.out.println("inner class instance method");
        }
    }
}
