package january17;

public class BeachTour extends AbstractTour {

    private double resortFee;

    public BeachTour(String destination, int days, double pricePerDay, double resortFee) {
        super(destination, days, pricePerDay);
        this.resortFee = resortFee;
    }

    @Override
    public double calculateTotalPrice() {
        return resortFee + totalPrice();
    }

    @Override
    public String getDescription() {
        return "Beach Tour: " + "\n"
                + "Destination: " + destination + "\n"
                + "Days: " + days + "\n"
                + "Price per day: " + pricePerDay + "\n"
                + "Total price: " + calculateTotalPrice();
    }
}
