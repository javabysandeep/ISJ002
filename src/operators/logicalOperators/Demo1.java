package operators.logicalOperators;

public class Demo1 {
    public static void main(String[] args) {
        // &, &&,AND : both operands should be true : Complution // mandate
        //| || OR : both operands false : false : optional
        //^ XOR : unique -: true

        System.out.println("Logical AND operation");
        System.out.println(true && true);//true
        System.out.println(false && false);//false
        System.out.println(true && false);//false
        System.out.println(false && true);//false

        System.out.println("Logical OR operation");
        System.out.println(true || true);//true
        System.out.println(false || false);//false
        System.out.println(true || false);//true
        System.out.println(false || true);//true

        System.out.println("Logical XOR operation"); // Unique
        System.out.println(true ^ true);//false
        System.out.println(false ^ false);//false
        System.out.println(true ^ false);//true
        System.out.println(false ^ true);//true
    }
}
