package november15;

public class Car {

    String brand;
    String model;
    long manufacturerDate;
    String carNumber;

    public Car(String brand1, String model1, long manufacturerDate1, String carNumber1) {
        brand = brand1;
        model = model1;
        manufacturerDate = manufacturerDate1;
        carNumber = carNumber1;
    }

    public Car() {

    }

    void printInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Manufacturer Date: " + manufacturerDate);
        System.out.println("Car Number: " + carNumber);
    }

}
