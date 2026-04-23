package ch09.time;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateTest {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        System.out.println("nowDate = " + nowDate);
        LocalDate ofDate = LocalDate.of(2026, 12, 25);  // Now -> 날짜 지정 불가(오늘 날짜만 가능) Of -> 임의 날짜 지정 가능
        System.out.println("크리스마스 = " + ofDate);
        LocalDate plus10Days = nowDate.plusDays(+10);
        System.out.println("plus10Days = " + plus10Days);
        LocalDate ofDatePlus10Days = ofDate.plusDays(10);
        System.out.println("ofDatePlus10Days = " + ofDatePlus10Days);


    }
}
