package controlStatements.transferStatements;

public class Demo1Break {
    public static void main(String[] args) {
        //break : keyword -> can be used only within loops[for, while, do-while, foreach] and switch
        System.out.println("");
        //break;

        for (;;){
            System.out.println("for loop body");
            break;
        }
        System.out.println("rest of the main method");
    }
}
