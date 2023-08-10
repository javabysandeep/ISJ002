package collectionFramework.listImplementations.arraListDemo;

import java.util.ArrayList;
import java.util.List;

public class Demo4ArrayList {
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

        List<Integer> listOfElementsToBeAdded = new ArrayList<>();
        listOfElementsToBeAdded.add(100);
        listOfElementsToBeAdded.add(310);
        listOfElementsToBeAdded.add(241);

        //add multiple elements
        list.addAll(listOfElementsToBeAdded);
        System.out.println(list);

    }
}
