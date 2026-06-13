package november22;

public class Main {

    public static void main(String[] args) {
        // 1
//        Student[] students = new Student[10];
//        Random random = new Random();
//        for (int i = 0; i < students.length; i++) {
//            students[i] = new Student();
//            students[i].setName("Name " + i);
//            students[i].setAge(15 + i);
//            students[i].setCourse(random.nextInt(5));
//            students[i].setAverageGrade(random.nextDouble(100));
//        }
//
//        double maxAverageGrade = 0;
//        Student student = null;
//        for (int i = 0; i < students.length; i++) {
//            if (students[i].getAverageGrade() > maxAverageGrade) {
//                maxAverageGrade = students[i].getAverageGrade();
//                student = students[i];
//            }
//        }
//        if (student != null) {
//            System.out.println("Name: " + student.getName());
//            System.out.println("Age: " + student.getAge());
//            System.out.println("Course: " + student.getCourse());
//            System.out.println("AverageGrade: " + student.getAverageGrade());
//        } else {
//            System.out.println("No student found");
//        }

        // 2
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        Subject[] subjects = new Subject[n];
//        for (int i = 0; i < subjects.length; i++) {
//            String name = scanner.next();
//            int studentsNumber = scanner.nextInt();
//            int succeedStudentsNumber = scanner.nextInt();
//            subjects[i] = new Subject(name, studentsNumber, succeedStudentsNumber);
//        }
//
//        double maxFailedStudents = 0;
//        Subject subject = null;
//        for (Subject s : subjects) {
//            if (s.failedStudentsPercentage() > maxFailedStudents) {
//                maxFailedStudents = s.failedStudentsPercentage();
//                subject = s;
//            }
//        }
//        if (subject != null) {
//            System.out.println(subject.toString());
//        } else {
//            System.out.println("No subject found");
//        }

        // 3
//        Train[] trains = new Train[10];
//        Random random = new Random();
//        for (int i = 0; i < trains.length; i++) {
//            trains[i] = new Train();
//            int wagonNumber = random.nextInt(1, 10);
//            int passengerNumber = random.nextInt(1, 50);
//            double ticketPrice = random.nextDouble(1, 30);
//            int soldTicketNumber = random.nextInt(wagonNumber * passengerNumber);
//            trains[i].setFieldValues(wagonNumber, passengerNumber, ticketPrice, soldTicketNumber);
//        }
//
//        double maxProfit = 0;
//        Train train = null;
//        for (int i = 0; i < trains.length; i++) {
//            if (trains[i].getProfit() > maxProfit) {
//                maxProfit = trains[i].getProfit();
//                train = trains[i];
//            }
//        }
//        if (train != null) {
//            train.printFieldValues();
//        } else {
//            System.out.println("No train found");
//        }

        System.out.println(MyMath.max(3, 4));
        System.out.println(MyMath.min(3, 4));
        System.out.println(MyMath.product(3, 4));
        System.out.println(MyMath.sum(3, 4));
        System.out.println(MyMath.square(3));
        System.out.println(MyMath.power(3, 4));
        System.out.println(MyMath.log(2, 16));
        System.out.println(MyMath.abs(2));
        System.out.println(MyMath.abs(-2));


    }

}
