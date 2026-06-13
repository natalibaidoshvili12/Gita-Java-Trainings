package december11;

public class Bird extends Animal {

    public void fly() {
        System.out.println("Bird " + name + " is flying");
    }

    @Override
    public void getName() {
        System.out.println("Bird " + name);
    }
}
