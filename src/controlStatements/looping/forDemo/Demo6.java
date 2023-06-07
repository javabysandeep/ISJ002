package controlStatements.looping.forDemo;

public class Demo6 {
    public static void main(String[] args) {
        int i = 1;
        for (; i <= 10; ) {
            System.out.println(i);
            i--;
        }

        //output: 1,0,-1,-2........................
    }
}
