package array.arrayOfArray;

public class Demo1 {
    public static void main(String[] args) {
        int[] array1 = {10, 20, 30};
        int[] array2 = {40, 50, 60};
        int[] array3 = {70, 80, 90};

        int[][] arrayOfArray = {array1, array2, array3};

        System.out.println(array1);//hashcode
        System.out.println(array2);//
        System.out.println(array3);//
        System.out.println(arrayOfArray);//address of array of array

        //printing array of array
        System.out.println("Printing array of array content");
        for (int index = 0; index <arrayOfArray.length ; index++) {
            System.out.println(arrayOfArray[index]);
        }
    }
}
