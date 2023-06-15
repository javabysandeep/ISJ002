package classComponents;

public class LocalVariables {
    public static void main(String[] args) {
        // local variables
        int a = 100; // local primitive variable : byte, short, int, long, float, double, char, boolean
        String name = "abc"; // local reference variable
        display();
        System.out.println(a);
        System.out.println(name);


    }
    public  static void display(){
        System.out.println("display method");
        int a = 1000;
        String name = "xyz";
        System.out.println(a);
        System.out.println(name);
    }
}
