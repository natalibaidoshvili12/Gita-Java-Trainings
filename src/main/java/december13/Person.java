package december13;

public class Person implements Speakable, MakeSound {

    private String name;

    private int age;

    private String gender;

    public Person() {
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void speak() {
        System.out.println("Speaking");
    }

    @Override
    public int getSpeed() {
        return m;
    }

}
