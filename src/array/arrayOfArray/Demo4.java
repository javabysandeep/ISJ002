package array.arrayOfArray;

public class Demo4 {
    public static void main(String[] args) {
        int[][] matrix = new int[3][2];
        System.out.println(matrix);//hashcode /reference
        System.out.println(matrix[0]);//ref
        System.out.println(matrix[1]);//ref
        System.out.println(matrix[2]);//ref

        System.out.println("printing size");
        System.out.println(matrix.length);//3
        System.out.println(matrix[0].length);//2
        System.out.println(matrix[1].length);//2
        System.out.println(matrix[2].length);//2

        System.out.println("First array elements");
        System.out.println(matrix[0][0]);
        System.out.println(matrix[0][1]);

        System.out.println("Second array elements");
        System.out.println(matrix[1][0]);
        System.out.println(matrix[1][1]);

        System.out.println("Third array elements");
        System.out.println(matrix[2][0]);
        System.out.println(matrix[2][1]);

    }
}
