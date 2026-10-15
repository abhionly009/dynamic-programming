package main.java.practice2026.java8;

import java.util.List;

public class Employee {
    private int id;
    private String name;
    private String department;
    private String gender;
    private int age;
    private double salary;
    private String city;
    private List<String> skills;

    public Employee(int id, String name, String department,
                    String gender, int age, double salary,
                    String city, List<String> skills) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
        this.city = city;
        this.skills = skills;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public String getGender() { return gender; }
    public int getAge() { return age; }
    public double getSalary() { return salary; }
    public String getCity() { return city; }
    public List<String> getSkills() { return skills; }

    @Override
    public String toString() {
        return "Employee{id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", city='" + city + '\'' +
                ", skills=" + skills + '}';
    }
}