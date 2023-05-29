package operators.incrementDecrement;

public class Demo5 {
    public static void main(String[] args) {
        char a = 'A';
        char b = 'B';
        char c = 'C';
        char d = 'D';
        System.out.println(--d + a++ + --b + ++c + a + d-- + b);//463
    }
}
