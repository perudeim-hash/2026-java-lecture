package ch05.car02;

public class Sonata implements Car {
    public void engineOn() {
        System.out.println("소나타 엔진을 켭니다.");
    }

    public void engineOff() {
        System.out.println("소나타 엔진을 끕니다.");
    }

    public void accelerate() {
        System.out.println("속도를 높입니다.");
    }

}
