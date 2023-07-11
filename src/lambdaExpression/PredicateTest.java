package lambdaExpression;

import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        Predicate predicate = (input) -> true;
        System.out.println(predicate.test(""));

        Predicate<Integer> isEven = (number) -> number % 2 == 0;
        System.out.println(isEven.test(10));//true
        System.out.println(isEven.test(11));//false
    }
}
