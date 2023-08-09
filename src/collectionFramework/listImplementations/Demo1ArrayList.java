package collectionFramework.listImplementations;

import java.util.ArrayList;
import java.util.List;

public class Demo1ArrayList {
    public static void main(String[] args) {
        //1. we can add homo, heterogeneous data
        //2. we can add number of elements. growable
        //3. we can add duplicate elements
        //4. we can maintain insertion order of elements
        List list = new ArrayList();
        list.add(10);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(null);
        list.add("string data");
        list.add(true);

        System.out.println(list);
    }
}
