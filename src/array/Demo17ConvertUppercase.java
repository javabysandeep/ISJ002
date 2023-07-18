package array;

public class Demo17ConvertUppercase {
    public static void main(String[] args) {
        // convert char array to uppercase
       /* char[] array = {'a', 'b', 'c', 'Y', 'z', 'D'};
        convertUppercase(array);
        for (char ch : array) {
            System.out.print(ch + " ");
        }*/
        for (char ch = 'A', chSmall = 'a'; ch <= 'Z' && chSmall <= 'z'; ch++, chSmall++) {
            System.out.print("ASCII Value of capital " + ch + "\t" + (int) ch);
            System.out.print("\t ASCII Value of small " + chSmall + "\t" + (int) chSmall);
            System.out.println();
        }

    }

    private static void convertUppercase(char[] array) {
        for (int index = 0; index < array.length; index++) {
            char ch = array[index];
            if (ch >= 'a' && ch <= 'z') {
                array[index] = (char) (array[index] - 32);
            }
        }
    }
}
