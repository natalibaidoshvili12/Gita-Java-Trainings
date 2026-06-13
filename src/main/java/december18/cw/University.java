package december18.cw;

public class University {

    private String name;

    private Status status;

    private int facultyNumber;

    public class Student {
        private String firstName;
        private String lastName;
        private int age;
        private String idNumber;
        private double averageGrade;
        private int course;

        public Student() {
        }

        public Student(String firstName, String lastName, int age, String idNumber, double averageGrade, int course) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.idNumber = idNumber;
            this.averageGrade = averageGrade;
            this.course = course;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getIdNumber() {
            return idNumber;
        }

        public void setIdNumber(String idNumber) {
            this.idNumber = idNumber;
        }

        public double getAverageGrade() {
            return averageGrade;
        }

        public void setAverageGrade(double averageGrade) {
            this.averageGrade = averageGrade;
        }

        public int getCourse() {
            return course;
        }

        public void setCourse(int course) {
            this.course = course;
        }

        public void printInfo() {
            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);
            System.out.println("Age: " + age);
            System.out.println("ID: " + idNumber);
            System.out.println("Average: " + averageGrade);
            System.out.println("Course: " + course);
        }
    }

    public University() {
    }

    public University(String name, Status status, int facultyNumber) {
        this.name = name;
        this.status = status;
        this.facultyNumber = facultyNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getFacultyNumber() {
        return facultyNumber;
    }

    public void setFacultyNumber(int facultyNumber) {
        this.facultyNumber = facultyNumber;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Status: " + status);
        System.out.println("Faculty Number: " + facultyNumber);
    }
}
