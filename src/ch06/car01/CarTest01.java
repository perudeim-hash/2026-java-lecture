package ch06.car01;

public class CarTest01 {
    public static void main(String[] args) {
        Driver driver = new Driver();
        Sonata sonata = new Sonata();
        driver.setSonata(sonata);
        driver.drive();

        Driver driver1 = new Driver();
        Sorento sorento = new Sorento();
        driver1.setSorento(sorento);
        driver1.drive();


    }
}
