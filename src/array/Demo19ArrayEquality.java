package array;

import java.util.Arrays;

public class Demo19ArrayEquality {
    public static void main(String[] args) {
        int[] array1 = {10, 20, 40, 50};
        int[] array2 = {10, 20, 40, 50};
        System.out.println(arrayEquals(array1, array2) ? "equal" : "not equal");
        System.out.println(Arrays.equals(array1, array2));
    }

    public static boolean arrayEquals(int[] array1, int[] array2) {
        if (array1 == array2) {
            return true;
        }

        if (array1 == null || array2 == null) {
            return false;
        }

        if (array1.length != array2.length) {
            return false;
        }

        for (int index = 0; index < array1.length; index++) {
            if (array1[index] != array2[index]) {
                return false;
            }
        }
        return true;
    }
}
