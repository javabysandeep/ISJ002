package collectionFramework.queueImplementations;

import java.util.PriorityQueue;
import java.util.Queue;

public class EmployeeQueue {
    public static void main(String[] args) {
        Queue<Emp> empQueue = new PriorityQueue<>(
                (emp1, emp2) -> emp2.getSalary() - emp1.getSalary()
        );

        Emp employee1 = new Emp(11, "Vaibhav", 89000);
        Emp employee2 = new Emp(2, "Lalit", 54000);
        Emp employee3 = new Emp(32, "Shirish", 100000);
        Emp employee4 = new Emp(4, "Heena", 234000);

        empQueue.add(employee1);
        empQueue.add(employee2);
        empQueue.add(employee3);
        empQueue.add(employee4);

        System.out.println(empQueue.poll());
        System.out.println(empQueue.poll());
        System.out.println(empQueue.poll());
        System.out.println(empQueue.poll());

    }
}
