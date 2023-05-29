package operators.arithmetic.shortHandOperators;

public class Demo1 {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        // a = a + 100;
        a += 100;
        // b = b - 100;
        // b -=100;

        //b = b * 10;//2000
        //b *= 10;

        // b = b / 10;//20
        //b /=10;

        // b = b % 10;//0
        b %= 10;//0
        System.out.println("A value  " + a);
        System.out.println("B value  " + b);
    }
}
