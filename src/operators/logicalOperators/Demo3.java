package operators.logicalOperators;

public class Demo3 {
    public static void main(String[] args) {
        //pure logical operators : &&, ||, ! --> input/output : boolean
        //impure logical : both logical and bitwise operators
        // Input :number[bitwise]    /   boolean[logical]
        //output : number[bitwise]/boolean [logical]

        /*System.out.println(4 && 5);//CTE : pure logical operators
        System.out.println(4 || 5);//CTE : pure logical operators
        System.out.println(!4); //CTE : pure logical operators*/

        System.out.println(4 & 5);// it will act as bitwise AND operation : number as output : 4
        System.out.println(4 | 5);// it will act as bitwise OR operation : number as output : 5
        System.out.println(4 ^ 5); //it will act as bitwise XOR : number as output : 1
    }
}
