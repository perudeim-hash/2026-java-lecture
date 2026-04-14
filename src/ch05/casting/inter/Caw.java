package ch05.casting.inter;

public class Caw implements Animal {
    String value = "Caw";

    public void sound() {
        System.out.println("음메");
    }

    @Override
    public void move() {
        System.out.println("소가 4발로 걸어갑니다.");
    }
}