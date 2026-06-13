package january17;

public class CityTour extends AbstractTour {


    public CityTour(String destination, int days, double pricePerDay) {
        super(destination, days, pricePerDay);
    }

    @Override
    public double calculateTotalPrice() {
        return totalPrice();
    }

    @Override
    public String getDescription() {
        return "City tour: " + "\n"
                + "Destination: " + destination + "\n"
                + "Days: " + days + "\n"
                + "Price per day: " + pricePerDay + "\n"
                + "Total price: " + totalPrice();
    }
}
