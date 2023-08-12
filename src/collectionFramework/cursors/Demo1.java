package collectionFramework.cursors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(600);
        list.add(700);
        list.add(300);
        list.add(300);

        //way1 : use traditional for loop to read elements one by one
        System.out.println("Way 1 : traditional for loop");
        for (int index = 0; index < list.size(); index++) {
            System.out.println(list.get(index));
        }

        //way 2: use enhanced for loop for traversal of elements
        System.out.println("enhanced for loop for traversal of elements");
        for (Integer temp : list) {
            System.out.println(temp);
        }
        //way 3: using java 8 way
        System.out.println("using java 8 way");
        list.forEach(System.out::println);

        //way 4 : using Cursor : Iterator
        System.out.println("using iterator way");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
