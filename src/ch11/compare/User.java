package ch11.compare;

public class User implements Comparable<User> {
    private String id;
    private int age;

    public User(String id, int age) {
        this.id = id;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(User o) {
        return this.age < o.age ? -1 : (this.age == o.age ? 0 : 1);
    }
}
