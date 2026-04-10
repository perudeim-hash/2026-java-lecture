package ch04;

public class TvTest {
    public static void main(String[] args) {

        TV myTv = new TV();
        myTv.turnOn();
        myTv.brand = "삼성";
        myTv.pixel = 120;
        myTv.size = 60;
        for (int i = 0; i < 8; i++) {
            myTv.volumnUp();
        }
        for (int i = 0; i < 4; i++) {
            myTv.volumnDown();
        }


        myTv.showInfo();
        myTv.turnOff();

        System.out.println("========================================");

        TV yourTv = new TV();
        yourTv.turnOn();
        yourTv.brand = "LG";
        yourTv.pixel = 120;
        yourTv.size = 70;
        yourTv.showInfo();
        yourTv.turnOff();






    }
}
