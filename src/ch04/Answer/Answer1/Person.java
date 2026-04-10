package ch04.Answer.Answer1;

public class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showInfo(){
        System.out.println("이름은 : " + name + " / 나이는 : " + age);
    }
}
