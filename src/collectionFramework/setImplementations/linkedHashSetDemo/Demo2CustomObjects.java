package collectionFramework.setImplementations.linkedHashSetDemo;

import java.util.LinkedHashSet;
import java.util.Set;

public class Demo2CustomObjects {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Vaibhav", 10000);
        Employee employee2 = new Employee(2, "Lalit", 10000);
        Employee employee3 = new Employee(3, "Shirish", 10000);
        Employee employee4 = new Employee(4, "Heena", 10000);

        Set<Employee> employees = new LinkedHashSet<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
