package controlStatements.looping.forDemo;

public class Demo24Pattern {
    public static void main(String[] args) {
        /*
        *                    1
        *                  2 2
        *                3 3 3
        *              4 4 4 4
        *            5 5 5 5 5
        *
        * */
        for (int row = 1; row <=500 ; row++) {
            //spaces
            for (int space = 500 - row; space >=0 ; space--) {
                System.out.print(" ");
            }
            //stars
            for (int star = 1; star <=row ; star++) {
                System.out.print(row);
            }
            System.out.println();
        }
    }
}
