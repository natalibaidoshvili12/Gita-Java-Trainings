package may30;

import java.util.ArrayList;
import java.util.List;

public class StudentsList {

    public static final List<Student> students = new ArrayList<Student>();

    public static Student findStudent(Long id) {
        return students.stream().filter(e -> e.getId().equals(id)).findFirst().orElse(null);
    }

    public static Student removeStudent(Student student) {
        students.remove(student);
        return student;
    }

    public static boolean addStudent(Student student) {
        return students.add(student);
    }

}
