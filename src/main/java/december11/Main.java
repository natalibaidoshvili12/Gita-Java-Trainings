package december11;

public class Main {

    public static void main(String[] args) {
//        Person p = new Person("Natali", "Baidoshvili", 24);
//        Baby b = new Baby("Baby", "BabyLastName", 1);
//        p.eat();
//        p.speak();
//        b.eat();
//        b.speak();
//        b.cry();

        Bird b1 = new Bird();
        b1.name = "Chico";
        b1.fly();
        Mammal m1 = new Mammal();
        m1.name = "Riko";
        m1.eat();

        b1.getName();
        m1.getName();

        b1.makeSound();
        m1.makeSound();
    }

}
