package doubts;

public class Demo2 {
    public static void main(String[] args) {
        for (int i = 0, j = 0; i < 5 && j < 5; i++, j=i+2) {
            System.out.println("for loop body");

        }
        System.out.println("rest of main");
    }
}
