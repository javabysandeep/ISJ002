package stringHandling;

public class Demo21 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("String handling Session");
        StringBuilder encrypted = new StringBuilder();
        StringBuilder decrypted = new StringBuilder();
        for (int index = 0; index < stringBuilder.length(); index++) {
            encrypted.append((char) (stringBuilder.charAt(index) + 2));
        }
        System.out.println(encrypted);
        System.out.println(encrypted.length());
        for (int index = 0; index < encrypted.length(); index++) {
            char c = (char) (encrypted.charAt(index) - 2);
            decrypted.append(c);
        }
        System.out.println(decrypted);
    }
}
