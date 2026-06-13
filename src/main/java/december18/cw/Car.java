package december18.cw;

public class Car {

    private String company;
    private String model;
    private String plateNumber;

    public class Engine {
        private String fuelType;
        private int cylinderNumber;
        private double kmCanPass;

        public Engine() {
        }

        public Engine(String fuelType, int cylinderNumber, double kmCanPass) {
            this.fuelType = fuelType;
            this.cylinderNumber = cylinderNumber;
            this.kmCanPass = kmCanPass;
        }

        public String getFuelType() {
            return fuelType;
        }

        public void setFuelType(String fuelType) {
            this.fuelType = fuelType;
        }

        public int getCylinderNumber() {
            return cylinderNumber;
        }

        public void setCylinderNumber(int cylinderNumber) {
            this.cylinderNumber = cylinderNumber;
        }

        public double getKmCanPass() {
            return kmCanPass;
        }

        public void setKmCanPass(double kmCanPass) {
            this.kmCanPass = kmCanPass;
        }

        public void printInfo() {
            System.out.println("Fuel Type: " + fuelType);
            System.out.println("Cylinder Number: " + cylinderNumber);
            System.out.println("KM Can Pass: " + kmCanPass);
        }
    }

    public Car() {
    }

    public Car(String company, String model, String plateNumber) {
        this.company = company;
        this.model = model;
        this.plateNumber = plateNumber;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public void printInfo() {
        System.out.println("Company: " + company);
        System.out.println("Model: " + model);
        System.out.println("PlateNumber: " + plateNumber);
    }
}
