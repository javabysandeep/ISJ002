package stringHandling;

public class Demo9Equality {
    public static void main(String[] args) {
        String str1 = "String handling";
        String str2 = new String("string handling");
        System.out.println(str1 == str2);//reference check : false

        //compare based on content
        System.out.println(str1.equals(str2));// compared based on content : false

        //compare based on content but ignore the case
        System.out.println(str1.equalsIgnoreCase(str2));
    }
}
