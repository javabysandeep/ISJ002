package doubts;

public class Demo9 {
    public static void main(String[] args) {
        int[] array = {10,20,304};
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }

        //foreach
        for (int i:array) {
            System.out.println(i);
        }
    }
}
