package oops.finalKeyword;

final public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {

    }

    public static Singleton getSingletonInstance() {
        return singleton;
    }
}
