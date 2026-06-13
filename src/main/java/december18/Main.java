package december18;

import december18.cw.Car;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
//        PersonAccount personAccount = new PersonAccount("GE13BG123123313123132", BigDecimal.valueOf(1500), "BOG", "GEL");
//        PersonAccount.PlasticCard plasticCard = new PersonAccount.PlasticCard("1231456689852365", "1234");
//        plasticCard.printInfo();
//        print();

//        TestInterface i = new TestInterface() {
//            @Override
//            public double sum(double a, double b) {
//                return a + b;
//            }
//        };
//        System.out.println(i.sum(5, 6));
//
//        TestInterface i2 = new TestInterface() {
//            @Override
//            public double sum(double a, double b) {
//                return 2 * (a + b);
//            }
//        };
//        System.out.println(i2.sum(5, 6));

//        University university = new University("Tbilisi Free University", Status.PRIVATE, 15);
//        University.Student student = university.new Student("Natali", "Baidoshvili", 25, "123456", 97.5, 3);
//        university.printInfo();
//        student.printInfo();
        Car[] cars = new Car[5];
        Car.Engine[] engines = new Car.Engine[cars.length];
        Random random = new Random();
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car("Company" + i, "Model" + i, "PlateNumber" + i);
            engines[i] = cars[i].new Engine("FuelType" + i, i, random.nextInt(1, 500) * 1000 + 250);
        }
        Car car = cars[0];
        Car.Engine engine = engines[0];
        for (int i = 0; i < cars.length; i++) {
            if (engine.getKmCanPass() < engines[i].getKmCanPass()) {
                car = cars[i];
                engine = engines[i];
            }
        }

        car.printInfo();
        engine.printInfo();

    }

    public static void print() {
        class ClassA {
            public void printInfo() {
                System.out.println("Class info");
            }
        }

        ClassA clazz = new ClassA();
        clazz.printInfo();
    }

}
