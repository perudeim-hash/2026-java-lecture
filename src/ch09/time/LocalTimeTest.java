package ch09.time;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalTimeTest {
    public static void main(String[] args) {

        LocalTime nowTime = LocalTime.now();
        System.out.println("현재시간 = " + nowTime);

        LocalTime ofTime = LocalTime.of(12, 10, 15);
        System.out.println("지정 시간 = " + ofTime);

        LocalTime plusHours = nowTime.plusHours(3);
        System.out.println("plusHours = " + plusHours);

        LocalTime minusHours = nowTime.minusHours(3);
        System.out.println("minusHours = " + minusHours);


    }
}
