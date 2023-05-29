package operators.incrementDecrement;

public class Demo2 {
    public static void main(String[] args) {
        int a = 10;
        int b = ++a;
        System.out.println(a);//11
        System.out.println(b);//11

        int p = 10;
        int q = p++;
        System.out.println(q);//10
        System.out.println(p);//11
    }
}
