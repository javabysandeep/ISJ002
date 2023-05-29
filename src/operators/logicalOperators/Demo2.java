package operators.logicalOperators;

public class Demo2 {
    public static void main(String[] args) {
        // &, &&,AND : both operands should be true : Complution // mandate
        //| || OR : both operands false : false : optional
        //^ XOR : unique -: true

        System.out.println("Logical AND operation");
        System.out.println(10 > 3 && 3 > 2);//true
        System.out.println(10 < 3 && 3 < 2);//false
        System.out.println(10 > 3 && 3 < 2);//false
        System.out.println(10 < 3 && 3 > 2);//false

        System.out.println("Logical OR operation");
        System.out.println(10 > 3 || 3 > 2);//true
        System.out.println(10 < 3 || 3 < 2);//false
        System.out.println(10 > 3 || 3 < 2);//true
        System.out.println(10 < 3 || 3 > 2);//true

        System.out.println("Logical XOR operation"); // Unique
        System.out.println(10 > 3 ^ 3 > 2);//false
        System.out.println(10 < 3 ^ 3 < 2);//false
        System.out.println(10 > 3 ^ 3 < 2);//true
        System.out.println(10 < 3 ^ 3 > 2);//true
    }
}
