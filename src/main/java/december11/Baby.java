package december11;

public class Baby extends Person {

    public Baby(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    public Baby() {
    }

    @Override
    public void speak() {
        System.out.println("Babies cannot speak");
    }

    public void cry() {
        System.out.println("Baby " + getFirstName() + " is crying");
    }
}
