package stringHandling;

public class Demo19LengthCapacity {
    public static void main(String[] args) {
        String str1 = "welcome";
        StringBuilder stringBuilder = new StringBuilder("Welcome");
        StringBuffer stringBuffer = new StringBuffer("welcome");
        System.out.println("String length " + str1.length());
        System.out.println("StringBuilder length " + stringBuilder.length());
        System.out.println("StringBuffer length " + stringBuffer.length());

        //capacity is only for StringBuilder and StringBuffer
        StringBuilder stringBuilder1 = new StringBuilder(100);
        System.out.println("StringBuilder capacity "+stringBuilder1.capacity());
    }
}
