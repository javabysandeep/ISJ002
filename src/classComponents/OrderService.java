package classComponents;

public class OrderService {
    {
        System.out.println("instance block");
    }
    static {
        System.out.println("static block");
    }
    OrderService(){
        //1. parent class constructor call
        //2. instance block
        System.out.println("zero param constructor");
    }

    public static void main(String[] args) {
        OrderService orderService = new OrderService();
    }
}
