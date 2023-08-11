package collectionFramework.queueImplementations;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Demo3Priority {
    public static void main(String[] args) {
        //Priority --> Priority
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(10);
        queue.add(1);
        queue.add(30);
        queue.add(2);
        queue.add(5);
        //Order :  ---> 5 2 30 1 10 -->
        System.out.println(queue.poll());//1
        System.out.println(queue.poll());//2
        System.out.println(queue.poll());//5
        System.out.println(queue.poll());//10
        System.out.println(queue.poll());//30
        System.out.println("Queue size " + queue.size());//0

    }
}
