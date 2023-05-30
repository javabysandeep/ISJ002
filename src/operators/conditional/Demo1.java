package operators.conditional;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println(false ? "its a true value" : "its a false value");
        System.out.println(10 % 2 == 0);//true
        System.out.println(10 % 2 == 0 ? "its even " : "its odd");//its even
        System.out.println(9 % 2 == 0 ? "its even " : "its odd");//its odd

        int number = 99;
        System.out.println(number % 2 == 0 ? "its even " : "its odd");//it's odd

        System.out.println(true ? 100 : 200);
        System.out.println(false ? 100 : "200");
        System.out.println(true ? 'A' : "200");

    }
}
