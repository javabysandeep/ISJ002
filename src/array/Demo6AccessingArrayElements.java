package array;

public class Demo6AccessingArrayElements {
    public static void main(String[] args) {
        int[] array = {-10, 20, 40, -50};
        System.out.println(array[4]); // ArrayIndexOutOfBoundsException
        System.out.println(array[0]); //-10
        System.out.println(array[1]); // 20
        System.out.println(array[2]); // 40
        System.out.println(array[3]); // -50


    }
}
