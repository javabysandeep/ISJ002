package collectionFramework.cursors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(600);
        list.add(700);
        list.add(300);
        list.add(300);


        System.out.println("using iterator way");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if (element == 700) {
                iterator.remove();
            }
            System.out.println(element);
        }
        System.out.println(list.size());
    }
}
