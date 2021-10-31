package hr.model;

public class Developer extends Employee{
    private int fixedBugs;

    public Developer(long id, String name, int age, double salary, Gender gender, int fixedBugs) {
        super( id,  name,  age, gender, salary);
        this.fixedBugs = fixedBugs;
    }

    public void setFixedBugs(int fixedBugs) {
        this.fixedBugs = fixedBugs;
    }

    public int getFixedBugs() {
        return fixedBugs;
    }
}