package collectionFramework.queueImplementations;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Demo6Priority {
    public static void main(String[] args) {
        //Priority --> Priority
        Comparator<String> ref = (str1, str2) -> str1.length() - str2.length();
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
