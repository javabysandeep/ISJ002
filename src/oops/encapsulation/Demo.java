package oops.encapsulation;

public class Demo {
    public static void main(String[] args) {
        Employee employee = new Employee();
      /*  employee.employeeId = 101;
        employee.employeeName = "abc";
        employee.age = -100;*/
        employee.setEmployeeId(101);
        employee.setEmployeeName("Sachin");
        employee.setAge(90);

        System.out.println(employee.getEmployeeId());
        System.out.println(employee.getEmployeeName());
        System.out.println(employee.getAge());
    }
}
