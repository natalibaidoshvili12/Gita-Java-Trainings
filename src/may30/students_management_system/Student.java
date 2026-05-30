package may30.students_management_system;

public class Student {

    private Long id;

    private String name;

    private Double grade;

    public Student() {
    }

    public Student(Double grade, Long id, String name) {
        this.grade = grade;
        this.id = id;
        this.name = name;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade=" + grade +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
