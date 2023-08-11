package collectionFramework.setImplementations.treeSetDemo;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Demo2Comparator {
    public static void main(String[] args) {
        Emp employee1 = new Emp(11, "Vaibhav", 89000);
        Emp employee2 = new Emp(2, "Lalit", 54000);
        Emp employee3 = new Emp(32, "Shirish", 100000);
        Emp employee4 = new Emp(4, "Heena", 234000);

        class EmployeeSortId implements Comparator<Emp> {
            @Override
            public int compare(Emp emp1, Emp emp2) {
                return emp1.getId() - emp2.getId();
            }
        }

        EmployeeSortId ref = new EmployeeSortId();

        Set<Emp> employees = new TreeSet<>(ref);
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);

        for (Emp employee : employees) {
            System.out.println(employee);
        }
    }
}

