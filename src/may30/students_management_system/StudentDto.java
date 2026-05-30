package may30.students_management_system;

public class StudentDto {

    private Double grade;

    private String name;

    public StudentDto() {
    }

    public StudentDto(Double grade, String name) {
        this.grade = grade;
        this.name = name;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
