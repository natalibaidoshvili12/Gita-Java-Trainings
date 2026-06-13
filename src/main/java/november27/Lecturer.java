package november27;

public class Lecturer extends Staff {

    private String subjectName;

    private int studentNumber;

    public Lecturer() {
        this("", "", 0, 0, "", ", ", 0);
//        super("", "", 0, 0, "");
    }

    public Lecturer(String name, String lastName, int age, int salary, String department, String subjectName, int studentNumber) {
        super(name, lastName, age, salary, department);
        this.subjectName = subjectName;
        this.studentNumber = studentNumber;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return super.getName();
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "name='" + getName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", age=" + getAge() + '\'' +
                ", subjectName='" + subjectName + '\'' +
                ", studentNumber=" + studentNumber +
                '}';
    }
}
