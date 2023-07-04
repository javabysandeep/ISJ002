package oops.polymorphism.inteview;

public class Main {
    public static void main(String[] args) {
        ArithmeticException reference1 = new ArithmeticException();
        RuntimeException reference2 = new ArithmeticException();
        Exception reference3 = new ArithmeticException();
        Throwable reference4 = new ArithmeticException();
        Object reference5 = new ArithmeticException();

        digestMe(reference1);
        digestMe(reference2);
        digestMe(reference3);
        digestMe(reference4);
        digestMe(reference5);
    }

    public static void digestMe(Object object) {
        System.out.println("parent class reference can hold child class object");
    }
}
