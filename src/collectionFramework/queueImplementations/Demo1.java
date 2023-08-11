package collectionFramework.queueImplementations;

import java.util.LinkedList;
import java.util.Queue;

public class Demo1 {
    public static void main(String[] args) {
        //Queue is implemented with LinkedList.

        Queue queue = new LinkedList();

        //remove operation
        System.out.println(queue.poll());//null
        //System.out.println(queue.remove());//exception

        //read operation
        System.out.println(queue.peek());//null
        System.out.println(queue.element());//exception : NoSuchElementException
    }
}
