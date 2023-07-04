package oops.polymorphism.methodOverloading;

public class ConstructorOverloading {
    int a;
    int b;
    int c;

    public ConstructorOverloading() {
    }

    public ConstructorOverloading(int a) {
        this.a = a;
    }

    public ConstructorOverloading(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public ConstructorOverloading(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void main(String[] args) {
        ConstructorOverloading ref1 = new ConstructorOverloading();
        ConstructorOverloading ref2 = new ConstructorOverloading(10);
        ConstructorOverloading ref3 = new ConstructorOverloading(10, 20);
        ConstructorOverloading ref4 = new ConstructorOverloading(10, 20, 30);

    }
}
