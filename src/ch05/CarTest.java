package ch05;

public class CarTest {
    public static void main(String[] args) {
        ElecticCar myElCar = new ElecticCar();
        myElCar.charger();
        myElCar.move();
        myElCar.openDoor();

        GasCar myGasCar = new GasCar();
        myGasCar.fillUp();
        myGasCar.move();
        myGasCar.openDoor();

        HydrogenCar myHdgCar = new HydrogenCar();
        myHdgCar.fillHydrogen();
        myHdgCar.move();
        myHdgCar.openDoor();

        Car myHdgCar1 = new HydrogenCar();
        myHdgCar1.openDoor();
        myHdgCar1.move();
//        myHdgCar1.fillHydrogen();

    }
}
