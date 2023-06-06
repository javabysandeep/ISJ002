package controlStatements.looping;

public class Demo18Pattern {
    public static void main(String[] args) {
        /*
         *   *****
         *   *****
         *   *****
         *   *****
         *   *****
         *
         * */

        for (int row = 1; row <= 50; row++) {
            //System.out.println("* * * * *");//500000
            //*********************************************************************************
            for (int column = 1; column <= 50; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
