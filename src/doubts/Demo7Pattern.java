package doubts;

public class Demo7Pattern {
    public static void main(String[] args) {
        for (int row = 1; row <=5 ; row++) {
            //spaces
            for (int space = 1; space<=row-1  ; space++) {
                System.out.print(" ");
            }
            //stars
            for (int column = 5; column >=row ; column--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
