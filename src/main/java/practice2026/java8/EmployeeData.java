package main.java.practice2026.java8;

import java.util.Arrays;
import java.util.List;

public class EmployeeData {

    public List<Employee> getEmployees(){
        return Arrays.asList(
                new Employee(1, "Amit", "IT", "Male", 28, 75000, "Bangalore",
                        Arrays.asList("Java", "Spring Boot", "AWS")),

                new Employee(2, "Priya", "HR", "Female", 32, 60000, "Mumbai",
                        Arrays.asList("Communication", "Recruitment")),

                new Employee(3, "Rahul", "IT", "Male", 35, 95000, "Bangalore",
                        Arrays.asList("Java", "Kafka", "Docker")),

                new Employee(4, "Sneha", "Finance", "Female", 29, 70000, "Pune",
                        Arrays.asList("Excel", "SQL")),

                new Employee(5, "Vikram", "IT", "Male", 40, 120000, "Hyderabad",
                        Arrays.asList("Java", "AWS", "Kubernetes")),

                new Employee(6, "Neha", "HR", "Female", 26, 50000, "Mumbai",
                        Arrays.asList("Recruitment", "Excel")),

                new Employee(7, "Arjun", "Finance", "Male", 31, 85000, "Pune",
                        Arrays.asList("SQL", "Python")),

                new Employee(8, "Pooja", "IT", "Female", 30, 90000, "Bangalore",
                        Arrays.asList("Java", "React", "Spring Boot")),

                new Employee(9, "Karan", "Sales", "Male", 27, 55000, "Delhi",
                        Arrays.asList("Negotiation", "Communication")),

                new Employee(10, "Ananya", "Sales", "Female", 34, 80000, "Delhi",
                        Arrays.asList("Communication", "Excel")),

                new Employee(11, "Rohit", "IT", "Male", 24, 45000, "Hyderabad",
                        Arrays.asList("Java", "SQL")),

                new Employee(12, "Meera", "Finance", "Female", 38, 110000, "Pune",
                        Arrays.asList("SQL", "Python", "Excel"))
        );
    }
}
