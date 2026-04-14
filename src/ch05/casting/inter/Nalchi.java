package ch05.casting.inter;

public class Nalchi implements Animal, Swimable, Fly {

    @Override
    public void sound() {
        System.out.println("날치가 소리를 냅니다.");
    }

    @Override
    public void move() {
        System.out.println("날치가 움직입니다.");
    }

    @Override
    public void fly() {
        System.out.println("날치가 하늘로 점프합니다.");
    }

    @Override
    public void swiming() {
        System.out.println("날치가 바다에서 수영을 합니다.");
    }
}
