package ch09.time.ex.ex05;

import java.time.Duration;
import java.time.LocalTime;

public class exTest {
    public static void main(String[] args) {
        LocalTime start = LocalTime.of(9, 10);
        LocalTime end = LocalTime.of(18, 45);

        Duration duration = Duration.between(start, end);
        System.out.println("총 근무시간은 : " + (duration.toHours()-1) + "시간" + duration.toMinutes() %60+"분");

    }
}
