package hr.model;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
    private long id;
    private String name;
    private int age;
    private Gender gender;
    private double salary;

    public Employee(long id, String name, int age, Gender gender, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }


    @Override
    public int compareTo(Employee employee1) {
        int n = this.getName().toLowerCase().compareTo(employee1.getName().toLowerCase());
        int s = Double.compare(this.getSalary(), employee1.getSalary());
        return n != 0 ? n : s;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null)
            return false;
        if (getClass() != o.getClass())
            return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.getId()) &&
                Objects.equals(name, employee.getName()) &&
                Objects.equals(gender, employee.getGender());
    }
}
