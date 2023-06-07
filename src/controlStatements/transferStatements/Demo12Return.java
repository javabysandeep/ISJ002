package controlStatements.transferStatements;

public class Demo12Return {
    public static void main(String[] args) {
        System.out.println(add(100, 300));

    }

    public static int add(int number1, int number2) {
        System.out.println("add method");
        return number1 + number2;
    }
}
