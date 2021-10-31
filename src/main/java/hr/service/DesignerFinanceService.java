package hr.service;

import hr.model.Designer;
import hr.model.Employee;

public class DesignerFinanceService implements FinanceService {
    @Override
    public double calculate(Employee e) {
        Designer d = (Designer) e;
        return d.getSalary() + d.getRate() * d.getWorkedDays();
    }
}
