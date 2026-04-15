package ch05.car01;

public class Driver {
    private Sonata sonata;

    private K5 k5;

    public void setSonataCar(Sonata sonata) {
        this.sonata = sonata;
    }

    public void setK5(K5 k5) {
        this.k5 = k5;
    }

    public void drive() {
        System.out.println("운전을 시작합니다.");
        if (sonata != null) {
            sonata.engineOn();
            sonata.accelerate();
            sonata.engineOff();
        } else if (k5 != null) {
            k5.engineOn();
            k5.accelerate();
            k5.engineOff();

        }
    }


}
