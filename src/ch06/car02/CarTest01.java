package ch06.car02;

public class CarTest01 {
    public static void main(String[] args) {
        Driver driver = new Driver();
        Car sonata = new Sonata();
//        driver.setCar(sonata);
//        driver.drive();
        Car sorento = new Sorento();
//        driver.setCar(sonata);
//        driver.drive();
        Car genesis = new Genesis();
//        driver.setCar(genesis);
//        driver.drive();

        Car[] cars = {sonata, sorento, genesis};
        for (Car car : cars) {
            driver.setCar(car);
            driver.drive();

        }
    }
}
