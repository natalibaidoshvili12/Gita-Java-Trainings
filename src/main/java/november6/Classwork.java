package november6;

public class Classwork {

    public static void main(String[] args) {

        Person p1 = new Person();
        Person p3 ; // p3 = null
        p1.name = "Natali";
        p1.lastName = "Baidoshvili";
        p1.age = 24;
        p1.walk();
        p1.sleep();
        p1.eat();

        Person p2 = new Person();
        p2.name = "Name1";
        p2.lastName = "Lastname1";
        p2.age = 25;
        p2.walk();
        p2.sleep();
        p2.eat();

        int i = 0;

        Math math = new Math();
        int result = math.power(2, 8);

        int sum = math.sum(2, 1, 5, 6, 4, 5, 3);
        int sum2 = math.sum(3, 2, 2);
        System.out.println(result);

    }



}
