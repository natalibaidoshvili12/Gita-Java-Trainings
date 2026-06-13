package november27;

public class Staff extends Person {

    private int salary;

    private String department;

//    public Staff() {
//
//    }

    public Staff(String firstName, String lastName, int age, int salary, String department) {
        super(firstName, lastName, age);
        this.salary = salary;
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
