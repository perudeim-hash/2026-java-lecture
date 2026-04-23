package ch09.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest {
    public static void main(String[] args) {
        LocalDateTime nowDt = LocalDateTime.now();

        System.out.println("nowDt = " + nowDt);
        LocalDateTime ofDt = LocalDateTime.of(2026, 4, 23, 12, 12, 0);


        System.out.println("ofDt = " + ofDt);
        LocalDate localDate = ofDt.toLocalDate();
        System.out.println("localDate = " + localDate);

        LocalTime localTime = ofDt.toLocalTime();
        System.out.println("localTime = " + localTime);

        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("localDateTime = " + localDateTime);

        System.out.println(nowDt.isAfter(ofDt));       // << 왼쪽이 isAfter() 안의 날짜보다 이후이면 true
        System.out.println(nowDt.isBefore(ofDt));       // << 왼쪽이 isAfter() 안의 날짜보다 이전이면 true
        System.out.println(nowDt.isEqual(ofDt));       // << 왼쪽이 isAfter() 안의 날짜랑 같으면 true

        LocalDate now = LocalDate.now();
        LocalDate now02 = ofDt.toLocalDate();

        System.out.println(now.isEqual(now02)); // 둘의 date를 비교하는 경우 isEqual로

    }
}
