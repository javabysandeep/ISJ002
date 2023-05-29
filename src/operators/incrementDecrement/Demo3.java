package operators.incrementDecrement;

public class Demo3 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        System.out.println(a++ + ++b + c-- + --d + ++c);//13
        System.out.println(a + b + c + d);//11
    }
}
