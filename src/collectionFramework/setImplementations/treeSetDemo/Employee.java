package collectionFramework.setImplementations.treeSetDemo;

import lombok.*;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private int salary;

    @Override
    public int compareTo(Employee employee) {
        // return this.id - employee.id;
        //return employee.salary - this.salary;
        return employee.name.compareTo(this.name);
    }
}
