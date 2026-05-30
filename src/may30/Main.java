package may30;

import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        StudentDto student1 = new StudentDto(97.3, "Natali Baidoshvili");
        StudentDto student2 = new StudentDto(77.3, "A A");
        StudentDto student3 = new StudentDto(87.3, "A B");
        StudentDto student4 = new StudentDto(99.3, "B B");
        StudentDto student5 = new StudentDto(100.0, "A N");
        StudentService studentService = new StudentService();
        studentService.addStudent(student1);
        studentService.addStudent(student3);
        studentService.addStudent(student2);
        studentService.addStudent(student5);
        studentService.addStudent(student4);

        System.out.println("All students: " + studentService.getStudents());

        System.out.println(studentService.getStudent(2L));

        System.out.println(studentService.removeStudent(3L));
        System.out.println("All students: " + studentService.getStudents());

        List<Student> studentList = studentService.getStudents().stream()
                .sorted(Comparator.comparingDouble(Student::getGrade))
                .toList();

        System.out.println("Sorted students: " + studentList);

    }

}
