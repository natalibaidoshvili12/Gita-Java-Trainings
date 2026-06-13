package november22;

public class Subject {

    private String subjectName;
    private int studentsNumber;
    private int succeedStudentsNumber;

    public Subject() {
    }

    public Subject(String subjectName, int studentsNumber, int succeedStudentsNumber) {
        this.subjectName = subjectName;
        this.studentsNumber = studentsNumber;
        this.succeedStudentsNumber = succeedStudentsNumber;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getStudentsNumber() {
        return studentsNumber;
    }

    public void setStudentsNumber(int studentsNumber) {
        this.studentsNumber = studentsNumber;
    }

    public int getSucceedStudentsNumber() {
        return succeedStudentsNumber;
    }

    public void setSucceedStudentsNumber(int succeedStudentsNumber) {
        this.succeedStudentsNumber = succeedStudentsNumber;
    }

    public double failedStudentsPercentage() {
        return 100 - ((double) succeedStudentsNumber / studentsNumber * 100);
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectName='" + subjectName + '\'' +
                ", studentsNumber=" + studentsNumber +
                ", succeedStudentsNumber=" + succeedStudentsNumber +
                '}';
    }
}
