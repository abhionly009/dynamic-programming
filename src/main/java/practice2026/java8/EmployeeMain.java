package main.java.practice2026.java8;

import java.util.List;

public class EmployeeMain {

    public static void main(String[] args) {

        EmployeeData employeeData = new EmployeeData();

        List<Employee> employees = employeeData.getEmployees();

        employees.stream().filter(employee -> employee.getAge()>30)
                .forEach(System.out::println);

    }
}
