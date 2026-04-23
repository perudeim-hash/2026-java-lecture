package ch09.time.ex.ex06;

import java.time.LocalDateTime;

public class exTest {
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.of(2026, 05, 10, 14, 30);
        System.out.println("회의 시작 시간은? : "+ time);
        System.out.println("회의 시작 시간 90분 전? : " +time.minusMinutes(90));
    }
}
