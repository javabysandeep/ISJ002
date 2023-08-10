package collectionFramework.listImplementations.arraListDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo5ArrayList {
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

        Collections.sort(list);
        System.out.println(list);

    }
}
