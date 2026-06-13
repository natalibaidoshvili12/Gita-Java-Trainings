package mar7;

public class User {

    private Long id;

    private int age;

    private Status status;

    public User() {
    }

    public User(Long id, int age, Status status) {
        this.id = id;
        this.age = age;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", status=" + status +
                '}';
    }
}
