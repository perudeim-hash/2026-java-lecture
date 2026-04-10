package ch04.Answer.Answer6;

public class TV {
    String brand;
    int size;
    int volume;


    public TV(String brand, int size, int volume) {
        this.brand = brand;
        this.size = size;
        this.volume = volume;
    }


    void turnOn() {
        System.out.println("전원을 킵니다.");
    }

    void turnOff() {
        System.out.println("전원을 끕니다.");
    }

    void volumeUp() {
        if (volume >= 0  && volume < 100) {
            volume++;
            System.out.println("현재 소리는 : " + volume);
        } else {
            System.out.println("볼륨이 더 올릴 수 없습니다.");

        }
    }

    void volumeDown() {
        if (volume <= 100 && volume > 0) {
            volume--;
            System.out.println("현재 소리는 : " + volume);
        } else {
            System.out.println("볼륨을 더 줄일 수 없습니다.");

        }
    }


}
