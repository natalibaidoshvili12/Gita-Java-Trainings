package november29;

public class Alcohol extends Drink {
    private String type;
    private int contigent;

    public Alcohol(String type, int contigent, String name, double price, String company, String country ){
        super( name, price, company, country);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getContigent() {
        return contigent;
    }

    public void setContigent(int contigent) {
        this.contigent = contigent;
    }
}
