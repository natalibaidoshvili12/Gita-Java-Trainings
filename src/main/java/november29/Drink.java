package november29;

public class Drink {
    private String name;
    private double price;
    private String company;
    private String country;

    public Drink(String name, double price, String company, String country){
        this.name = name;
        this.price = price;
        this.company = company;
        this.country = country;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
