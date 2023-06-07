package controlStatements.transferStatements;

public class Demo3Break {
    public static void main(String[] args) {
        do {
            System.out.println("do while loop body");
            break;
        }while (true);
        System.out.println("rest of the main method");
    }
}
