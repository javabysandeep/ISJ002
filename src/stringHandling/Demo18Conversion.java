package stringHandling;

public class Demo18Conversion {
    public static void main(String[] args) {
        String str1 = "welcome";
     /*   StringBuilder stringBuilder = str1;//CTE
        StringBuffer stringBuffer = str1; //CTE
        String str2 = new StringBuilder();//CTE
        String str3 = new StringBuffer();//CTE*/

        StringBuilder stringBuilder = new StringBuilder(str1);
        StringBuffer stringBuffer = new StringBuffer(str1);

        String str2 = new String(stringBuilder);

        System.out.println(str1);
        System.out.println(stringBuilder);
        System.out.println(stringBuffer);
        System.out.println(str2);
    }
}
