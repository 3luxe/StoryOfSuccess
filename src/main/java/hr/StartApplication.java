package hr;

import hr.service.EmployeeFactory;
import hr.service.PersistenceService;

public class StartApplication {
    EmployeeFactory ef = new EmployeeFactory();
    PersistenceService ps = new PersistenceService(ef.generateEmployees(100));

    public static void main(String[] args) {
        StartApplication application = new StartApplication();
        application.ps.printEmployees();
    }
}
