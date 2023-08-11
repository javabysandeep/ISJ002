package collectionFramework.queueImplementations;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Demo5Priority {
    public static void main(String[] args) {
        //Priority --> Priority
        Comparator<String> ref = new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                return str2.compareTo(str1);
            }
        };
        Queue<String> queue = new PriorityQueue<>(ref);
        queue.add("Lalit");
        queue.add("Vaibhav");
        queue.add("Heena");
        queue.add("Shirish");
        queue.add("Shivani");
        queue.add("Rohan");

        //Order :  --->  -->
        System.out.println(queue.poll());//Heena
        System.out.println(queue.poll());//Lalit
        System.out.println(queue.poll());//Rohan
        System.out.println(queue.poll());//Shirish
        System.out.println(queue.poll());//Shivani
        System.out.println(queue.poll());//Vaibhav
        System.out.println("Queue size " + queue.size());//0

    }
}
