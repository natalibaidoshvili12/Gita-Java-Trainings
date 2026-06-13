package december11;

public class Mammal extends Animal {

    public static final int MAX_HEALTH = 50;

    public void eat() {
        System.out.println("Mammal " + name + " is eating");
    }

    @Override
    public void getName() {
        System.out.println("Mammal " + name);
    }
}
