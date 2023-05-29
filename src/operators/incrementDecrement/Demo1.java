package operators.incrementDecrement;

public class Demo1 {
    public static void main(String[] args) {
        int a = 10;
        //increment or decrement will apply only on variables
        System.out.println(a++);//10
        System.out.println(a);//11

        int b = 20;
        System.out.println(++b);//21
        System.out.println(b);//21

        int c = 30;
        System.out.println(c--);//30
        System.out.println(c);//29

        int d = 40;
        System.out.println(--d);//39
        System.out.println(d);//39
    }
}
