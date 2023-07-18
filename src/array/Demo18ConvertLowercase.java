package array;

public class Demo18ConvertLowercase {
    public static void main(String[] args) {
        // convert char array to lowercase
        char[] array = {'a', 'b', 'c', 'Y', 'z', 'D', 'B'};
        convertLowercase(array);
        for (char ch : array) {
            System.out.print(ch + " ");
        }

    }

    private static void convertLowercase(char[] array) {
        for (int index = 0; index < array.length; index++) {
            char ch = array[index];
            if (ch >= 'A' && ch <= 'Z') {
                array[index] = (char) (array[index] + 32);
            }
        }
    }
}
