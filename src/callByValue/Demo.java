package callByValue;

public class Demo {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        System.out.println(add(a, b));//3000
        System.out.println("Value of a =" + a);//100
        System.out.println("Value of b =" + b);//200
    }

    private static int add(int a, int b) {
        a = 1000;
        b = 2000;
        return a + b;
    }
}
