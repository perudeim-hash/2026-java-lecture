package ch05.casting.inter;

public class Chicken implements Animal , Fly{
    String value = "Chicken";

    public void sound() {
        System.out.println("꼬꼬댁");

    }
    @Override
    public  void move() {
        System.out.println("닭이 2발로 걸어갑니다.");
    }

    @Override
    public void fly() {
        System.out.println("닭이 비행을 할까요?");
    }
}

