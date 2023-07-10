package lambdaExpression;

public class LambdaTest {
    public static void main(String[] args) {
        I1 i1 = (number1, number2) -> number1 + number2;
        System.out.println(i1.add(100, 200));

        I2 i2 = ()-> System.out.println("display method ");
        i2.display();

        I3 i3 = ()-> "String supplied";
        System.out.println(i3.supply());
    }
}
