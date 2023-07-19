package array.arrayOfArray;

public class Demo7 {
    public static void main(String[] args) {
        int[][] array = new int[3][5];
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print(array[row][column]+" ");
            }
            System.out.println();
        }
    }
}
