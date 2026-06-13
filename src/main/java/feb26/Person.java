package feb26;

import java.io.Serializable;

public class Person implements Serializable {

    private String firstName;
    private String lastName;
    private transient String personalNumber;

    public Person(String firstName, String lastName, String personalNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.personalNumber = personalNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
