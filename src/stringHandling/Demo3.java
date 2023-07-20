package stringHandling;

public class Demo3 {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = new String("abc");
        String s3 = "abc";
        String s4 = "abc";
        String s5 = "xyz";
        String s6 = new String("xyz");

        // in this program
        // 3 objects will be created inside the heap - s1, s2, s6
        // 2 objects will be created inside the SCP - s3, s4, s5

        System.out.println(s1==s2);//false
        System.out.println(s1==s3);//false
        System.out.println(s3==s4);//true
        System.out.println(s5==s6);//false

    }
}
