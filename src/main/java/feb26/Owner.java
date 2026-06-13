package feb26;

public class Owner extends Person {

    private int petNumber;

    public Owner(String firstName, String lastName, String personalNumber, int petNumber) {
        super(firstName, lastName, personalNumber);
        this.petNumber = petNumber;
    }

    public int getPetNumber() {
        return petNumber;
    }
}

