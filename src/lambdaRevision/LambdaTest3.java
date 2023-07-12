package lambdaRevision;

import java.util.function.Predicate;

public class LambdaTest3 {
    public static void main(String[] args) {
        Predicate<Integer> isEven = (number) -> number % 2 == 0;
        System.out.println(isEven.test(10));

        Predicate<Integer> eligibleForVote = (age) -> age > 18;
        System.out.println("I am eligible for vote = " + eligibleForVote.test(20));

    }
}
