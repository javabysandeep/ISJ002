package array;

public class Demo10ArrayCopy {
    public static void main(String[] args) {
        int[] oldArray = {10, 20, 30, 40, 56};
        int[] newArray = new int[oldArray.length];

        for (int index = 0; index < oldArray.length; index++) {
            newArray[index] = oldArray[index];
        }

        //print new array
        for (int index = 0; index < newArray.length; index++) {
            System.out.print(newArray[index] + ", ");
        }

    }
}
