package stringHandling;

public class Demo22 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("exception handling");
        stringBuilder.replace(0,9,"string");
        System.out.println(stringBuilder);
    }
}
