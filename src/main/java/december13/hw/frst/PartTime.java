package december13.hw.frst;

public class PartTime extends Employee {

    private int hourCount;

    private double salaryPerHour;

    public PartTime(String name, int hourCount, double salaryPerHour) {
        super.name = name;
        this.hourCount = hourCount;
        this.salaryPerHour = salaryPerHour;
    }

    public PartTime() {

    }

    public int getHourCount() {
        return hourCount;
    }

    public void setHourCount(int hourCount) {
        this.hourCount = hourCount;
    }

    public double getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(double salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    @Override
    public double pay() {
        return hourCount * salaryPerHour;
    }
}
