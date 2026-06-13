package november8;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Name1";

        Person p2 = new Person("Name2", "Lastname2", 23);
        System.out.println(p2.name);
        System.out.println(p2.lastName);
        System.out.println(p2.age);

        Math math = new Math();
        System.out.println(math.sum(5));
    }

}
