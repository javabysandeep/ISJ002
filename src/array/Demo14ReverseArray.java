package array;

public class Demo14ReverseArray {
    public static void main(String[] args) {
        int[] array = {10, 30, 20, 40, 50, 60};

        for (int left = 0, right = array.length - 1; left < right; left++, right--) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
        }

        //after reversing the print the array: foreach
        for (int temp : array) {
            System.out.print(temp + " ");
        }
    }
}
