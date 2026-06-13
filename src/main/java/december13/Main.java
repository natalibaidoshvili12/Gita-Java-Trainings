package december13;

public class Main {

    public static void main(String[] args) {
        Person p = new Person("Natali Baidoshvili", 25, "F");
        p.speak();

        Person p1 = new Baby();
//        Baby b = (Baby) new Person();
//        Person p2 = (Person) new Animal();

//        if (b instanceof Person) {
//            Person p2 = (Person) b;
//        }

        Season s = Season.WINTER;
        System.out.println(s.name());
        Season[] values = Season.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i].name());
        }
    }

}
