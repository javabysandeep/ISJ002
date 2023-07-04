package oops.polymorphism.methodOverloading;

public class MainMethodOverloading {
    public static void main(String[] args) {
        System.out.println("main method with String[] args");
        main("test");

    }

    public static void main(String args) {
        System.out.println("main method with String args");
    }
}
