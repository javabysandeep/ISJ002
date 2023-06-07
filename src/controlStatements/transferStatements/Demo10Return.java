package controlStatements.transferStatements;

public class Demo10Return {
    public static void main(String[] args) {
        if(true){
            System.out.println("if block");
            return;
        }
        System.out.println("rest of main method");
    }
}
