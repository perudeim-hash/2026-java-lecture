package review.access;

// 접근제어자 access modifier
public class Speaker {
    // private < default < protected < public
    private int volume;

    public Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("볼륨을 더 이상 높일 수 없습니다.");
        } else {
            volume += 10;
            System.out.println("볼륨이 10 증가합니다.");
        }
    }

    void volumeDown() {
        volume -= 10;
        System.out.println("볼륨을 10 줄입니다.");

    }

    void showVolume() {
        System.out.println("현재 볼륨은 : " + volume);

    }
}
