package november8;

public class Person {

    String name;
    String lastName;
    int age;

    Person() {

    }

    Person(String name, int age) {

    }

    Person(String name1, String lastName1, int age1) {
        name = name1;
        lastName = lastName1;
        age = age1;
    }


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
