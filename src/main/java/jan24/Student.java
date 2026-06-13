package jan24;

public class Student {

    private String firstname;
    private String lastname;
    private String idNum;
    private double averageGrade;

    public Student() {
    }

    public Student(String firstname, String lastname, String idNum, double averageGrade) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.idNum = idNum;
        this.averageGrade = averageGrade;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
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
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", idNum='" + idNum + '\'' +
                ", averageGrade=" + averageGrade +
                '}';
    }
}
