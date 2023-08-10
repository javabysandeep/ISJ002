package collectionFramework.listImplementations.arraListDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo6ArrayList {
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
        list.add(1);

        List<Integer> shortListed = new ArrayList<>();
        shortListed.add(31);
        shortListed.add(41);
        shortListed.add(1);
        shortListed.add(11);

        list.retainAll(shortListed);
        System.out.println(list);


    }
}
