package controlStatements.doubts;

public class Demo6Pattern {
    public static void main(String[] args) {
        for (int row = 1; row <=5 ; row++) {
            for (int column = 5; column >=row ; column--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}