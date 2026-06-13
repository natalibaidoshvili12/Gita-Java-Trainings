package december13.hw.frst;

public class FullTime extends Employee {

    private double salary;

    public FullTime(String name, double salary) {
        super.name = name;
        this.salary = salary;
    }

    public FullTime() {

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double pay() {
        return salary;
    }
}
