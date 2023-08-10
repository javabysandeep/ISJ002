package collectionFramework.listImplementations.arraListDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Demo3ArrayList {
    public static void main(String[] args) {
        // container object creation
        List<Integer> list = new ArrayList<>();
        // add operation : adding one element in the container
        list.add(10);
        list.add(31);
        list.add(41);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);

        List<Integer> listOfElementsToBeRemoved = new ArrayList<>();
        listOfElementsToBeRemoved.add(10);
        listOfElementsToBeRemoved.add(31);
        listOfElementsToBeRemoved.add(41);

        //remove multiple elements
        list.removeAll(listOfElementsToBeRemoved);
        System.out.println(list);

    }
}
