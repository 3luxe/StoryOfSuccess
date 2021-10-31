package hr.service;

import hr.model.Developer;
import hr.model.Employee;

import java.util.Random;

public class DeveloperFinanceService implements FinanceService {
    @Override
    public double calculate(Employee e) {
        Developer d = (Developer) e;
        return d.getSalary() + d.getFixedBugs() * 0.0 * (new Random().nextBoolean() ? 2 : 0);
    }
}
