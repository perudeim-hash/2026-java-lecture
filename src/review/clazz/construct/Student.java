package review.clazz.construct;

public class Student {
    String name;
    int age;
    int grade;

    // 생성자 overload
    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student( String name,int age) {

        this.name = name;
        this.age = age;
        System.out.println("new를 통해 생성됨");
    }

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
