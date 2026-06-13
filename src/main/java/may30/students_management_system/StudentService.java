package may30.students_management_system;

import java.util.List;

public class StudentService {

    private Long counter = 0L;

    public boolean addStudent(StudentDto student) {
        Student student1 = new Student(student.getGrade(), ++counter, student.getName());
        return StudentsList.addStudent(student1);
    }

    public Student removeStudent(Long id) {
        Student student = StudentsList.findStudent(id);
        return StudentsList.removeStudent(student);
    }

    public Student getStudent(Long id) {
        return StudentsList.findStudent(id);
    }

    public List<Student> getStudents() {
        return StudentsList.students;
    }

}
