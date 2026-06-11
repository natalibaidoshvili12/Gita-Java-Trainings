package june6;

public class Singleton {

    private static Singleton instance;

    public String s;

    private Singleton() {
        s = "This is singleton class";
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
