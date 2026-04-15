package ch06.car02;

public class Sonata implements Car {
    public void startEngine() {
        System.out.println("소나타의 엔진을 켭니다.");
    }

    public void offEngine() {
        System.out.println("소나타의 엔진을 끕니다.");
    }

    public void pressAccelerator() {
        System.out.println("소나타의 엑셀을 밟습니다.");
    }


}
