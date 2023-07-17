package array;

public class Demo11LinearSearch {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 57, 23, 45, 89, 76};
        int key = 570;
        boolean isFound = false;
        for (int index = 0; index < array.length; index++) {
            if (array[index] == key) {
                isFound = true;
                break;
            }
        }
        System.out.println(isFound ? "found" : "not found");

    }
}
