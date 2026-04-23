package ch09.time;

import java.time.Duration;
import java.time.LocalTime;

public class DurationTest {
    public static void main(String[] args) {

        Duration duration = Duration.ofMinutes(30);
        System.out.println("duration = " + duration);
        LocalTime localTime = LocalTime.of(14, 0);
        System.out.println("기준 시간 = " + localTime);

        LocalTime plusTime = localTime.plus(duration);
        System.out.println("30분 뒤는? = " + plusTime);

        //시간 차이
        LocalTime startTime = LocalTime.now();
        LocalTime endTime = LocalTime.of(18, 0);
        Duration between = Duration.between(startTime, endTime);
        System.out.println("퇴근까지 남은 시간은? " + between.toHours() + "시간 " + (between.toMinutes()%60) + "분 " + (between.getSeconds() %60) +  "초 남았다.");

    }
}
