package ch09.time.ex.ex12;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class exTest {
    public static void main(String[] args) {

        LocalDateTime start = LocalDateTime.of(1,1,1,22,30);
        LocalDateTime end = LocalDateTime.of(1,1,2,6,11);

        Duration ckdl= Duration.between(start, end);

        System.out.println("총 근무 시간 : " + ckdl.toHours() + "시간 " + ckdl.toMinutes()% 60+ "분");
    }
}
