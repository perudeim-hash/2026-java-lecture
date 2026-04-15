package ch06.car02;

public class Driver {
    private Car car;
    public void setCar(Car car) {
        System.out.println("자동차를 설정 합니다.");
        this.car = car;
    }

    public void drive() {
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();

    }



}
