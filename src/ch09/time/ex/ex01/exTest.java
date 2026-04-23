package ch09.time.ex.ex01;

import java.time.LocalDate;

public class exTest {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();

        System.out.println(localDate.isLeapYear());

    }
}
