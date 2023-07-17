package array;

public class Demo8PrintArrayReverse {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40};
        for (int index = array.length - 1; index >= 0; index--) {
            System.out.println(array[index]);
        }

    }
}
