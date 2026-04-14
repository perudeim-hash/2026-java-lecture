package ch05.casting.inter;

public class Fish implements Swimable, Animal {

    @Override
    public void sound() {
        System.out.println("물고기가 소리를 냅니다.");
    }

    @Override
    public void move() {
        System.out.println("물고기가 팔딱팔딱 거립니다.");
    }

    @Override
    public void swiming() {
        System.out.println("물고기가 헤엄을 칩니다.");
    }
}
