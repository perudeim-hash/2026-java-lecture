package ch05.casting.inter;

public class Bird implements Animal, Fly {
    @Override
    public void move() {
        System.out.println("새가 걸어 다닙니다.");
        
    }

    @Override
    public void sound() {
        System.out.println("쨱 짹");
    }

    public void fly() {
        System.out.println("새가 날아 다닙니다.");
    }
}
