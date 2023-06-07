package controlStatements.transferStatements;

public class Demo5Break {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {

            if (i % 2 == 0) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("rest of main method");
    }
}
