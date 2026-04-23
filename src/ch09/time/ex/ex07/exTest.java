package ch09.time.ex.ex07;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class exTest {
    public static void main(String[] args) {


        LocalDate mon1 = LocalDate.of(2026, 1, 31);
        LocalDate mon2 = LocalDate.of(2026, 3, 31);
        LocalDate mon3 = LocalDate.of(2024, 1, 31);


        System.out.println(mon1.plusMonths(1));
        System.out.println(mon2.plusMonths(1));
        System.out.println(mon3.plusMonths(1));

    }
}
