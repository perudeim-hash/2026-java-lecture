package ch04.Answer.Answer2;

public class Car {

    String brand;
    int speed;


    public Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }


    void accelerate() {
        System.out.println("SpeedUp");
        speed = speed + 10;
    }


}
