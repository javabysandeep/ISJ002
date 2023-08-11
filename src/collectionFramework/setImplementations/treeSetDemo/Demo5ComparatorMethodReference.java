package collectionFramework.setImplementations.treeSetDemo;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Demo5ComparatorMethodReference {
    public static void main(String[] args) {
        Emp employee1 = new Emp(11, "Vaibhav", 89000);
        Emp employee2 = new Emp(2, "Lalit", 54000);
        Emp employee3 = new Emp(32, "Shirish", 100000);
        Emp employee4 = new Emp(4, "Heena", 234000);

        Comparator<Emp> comparator = Comparator.comparingInt(Emp::getId);
        Set<Emp> employees = new TreeSet<>(comparator);
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);

        for (Emp employee : employees) {
            System.out.println(employee);
        }
    }
}

