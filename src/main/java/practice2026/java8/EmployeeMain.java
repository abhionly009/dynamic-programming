package main.java.practice2026.java8;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeMain {

    public static void main(String[] args) {

        EmployeeData employeeData = new EmployeeData();

        List<Employee> employees = employeeData.getEmployees();

       //  Find employees older than 30.
        employees.stream().filter(employee -> employee.getAge()>30)
                .forEach(System.out::println);


        // Print all employees.

        employees.stream().forEach(System.out::println);


        // Find employees whose salary is greater than 80,000.

        employees.stream().filter(employee -> employee.getSalary()>80000)
                .map(Employee::getName).forEach(System.out::println);


        // Print only employee names.

         employees.stream().map(Employee::getName).forEach(System.out::println);


        // Count employees in the IT department.

        long it = employees.stream().filter(employee -> employee.getDepartment().equals("IT"))
                .count();

        System.out.println("Total employee who works in IT  "+  it);



        // Print all unique department names.

        employees.stream().map(Employee::getDepartment)
                .distinct().forEach(System.out::println);


//        Convert employee names into an array.


        Object[] array = employees.stream().map(Employee::getName).toArray();

        for (Object obj :array){
            System.out.println(obj);
        }


        // Print the names of employees from Bangalore.

        employees.stream().filter(employee -> employee.getCity().equals("Bangalore"))
                .map(Employee::getName)
                .forEach(System.out::println);




        // Level 2 stream operation

        // Sort employees by salary in ascending order.

        employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary, Comparator.naturalOrder()))
                .map(Employee::getSalary)
                .forEach(System.out::println);


        // Sort employees by salary in descending order.

        employees.stream().sorted(Comparator.comparing(Employee::getSalary, Comparator.reverseOrder()))
                .map(Employee::getSalary)
                .forEach(System.out::println);


        // Find the highest-paid employee.

    employees.stream().max(Comparator.comparing(Employee::getSalary))
            .map(employee -> employee.getName())
            .stream().forEach(System.out::println);


        // Find the lowest-paid employee.

        employees.stream().min(Comparator.comparing(Employee::getSalary))
                .stream().map(Employee::getName)
                .forEach(System.out::println);


        // Find the first employee whose salary exceeds 90,000.

        Optional<Employee> first = employees.stream().filter(employee -> employee.getSalary() > 90000).findFirst();

        System.out.println(first);



        // Get any employee from the IT department.

        employees.stream().filter(employee -> employee.getDepartment().equals("IT"))
                .findAny().stream().forEach(System.out::println);


        // Print the top 3 highest-paid employees.

        employees.stream().sorted(Comparator.comparing(Employee::getSalary, Comparator.reverseOrder()))
                .limit(3).map(Employee::getSalary).forEach(System.out::println);


      // Skip the first 5 employees and print the rest.

        employees.stream().skip(5).forEach(System.out::println);

    }
}
