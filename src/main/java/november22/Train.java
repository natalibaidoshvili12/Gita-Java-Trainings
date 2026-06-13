package november22;

public class Train {

    private int wagonNumber;
    private int passengerNumber;
    public double ticketPrice;
    public int soldTicketNumber;

    public void setFieldValues(int wagonNumber, int passengerNumber, double ticketPrice, int soldTicketNumber) {
        this.wagonNumber = wagonNumber;
        this.passengerNumber = passengerNumber;
        this.ticketPrice = ticketPrice;
        this.soldTicketNumber = soldTicketNumber;
    }

    public void printFieldValues() {
        System.out.println("Wagon Number " + wagonNumber);
        System.out.println("Passenger Number " + passengerNumber);
        System.out.println("Ticket Price " + ticketPrice);
        System.out.println("Sold Ticket Number " + soldTicketNumber);
    }

    public double getProfit() {
        return soldTicketNumber * ticketPrice;
    }

    @Override
    public String toString() {
        return "Train{" +
                "wagonNumber=" + wagonNumber +
                ", passengerNumber=" + passengerNumber +
                ", ticketPrice=" + ticketPrice +
                ", soldTicketNumber=" + soldTicketNumber +
                '}';
    }
}
