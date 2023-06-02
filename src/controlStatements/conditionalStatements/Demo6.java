package controlStatements.conditionalStatements;

public class Demo6 {
    public static void main(String[] args) {
        //Take values of length and breadth of a rectangle from user and check if it is square or not.
        int length = 100;
        int breadth = 200;
        if (length == breadth) {
            System.out.println("its a Square");
        } else {
            System.out.println("its a Rectangle");
        }
    }
}
