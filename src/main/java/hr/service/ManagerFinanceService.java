package hr.service;

import hr.model.Employee;
import hr.model.Manager;

public class ManagerFinanceService implements FinanceService{
    @Override
    public double calculate(Employee e) {
        Manager m = (Manager) e;
        return m.getSalary();
    }
}
