package ch05.car01;

public class CarMain01 {
    public static void main(String[] args) {
        Driver driver = new Driver();
        Sonata sonata = new Sonata();
        driver.setSonataCar(sonata);
        driver.drive();

        Driver driver1 = new Driver();
        K5 k5 = new K5();
        driver1.setK5(k5);
        driver1.drive();

    }

}
