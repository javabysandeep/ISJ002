package stringHandling;

public class Demo12StartsWithEndsWith {
    public static void main(String[] args) {
        String str = "website development using HTML";
        System.out.println("String endswith HTML "+ str.endsWith("HTML"));
        System.out.println("String starts with website "+ str.startsWith("website"));
        System.out.println("String starts with website "+ str.startsWith("WEBSITE"));
    }
}
