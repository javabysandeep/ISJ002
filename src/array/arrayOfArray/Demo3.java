package array.arrayOfArray;

public class Demo3 {
    public static void main(String[] args) {
        int[][][] arrayOfArrayOfArrayOfIntegers = {
                {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}},
                {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}},
                {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}},
                {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}},
                {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}}
        };//5 --> 4 --> 3
        //heap memory area
        for (int i = 0; i < arrayOfArrayOfArrayOfIntegers.length; i++) {
            for (int j = 0; j < arrayOfArrayOfArrayOfIntegers[i].length; j++) {
                for (int k = 0; k < arrayOfArrayOfArrayOfIntegers[i][j].length; k++) {
                    System.out.print(arrayOfArrayOfArrayOfIntegers[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
