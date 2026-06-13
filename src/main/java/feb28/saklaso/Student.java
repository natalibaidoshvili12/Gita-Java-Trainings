package feb28.saklaso;

public class Student {

    private String name;

    private int age;

    private double gpa;

    private String activeStatus;

    public Student() {
    }

    public Student(String name, int age, double gpa, String activeStatus) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.activeStatus = activeStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus;
    }
}
