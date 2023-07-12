package lambdaRevision;

import java.util.Scanner;
import java.util.function.Predicate;

public class LambdaTest4 {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        Predicate<Integer> eligibleForVote = (input) -> input > 18;
        System.out.println("I am eligible for vote = " + eligibleForVote.test(age));
    }
}
