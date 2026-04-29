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
        int result = this.id.compareTo(o.id);
        if (result == 0) {
            return Integer.compare(o.age, this.age); // 지금은 내림차순
//            return Integer.compare(this.age, o.age ); 이건 오름차순 
        }
        return result;

//    return this.age < o.age ? -1 : (this.age == o.age ? 0 : 1);

//    if (this.age < o.age) {
//                return -1;
//            } else if (this.age > o.age) {
//                return 1;
//            } else {
//                return 0;
//            }
    }

}
