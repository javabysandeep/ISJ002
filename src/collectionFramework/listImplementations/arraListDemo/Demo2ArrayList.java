package collectionFramework.listImplementations.arraListDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Demo2ArrayList {
    public static void main(String[] args) {
        // container object creation
        List<Integer> list = new ArrayList<>();
        // add operation : adding one element in the container
        list.add(10);
        list.add(31);
        list.add(41);
        list.add(50);

        //remove multiple elements based on condition : java 8 feature
        Predicate<Integer> predicate = (number) -> number % 2 != 0;
        list.removeIf(predicate);
        System.out.println(list);

        //remove all elements
        list.clear();
        System.out.println(list);

    }
}
