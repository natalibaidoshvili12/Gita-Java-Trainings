package november29;

public class Vehicle {
    private String tvirtmweoba;
    private int mass;

    public String getTvirtmweoba() {
        return tvirtmweoba;
    }

    public void setTvirtmweoba(String tvirtmweoba) {
        this.tvirtmweoba = tvirtmweoba;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public Vehicle(String tvirtmweoba, int mass) {
        this.tvirtmweoba = tvirtmweoba;
        this.mass = mass;
    }
    void getinfo(){
        System.out.println(tvirtmweoba +" " + mass);
    }
}
