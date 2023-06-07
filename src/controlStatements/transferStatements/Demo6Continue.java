package controlStatements.transferStatements;

public class Demo6Continue {
    public static void main(String[] args) {
        //continue : keyword -> can be used only within loops[for, while, do-while, foreach]
        System.out.println("");
        //continue;

        for (;;){
            System.out.println("for loop body");
            continue;
        }
//        System.out.println("rest of the main method");
    }
}
