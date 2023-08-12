package collectionFramework.cursors;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo3ListIterator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(600);
        list.add(700);
        list.add(300);
        list.add(300);


        System.out.println("using iterator way");
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if (element == 700) {
                iterator.remove();
            }
            if (element == 300) {
                iterator.add(999);
            }
            System.out.println(element);
        }
        System.out.println("After modification");
        System.out.println(list);
    }
}
