package feb28.saklaso;

import java.util.List;

public class Course {

    private String courseName;
    private String instructor;
    private List<Student> studentList;

    public Course() {
    }

    public Course(String courseName, String instructor, List<Student> studentList) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.studentList = studentList;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", instructor='" + instructor + '\'' +
                ", studentList=" + studentList +
                '}';
    }
}
