package ch05.inherit;

public class Person {
    void qw() {
        speak();
        sleep();
        eat();
        walk();
    }
    void speak() {
        System.out.println("말을 합니다.");
    }

    void sleep() {
        System.out.println("잠 자기");

    }

    void eat() {
        System.out.println("밥 먹기");

    }

    void walk() {
        System.out.println("길을 걷습니다.");
    }
}
