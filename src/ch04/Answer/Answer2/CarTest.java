package ch04.Answer.Answer2;

public class CarTest {
    public static void main(String[] args) {

        Car myCar = new Car("KIA", 0);
        for (int i = 0; i < 5; i++) {

            myCar.accelerate();

        }
        myCar.gamsock();


        System.out.println("브랜드는 : " + myCar.brand + " / 현재 속도 : " + myCar.speed);

    }

}
