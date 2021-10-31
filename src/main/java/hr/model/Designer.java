package hr.model;

public class Designer extends Employee {
    private Gender gender;
    private double rate;
    private int workedDays;

    public Designer(long id, String name, int age, double salary, Gender gender, double rate, int workedDays) {
        super(id,  name,  age, gender, salary);
        this.rate = rate;
        this.workedDays = workedDays;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public void setWorkedDays(int workedDays) {
        this.workedDays = workedDays;
    }

    public int getWorkedDays() {
        return workedDays;
    }
}