package controlStatements.doubts;

public class Demo1 {
    public static void main(String[] args) {
        boolean flag = true;
        for (System.out.println("initialization"); flag; System.out.println("increment /decrement")) {
            System.out.println("for loop body");
            flag = false;
        }
        System.out.println("rest of main");
    }
}
