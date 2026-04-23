package ch09.time.ex.ex04;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class exTest {
    public static void main(String[] args) {
//
        LocalDate now = LocalDate.now();
        LocalDate xmas = LocalDate.of(2026, 12, 25);
        long sss = now.getDayOfMonth();
        long ddd = xmas.getDayOfMonth();
        long mons = ChronoUnit.MONTHS.between(now, xmas);
        System.out.println(mons + "개월" + (ddd -sss)  + "일");

    }
}
