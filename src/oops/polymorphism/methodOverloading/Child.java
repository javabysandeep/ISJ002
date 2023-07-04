package oops.polymorphism.methodOverloading;

public class Child extends Parent{
    //method overloading and not method overriding
    void display(int a) {
        System.out.println("child class display method");
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.display();
        child.display(10);
    }
}
