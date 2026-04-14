package ch05.casting.abs;

public class Caw extends Animal {
    String value = "Caw";

    void sound() {
        System.out.println("음메");
    }

    @Override
    void move() {
        System.out.println("소가 4발로 걸어갑니다.");
    }
}