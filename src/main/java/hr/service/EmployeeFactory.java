package hr.service;

import hr.model.*;

import java.util.Random;

public class EmployeeFactory {
    public Employee[] generateEmployees(int size) {
        Employee[] employees = new Employee[size];
        for (int i = 0; i < size; i++) {
            Random r = new Random();
            double d = r.nextDouble();
            Employee e;
            if (d <= 0.33) {
                e = new Designer((long) i, randomString(), 18 + r.nextInt(54),
                        Math.floor(100 + 1000 * r.nextDouble()),
                        r.nextBoolean() ? Gender.MAN : Gender.WOMAN, r.nextDouble() * 10, r.nextInt());
            } else if (d > 0.33 && d <= 0.66) {
                e = new Developer((long) i, randomString(), 18 + r.nextInt(54),
                        Math.floor(100 + 1000 * r.nextDouble()),
                        r.nextBoolean() ? Gender.MAN : Gender.WOMAN, r.nextInt());
            } else {
                e = new Manager((long) i, randomString(), 18 + r.nextInt(54),
                        Math.floor(100 + 1000 * r.nextDouble()),
                        r.nextBoolean() ? Gender.MAN : Gender.WOMAN);
            }
            employees[i] = e;
        }
        return employees;
    }

    public String randomString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 8;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)(random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        return buffer.toString();
    }
}
