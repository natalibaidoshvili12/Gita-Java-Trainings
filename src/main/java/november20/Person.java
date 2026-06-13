package november20;

public class Person {

    String name; // default
    public String lastName;
    private final int age; // instance variables
    public static int personNumber = 0;


    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        if (age >= 0) {
            this.age = age;
        } else {
            this.age = 0;
        }
        personNumber++;
    }

    public Person(String name, String lastName) {
        this.age = 0;
        personNumber++;
    }

    public int getAge() {
        return age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static int multiplyPersonNumber(int number) {
        return number * personNumber;
    }

}
