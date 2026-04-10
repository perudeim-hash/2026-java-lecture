package ch04.Answer.Answer6;

public class TVTest {
    public static void main(String[] args) {

        TV tv1 = new TV("SAMSUNG", 17, 0);
        tv1.turnOn();
        for (int i = 0; i < 103; i++) {
            tv1.volumeUp();
        }
        for (int i = 0; i < 103; i++) {
            tv1.volumeDown();
        }

        tv1.turnOff();

    }


    }