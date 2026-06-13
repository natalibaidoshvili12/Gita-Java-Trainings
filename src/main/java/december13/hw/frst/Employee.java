package december13.hw.frst;

public abstract class Employee {

    protected String name;

    public abstract double pay();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
