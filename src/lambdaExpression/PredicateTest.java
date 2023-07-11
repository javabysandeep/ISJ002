package lambdaExpression;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        Predicate predicate = (input) -> true;
        System.out.println(predicate.test(""));

        Predicate<Integer> isEven = (number) -> number % 2 == 0;
        System.out.println(isEven.test(10));//true
        System.out.println(isEven.test(11));//false

        Function<Integer, Integer> square = x -> x * x;
        System.out.println(square.apply(10));

        BiFunction<Integer, Integer, Integer> twoInput = (x, y) -> x * y;
        System.out.println(twoInput.apply(10,20));

    }
}
