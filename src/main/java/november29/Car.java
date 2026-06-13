package november29;

public class Car extends Vehicle{
    private int passengerNumber;
    private int maxSpeed;

    public Car(String tvirtmweoba, int mass, int passengerNumber,int maxSpeed) {
        super(tvirtmweoba, mass);
        this.passengerNumber = passengerNumber;
        this.maxSpeed = maxSpeed;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    void getinfo1(){
        super.getinfo();
        System.out.println(maxSpeed + " " + passengerNumber );
    }

}
