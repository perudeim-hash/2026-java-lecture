package ch05;

public class ElecticCar extends  Car {
    /**
     * Override ->
     * 1.부모와 자식간의 타입이 같아아햔다
     * 2.부모와 자식간의 이름이 같아야한다.
     * 3. 매개변수의 타입 , 갯수 , 순서가 같아야 한다.
     */
    @Override
    void move() {
        System.out.println("전기차가 빠르게 움직입니다.");
    }

    @Override
    void openDoor() {
        System.out.println("전기차의 문이 자동으로 열립니다.");

    }

    void charger() {
        System.out.println("전기를 충전합니다.");
    }

}
