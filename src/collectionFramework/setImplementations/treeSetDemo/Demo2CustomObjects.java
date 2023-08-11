package collectionFramework.setImplementations.treeSetDemo;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo2CustomObjects {
    public static void main(String[] args) {
        Employee employee1 = new Employee(11, "Vaibhav", 89000);
        Employee employee2 = new Employee(2, "Lalit", 54000);
        Employee employee3 = new Employee(32, "Shirish", 100000);
        Employee employee4 = new Employee(4, "Heena", 234000);

        Set<Employee> employees = new TreeSet<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
