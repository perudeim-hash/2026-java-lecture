package ch05.car02;

public class Sorrento implements Car {
    @Override
    public void engineOn() {
        System.out.println("소렌토 엔진을 켭니다.");
    }

    @Override
    public void engineOff() {
        System.out.println("소렌토 엔진을 끕니다.");
    }

    @Override
    public void accelerate() {
        System.out.println("소렌토의 속도가 올라갑니다.");
    }
}
