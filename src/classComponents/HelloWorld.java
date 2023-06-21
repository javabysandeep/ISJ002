package classComponents;

public class HelloWorld {
    int balance;//instance variable
    int n;//instance variable
    static int q = 5666;//static variable

    {
        int a = 10;
        System.out.println("instance block");
    }

    static {
        int b = 100;
        System.out.println("static block");
    }

    HelloWorld() {
        int c = 1000;
    }


    public static void main(String[] args) {
        //local variable : a variable which is created inside the method, inside the block, inside the constructor
        int d = 10000;//local variable creation
        System.out.println(d);// local variable access
        System.out.println(q);//static variable
        System.out.println(HelloWorld.q);//static variable

        //m,n
    HelloWorld helloWorld = new HelloWorld();
        System.out.println(helloWorld.balance);

    }
}
