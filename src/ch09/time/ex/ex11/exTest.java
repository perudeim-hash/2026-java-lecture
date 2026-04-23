package ch09.time.ex.ex11;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class exTest {
    public static void main(String[] args) {


        LocalDate start = LocalDate.of(2025, 11, 18);
        LocalDate end = LocalDate.of(2026, 8, 7);

        Period period = Period.between(start, end);
        System.out.println(period.getYears()+"년 "+ period.getMonths() + "개월 " + period.getDays() + "일");

        System.out.println("총" + ChronoUnit.DAYS.between(start, end) + "일");
        System.out.println("총" + ChronoUnit.MONTHS.between(start, end) + "개월");
        System.out.println("총" + ChronoUnit.WEEKS.between(start, end) + "주");


    }
}
