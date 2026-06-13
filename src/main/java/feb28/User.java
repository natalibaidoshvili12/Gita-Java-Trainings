package feb28;

import java.util.HashMap;
import java.util.Map;

public class User {

    private String username;
    private String password;
    private int age;
    private UserChildClass userChildClass;
    private Map<String, String> s;

    public User() {
        s = new HashMap<String,String>();
    }

    public User(String username, String password, int age) {
        this.username = username;
        this.password = password;
        this.age = age;
        s = new HashMap<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Map<String, String> getS() {
        return s;
    }

    public void putValuesToMap(String key, String value) {
        s.put(key, value);
    }

    public UserChildClass getUserChildClass() {
        return userChildClass;
    }

    public void setUserChildClass(UserChildClass userChildClass) {
        this.userChildClass = userChildClass;
    }

    public void setS(Map<String, String> s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", userChildClass=" + userChildClass +
                ", s=" + s +
                '}';
    }
}
