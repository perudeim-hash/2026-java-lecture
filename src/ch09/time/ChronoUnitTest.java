package ch09.time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest {
    public static void main(String[] args) {

//        ChronoUnit(시간 차이 계산)   ChronoField(값을 끄집어낼때)
        ChronoUnit[] values = ChronoUnit.values();
        for (ChronoUnit value : values) {
            System.out.println("value = " + value);
        }
        System.out.println("=============================");
        System.out.println("Hours = " + ChronoUnit.HOURS);
        System.out.println(ChronoUnit.HOURS.getDuration().getSeconds());
        // 차이 구하기
        LocalTime localTime01 = LocalTime.of(15, 10, 0);
        LocalTime localTime02 = LocalTime.of(15, 20, 0);
        long secondBetween = ChronoUnit.SECONDS.between(localTime01, localTime02);
        System.out.println("minuteBetween = " + secondBetween);
        long minuteBetween = ChronoUnit.MINUTES.between(localTime01, localTime02);
        System.out.println("minuteBetween = " + minuteBetween );
        LocalDate now = LocalDate.now();
        LocalDate xmas = LocalDate.of(2026, 12, 25);
        System.out.println("크리스마스 까지 남은 일수는 : " + ChronoUnit.DAYS.between(now,xmas) + "일 남았습니다.");
        // 위와 아래의 차이는 위에는 DAYS만 반환이 가능하지만 아래는 개월 / 일 까지 나눠서 출력이 가능하다.
        Period period = Period.between(now, xmas);
        System.out.println("크리스마스 까지 남은 일수는 : " + period.getMonths() + "개월 " + period.getDays() + "일 남았습니다.");


    }
}
