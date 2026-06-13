package november27;

public class Main {

    public static void main(String[] args) {
//        Person p = new Person("Natali", "Baidoshvili", 24);
//        Student s = new Student();
//        s.setName("Natali");
//        s.setLastName("Baidoshvili");
//        s.setAge(24);
//        s.setCourse("Software Engineering");
//        s.setMajor("Java");
//        s.setAverageGrade(98);
//        Lecturer l = new Lecturer();
//        l.setName("Natali");
//        l.setLastName("Baidoshvili");
//        l.setAge(24);
//        l.setStudentNumber(15);
//        l.setSubjectName("Java");
//        System.out.println("Student: " + s.toString());
//        System.out.println("Person: " + p.toString());
//        System.out.println("Lecturer: " + l.toString());
//
//        Person p1 = new Lecturer("Name", "Lastname", 35, 1500, "Software Technologies", "OOP", 5);
//        Lecturer l1 = (Lecturer) p1;

        Circle circle = new Circle(5, 5, 25);
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());
        System.out.println(circle);
        Object o = new Object();
    }

}
