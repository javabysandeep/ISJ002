package array;

public class Demo15CheckArrayContainsDigit {
    public static void main(String[] args) {
//Create a character array and check if it contains digits
        char[] array = {'0', 'B', 'X', 'Y', '9', '@'};
        System.out.println(isArrayContainsDigit(array) ? "Contains digit" : "does not contain digit");
    }

    private static boolean isArrayContainsDigit(char[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] >= '0' && array[index] <= '9') {
                System.out.println("UNICODE/ASCII value of " + array[index] + "\t is " + (int) array[index]);
                return true;
            }
        }
        return false;
    }
}
