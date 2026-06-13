package december13;

public class Baby extends Person {



    public Baby() {
    }

    @Override
    public void speak() {
        System.out.println("Babies cannot speak");
    }

    public void cry() {
        System.out.println("Baby " + getName() + " is crying");
    }
}
