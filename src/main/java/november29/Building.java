package november29;

public class Building {

    private int floorNumber;

    private int doorNumber;

    private int windowNumber;

    public Building() {
    }

    public Building(int floorNumber, int doorNumber, int windowNumber) {
        this.floorNumber = floorNumber;
        this.doorNumber = doorNumber;
        this.windowNumber = windowNumber;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(int doorNumber) {
        this.doorNumber = doorNumber;
    }

    public int getWindowNumber() {
        return windowNumber;
    }

    public void setWindowNumber(int windowNumber) {
        this.windowNumber = windowNumber;
    }

    @Override
    public String toString() {
        return "Building{" +
                "floorNumber=" + floorNumber +
                ", doorNumber=" + doorNumber +
                ", windowNumber=" + windowNumber +
                '}';
    }
}
