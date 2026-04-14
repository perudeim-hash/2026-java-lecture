package ch05.casting.abs;

public class Chicken extends Animal {
    String value = "Chicken";

    void sound() {
        System.out.println("꼬꼬댁");

    }
    @Override
    void move() {
        System.out.println("닭이 2발로 걸어갑니다.");
    }
}
