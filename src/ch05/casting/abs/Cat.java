package ch05.casting.abs;

public class Cat extends Animal {
    String value = "Cat";

    void sound() {
        System.out.println("야옹");

    }
    @Override
    void move() {
        System.out.println("고양이가 4발로 걸어갑니다.");
    }
}
