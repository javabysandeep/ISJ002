package controlStatements.looping.forDemo;

public class Demo7 {
    public static void main(String[] args) {
        int i = 1;
        for (; i <= 10; i = i + 2) {
            System.out.println(i);
            i--;
        }

        //output: 1,2,3,...10
    }
}
