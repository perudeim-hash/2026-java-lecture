package ch09.time.ex.ex02;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class exTest {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.of(2026, 12, 31);
        System.out.println("오늘 날짜 : " + localDate);
        System.out.println("올해 마지막 날 : " + localDate1);
        
        System.out.println("올해 남은 일수 : " + ChronoUnit.DAYS.between(localDate, localDate1));




    }
}
