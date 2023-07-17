package array;

public class Demo9PrintEvenArrayElements {
    public static void main(String[] args) {
        int[] array = {11, 20, 30, 40, 67, 71};
        for (int index = 0; index < array.length; index++) {
            if (array[index] % 2 == 0) {
                System.out.println(array[index]);
            }
        }

    }
}
