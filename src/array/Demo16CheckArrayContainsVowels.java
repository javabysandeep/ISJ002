package array;

public class Demo16CheckArrayContainsVowels {
    public static void main(String[] args) {
//Create a character array and check if it contains vowels
        char[] array = {'0', 'A', 'X', 'Y', '9', '@'};
        System.out.println(isArrayContainsVowels(array) ? "Contains Vowels" : "does not contain Vowels");
    }

    private static boolean isArrayContainsVowels(char[] array) {
        for (int index = 0; index < array.length; index++) {
            char ch = array[index];
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                return true;
            }
        }
        return false;
    }
}
