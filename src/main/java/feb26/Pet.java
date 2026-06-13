package feb26;

import java.io.Serializable;

public class Pet implements Serializable {

    private int age;
    private String name;
    private Owner owner;
    private transient String petId;

    public Pet(int age, String name, Owner owner, String petId) {
        this.age = age;
        this.name = name;
        this.owner = owner;
        this.petId = petId;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Owner getOwner() {
        return owner;
    }
}

