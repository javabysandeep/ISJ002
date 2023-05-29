package operators.incrementDecrement;

public class Demo4 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        System.out.println(--d + a++ + --b + ++c + a + d-- + b);//15
    }
}
