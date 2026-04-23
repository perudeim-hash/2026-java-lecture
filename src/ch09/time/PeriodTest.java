package ch09.time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public class PeriodTest {
    public static void main(String[] args) {
        // Period 년원일
        // Duration 시분초
        Period period = Period.ofDays(10);
        System.out.println("period = " + period);
//      계산에 사용한다.
        LocalDate currentDate = LocalDate.of(2030, 1, 1);
        LocalDate plusDate = currentDate.plus(period);
        System.out.println("현재 날짜 : " + currentDate);
        System.out.println("10일을 더한 날짜 : " + plusDate);

        LocalDate startDate = LocalDate.of(2026, 04, 23);
        LocalDate Xmas = LocalDate.of(2026, 12, 25);
        Period between = Period.between(startDate, Xmas);

        System.out.println("현재 날짜로부터 크리스마스까지는 = " + between.getMonths() + "월 " + between.getDays() + "일 남았습니다.");
//        Duration duration = Duration.of(period);
        }
}
