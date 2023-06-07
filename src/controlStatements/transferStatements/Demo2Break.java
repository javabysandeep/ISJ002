package controlStatements.transferStatements;

public class Demo2Break {
    public static void main(String[] args) {
        while (true) {
            System.out.println("while loop body");
            break;
        }
        System.out.println("rest of the main method");
    }
}
