package controlStatements.looping;

public class Demo20Pattern {
    public static void main(String[] args) {
      /*
      *      1 1 1 1 1
      *      2 2 2 2 2
      *      3 3 3 3 3
      *      4 4 4 4 4
      *      5 5 5 5 5
      *
      * */

        for (int row = 1; row <=5 ; row++) {
            for (int column = 1; column <=5 ; column++) {
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }
}
