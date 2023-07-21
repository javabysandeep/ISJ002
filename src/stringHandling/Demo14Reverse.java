package stringHandling;

public class Demo14Reverse {
    public static void main(String[] args) {
        String str = "welcome to string handling session";
        //str.reverse(); //reverse method is not present in String class
        //without using StringBuilder, StringBuffer reverse the String
        char[] charArray = str.trim().toCharArray();
        for (int left = 0, right = charArray.length - 1; left < right; left++, right--) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
        }
        for (char ch : charArray) {
            System.out.print(ch);
        }
    }
}
