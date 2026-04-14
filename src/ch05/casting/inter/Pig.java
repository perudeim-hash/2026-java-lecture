package ch05.casting.inter;

public class Pig implements Animal {
    public  void sound() {
        System.out.println("꿀꿀");
    }

    @Override
    public  void move() {
        System.out.println("돼지가 4발로 걸어갑니다.");
    }



}
