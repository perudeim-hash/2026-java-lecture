package ch06.car01;

public class Driver {
    private Sonata sonata;
    private Sorento sorento;

    public void setSorento(Sorento sorento) {
        this.sorento = sorento;
    }

    public void setSonata(Sonata sonata) {
        this.sonata = sonata;
    }

    public void drive() {
        if (sonata != null) {
            System.out.println("운전을 시작 합니다.");
            sonata.startEngine();
            sonata.pressAccelerator();
            sonata.offEngine();
            System.out.println("운전을 종료합니다.");
        } else if (sorento != null) {
            System.out.println("운전을 시작 합니다.");
            sorento.startEngine();
            sorento.pressAccelerator();
            sorento.offEngine();
            System.out.println("운전을 종료합니다.");
        }else {
            System.out.println("잘못된 차 입니다.");
        }

    }



}
