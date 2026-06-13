package november6;

public class Person {

    String name;
    String lastName;
    int age;

    void eat() {
        if (age < 5) return;
        System.out.println(name + " is eating");
    }

    void sleep() {
        System.out.println(name + " is sleeping");
    }

    void walk() {
        System.out.println(name + " is walking");
    }

    int nameLength() {
        return name.length();
    }

}
