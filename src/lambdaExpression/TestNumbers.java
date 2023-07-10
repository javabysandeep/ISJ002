package lambdaExpression;

public class TestNumbers {
    public static void main(String[] args) {
        NumberProcessor square = number -> number * number;
        System.out.println(square.process(10));//100

        NumberProcessor cube = number -> number * number * number;
        System.out.println(cube.process(10));//1000
    }
}
