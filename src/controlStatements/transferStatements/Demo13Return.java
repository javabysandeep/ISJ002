package controlStatements.transferStatements;

public class Demo13Return {
    public static void main(String[] args) {
        display();
        System.out.println("rest of the main method");
    }

    public static void display() {
        for (int i = 0; i <= 5; i++) {
            if (i == 4) {
                return;
            }
            System.out.println(i);
        }
        System.out.println("rest of display method");
    }
}
