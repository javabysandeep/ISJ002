package oops.abstraction.interfaceDemos;

public interface DemoInterface {
    //1. variables : by default variables are public static final
    public static final int a = 100;
    public static final int b = 200;

    //2. methods
    // void m1(){} // instance methods are not allowed to support multiple inheritance
    public abstract void m3();// by default methods are public abstract

    public default void m1() {
    } // default methods are allowed from java 8

    static void m2() {
    }// static method is allowed from java 8 onwards

    //3. constructor
    //MessageService(){} : constructors are not allowed in interface to support multiple inheritance
    //4. blocks
    //{}
    //static {}

    //5. nested classes
   public static class A{} // by default nested classes are public static
}
