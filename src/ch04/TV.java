package ch04;

public class TV {
    int size;
    int pixel;
    String brand;
    int volumn;
//    function 정의 -> method


//    function 정의 -> method
    void turnOn(){
        System.out.println("전원 들어옵니다.");
    }

    void showInfo() {
        System.out.println("브랜드 = " + brand + " / 사이즈 " + size + " / 픽셀 " + pixel + " / 현재 볼륨은 " + volumn);
    }

    void turnOff(){
        System.out.println("TV를 끕니다.");
    }

    void volumnUp() {
        if (volumn >= 50) {
            System.out.println("볼륨이 너무 큽니다.");
        } else {
            volumn = volumn + 10;
            System.out.println("현재 볼륨은 : " + volumn);

        }

    }
    void volumnDown() {
        if (volumn > 0) {

            volumn =  volumn - 10;
            System.out.println("현재 볼륨은 : " + volumn);
        }


    }

}
