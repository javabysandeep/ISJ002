package collectionFramework.listImplementations.linkedlistDemo;

import java.util.LinkedList;
import java.util.List;

public class Demo1LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(21);
        linkedList.add(19);

        //traditional way
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

        //enhanced for loop
        System.out.println("enhanced for loop");
        for (int temp:linkedList) {
            System.out.println(temp);
        }

    }
}
