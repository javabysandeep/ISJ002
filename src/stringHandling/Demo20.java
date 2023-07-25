package stringHandling;

public class Demo20 {
    public static void main(String[] args) {
        String str = "string handling";
        str = str.concat(" session");
        System.out.println(str);

        StringBuilder stringBuilder = new StringBuilder("string handling");
        stringBuilder.append(" session");
        System.out.println(stringBuilder);
        stringBuilder.reverse();
        System.out.println("After reverse  "+stringBuilder);
    }
}
