package doubts;

public class Employee {
    int id= 100;
    String name = "abc";

    Employee(){
        id = 200;
        name = "xyz";
    }
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println(employee.id);
        System.out.println(employee.name);
    }
}
