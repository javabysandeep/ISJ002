package array;

public class Demo8SumOfArrayElements {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40};
        int sumOfArrayElements = 0;
        for (int index = 0; index < array.length; index++) {
            sumOfArrayElements = sumOfArrayElements + array[index];
        }
        System.out.println("Sum of array elements "+sumOfArrayElements);

    }
}
