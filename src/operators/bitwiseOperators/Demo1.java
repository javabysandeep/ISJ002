package operators.bitwiseOperators;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println(4 & 5);//4
        System.out.println(4 | 5);//5
        System.out.println(4 ^ 5);//1

        System.out.println(4 << 1);//8
        System.out.println(4 << 2);//16
        System.out.println(4 << 3);//32
        System.out.println(4 << 4);//64
        System.out.println(4 << 5);//128

        // operand1 * 2 raise to operand2= 4 * 2^1 --> 8


        System.out.println(4 >> 1);//2
        System.out.println(4 >> 2);//1
        System.out.println(4 >> 3);//0
        System.out.println(4 >> 4);//0
        System.out.println(4 >> 5);//0
        System.out.println(16 >> 3);//2

        // operand1/ 2 raise to operand2 --> 16/8= 2

        System.out.println("negation");
        System.out.println(~4);//-5
        System.out.println(~5);//-6
        System.out.println(~6);//-7

        System.out.println(~-5);//4
        System.out.println(~-6);//5
        System.out.println(~-7);//6

        // change the sign(operand+1)


    }

}
