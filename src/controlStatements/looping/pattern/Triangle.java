package controlStatements.looping.pattern;

public class Triangle {
    public static void main(String[] args) {

        //upper triangle
        for (int row = 1; row <= 7; row=row+2) {
            //spaces
            for (int space = 7 - row; space > 0; space--) {
                System.out.print(" ");
            }
            //stars
            for (int star = 1; star <= row; star++) {
                System.out.print(" * ");
            }
            //new line
            System.out.println();
        }

        //lower triangle
    }
}
