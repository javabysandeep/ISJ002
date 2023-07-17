package array;

public class Demo7AccessingArrayWithLoop {
    public static void main(String[] args) {
        int[] array = {-10, 20, 40, -50};
        int arraySize = array.length;//4
        for (int index = 0; index < arraySize; index++) {
            System.out.println(array[index]);
        }
    }
}
