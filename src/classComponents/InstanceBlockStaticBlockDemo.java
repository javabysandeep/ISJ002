package classComponents;

public class InstanceBlockStaticBlockDemo {
    //instance block : block of code outside all methods, all constructors,
    {
        System.out.println("instance block");
    }

    //static block:block of code outside all methods, all constructors with static keyword
    static {
        System.out.println("static block");
    }

    public static void main(String[] args) {
        InstanceBlockStaticBlockDemo demo1 = new InstanceBlockStaticBlockDemo();
        InstanceBlockStaticBlockDemo demo2 = new InstanceBlockStaticBlockDemo();
        InstanceBlockStaticBlockDemo demo3 = new InstanceBlockStaticBlockDemo();
        InstanceBlockStaticBlockDemo demo4 = new InstanceBlockStaticBlockDemo();
        InstanceBlockStaticBlockDemo demo5 = new InstanceBlockStaticBlockDemo();
        InstanceBlockStaticBlockDemo demo6 = new InstanceBlockStaticBlockDemo();
    }
}
