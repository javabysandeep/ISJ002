package stringHandling;

public class Demo7StringMethodsConcat {
    public static void main(String[] args) {
        String str = "welcome to string handling: ";
        String concat = str.concat(" revision");

        System.out.println(str);
        System.out.println(concat);
        System.out.println("Object from HEAP "+concat.hashCode());
        System.out.println("Object from SCP "+concat.intern().hashCode());


    }
}
