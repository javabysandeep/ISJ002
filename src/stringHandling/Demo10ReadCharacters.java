package stringHandling;

public class Demo10ReadCharacters {
    public static void main(String[] args) {
        String str = "welcome to IT Shaala";
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(7));
        System.out.println(str.charAt(50));//StringIndexOutOfBoundsException
    }
}
