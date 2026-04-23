package ch09.time.ex.ex03;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class exTest {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2026, 10, 25);
        System.out.println(localDate + "는 올해의 " +localDate.getDayOfYear() + "번째 날입니다.");
        


    }
}
