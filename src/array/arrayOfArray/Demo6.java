package array.arrayOfArray;

public class Demo6 {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 50, 60, 70},
                {11, 22}
        };
        //Jagged arrays: arrays with different row sizes

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }


    }
}
