package operators.relational;

public class Demo4 {
    public static void main(String[] args) {
        System.out.println(10 > 10);//false
        System.out.println(10 < 10);//false
        System.out.println(10 <= 10);//true
        System.out.println(10 >= 10);//true
        System.out.println(10 != 10);//false
        System.out.println(10 == 10);//true
        System.out.println(10 > 5);

        //boolean value
        System.out.println(true == true);//true
        System.out.println(true != true);//false
        System.out.println(false != true);//true
        System.out.println(false != false);//false
        System.out.println(false == false);//true

//        System.out.println(true <= false);
        //For boolean data type : > , <, >=, <= are not applicable.
        //If we use this we get CTE.

    }
}
