package november29;

public class House extends Building {

    private int roomNumber;

    private double area;

    public House() {

    }

    public House(int floorNumber, int doorNumber, int windowNumber, int roomNumber, double area) {
        super(floorNumber, doorNumber, windowNumber);
        this.roomNumber = roomNumber;
        this.area = area;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "House{" +
                "floorNumber=" + getFloorNumber() +
                ", doorNumber=" + getDoorNumber() +
                ", windowNumber=" + getWindowNumber() +
                ", roomNumber=" + roomNumber +
                ", area=" + area +
                '}';
    }
}
