package oops.inheritance.constructorChaining;

public class B extends A{
    B() {
        //1. constructor of the parent class or same class constructor : super();
        super();
        //2. instance block of same class
        System.out.println("B class constructor");
    }

    {
        System.out.println("B class instance block");
    }

    static {
        System.out.println("B class static block");
    }

    public static void main(String[] args) {
        //A a = new A(); // static block of A, static block of B, IB A, constructor of A

        B b = new B();
        //  order of execution
        //1. static block of Parent class A
        //2. static block of Child Class B
        //3. instance block of Parent class A
        //4. Constructor of Parent class A
        //5. instance block of Child class B
        //6. constructor of Child class B

    }
}
