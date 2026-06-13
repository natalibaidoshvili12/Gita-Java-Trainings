package november27;

public class Student extends Person {

    private String course;

    private String major;

    private double averageGrade;

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", age=" + getAge() + '\'' +
                ", course='" + course + '\'' +
                ", major='" + major + '\'' +
                ", averageGrade=" + averageGrade +
                '}';
    }
}
