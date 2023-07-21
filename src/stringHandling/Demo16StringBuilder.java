package stringHandling;

public class Demo16StringBuilder {
    public static void main(String[] args) {
//        StringBuilder stringBuilder = "string handling session";//CTE
        StringBuilder stringBuilder = new StringBuilder("string handling session");
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}
