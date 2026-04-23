package ch09.time.ex.ex09;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class exTest {
    public static void main(String[] args) {


        LocalDateTime days = LocalDateTime.of(2026, 11, 7, 16, 25, 40);
        System.out.println("연도 : " + days.getYear());
        System.out.println("월 : " + days.getMonthValue());
        System.out.println("일 : " + days.getDayOfMonth());
        System.out.println("시 : " + days.getHour());
        System.out.println("분 : " + days.getMinute());
        System.out.println("초 : " + days.getSecond());
        System.out.println("해당 달의 몇 번째 날 : " + days.getDayOfMonth());
        System.out.println("해당 주의 몇 번째 요일 : " + days.getDayOfWeek().getValue());


    }
}
