package ch05.Answer.Answer2;

public class Car extends Vehicle{
    int nowSpeed = 0;
    @Override
    void accelerate() {
        brand = "K5";
        speed =  20;

        nowSpeed = nowSpeed  +speed;
        System.out.println(brand + "의 속도가 " + speed+ "만큼 증가합니다." );
        System.out.println("현재 속도는 : " + nowSpeed);
    }



}
