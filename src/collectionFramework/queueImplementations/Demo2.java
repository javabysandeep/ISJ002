package collectionFramework.queueImplementations;

import java.util.LinkedList;
import java.util.Queue;

public class Demo2 {
    public static void main(String[] args) {
        //Queue is implemented with LinkedList.
        //LinkedList is an unbounded queue implementation
        Queue<Integer> queue = new LinkedList();
        queue.add(10);
        queue.add(1);
        queue.add(30);
        queue.add(2);
        queue.add(5);
        //FIFO :  ---> 5 2 30 1 10 -->
        System.out.println(queue.poll());//10
        System.out.println(queue.poll());//1
        System.out.println(queue.poll());//30
        System.out.println(queue.poll());//2
        System.out.println(queue.poll());//5
        System.out.println("Queue size " + queue.size());//0

    }
}
