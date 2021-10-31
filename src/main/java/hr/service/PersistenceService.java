package hr.service;

import hr.model.Employee;
import java.util.Comparator;

import static java.util.Arrays.*;

public class PersistenceService {

    public PersistenceService() {
    }

    public PersistenceService(Employee[] employees) {
        array = employees;
    }

    private Employee[] array = new Employee[0];

    public void printEmployees() {
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i].toString());
    }

    public double calculateSalaryAndBonus() {
        return 0.0;
    }

    public Employee getById(long id) {
        for (int i = 0; i < array.length; i++) {
            Employee e = array[i];
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    public Employee[] getByName(String name) {
        int c = 0;
        for (int i = 0; i < array.length; i++) {
            Employee e = array[i];
            if (e.getName().equals(name)) {
                c = c + 1;
            }
        }
        Employee[] employees = new Employee[c];
        for (int i = 0; i < array.length; i++) {
            Employee e = array[i];
            if (e.getName().equals(name)) {
                employees[c] = e;
                c = c - 1;
            }
        }
        return employees;
    }

    public Comparator<Employee> getByNameComparator() {
        return Comparator.comparing((Employee employee) -> employee.getName());
    }

    public Comparator<Employee> getByNameBySalaryComparator() {
        return Comparator
                .comparing((Employee employee) -> employee.getName())
                .thenComparing((Employee employee) -> employee.getSalary());
    }

    public Employee[] sortByName() {
        sort(array, this.getByNameComparator());
        return array;
    }

    public Employee[] sortByNameAndSalary() {
        sort(array, this.getByNameBySalaryComparator());
        return array;
    }

    public Employee edit(Employee employee) {
        long id = employee.getId();
        for(int i = 0; i < array.length; i++) {
            if (array[i].getId() == id) {
                Employee old = array[i];
                array[i] = employee;
                return old;
            } else {
                return null;
            }
        }
        return null;
    }

    public Employee remove(long id) {
        if(array.length - 1 < 0)
            throw new IllegalArgumentException();
        Employee[] newArray = new Employee[array.length - 1];
        Employee employee;
        for(int i = 0; i < array.length; i++) {
            if (array[i].getId() == id) {
                employee = array[i];
                System.arraycopy(array, 0, newArray, 0, i - 2);
                System.arraycopy(array, i + 1, newArray, i, array.length - 2);
                array = newArray;
                return employee;
            } else {
                return null;
            }
        }
        return null;
    }

    public void add(Employee employee) {
        long id = employee.getId();
        for(int i = 0; i < array.length; i++) {
            if (array[i].getId() == id) {
                throw new IllegalArgumentException();
            }
        }
        int newLength = array.length + 1;
        Employee[] newArray = new Employee[newLength];
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[newLength - 1] = employee;
        array = newArray;
    }
}
