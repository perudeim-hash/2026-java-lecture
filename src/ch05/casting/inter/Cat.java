package ch05.casting.inter;

public class Cat implements Animal {
    String value = "Cat";

    public void sound() {
        System.out.println("야옹");

    }
    @Override
    public void move() {
        System.out.println("고양이가 4발로 걸어갑니다.");
    }
}
