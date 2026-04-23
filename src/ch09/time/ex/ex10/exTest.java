package ch09.time.ex.ex10;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class exTest {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        LocalDate xmas = LocalDate.of(2026, 05, 23);
        long ckdl = ChronoUnit.DAYS.between(now, xmas);

//        if (ckdl > 0) {
//            System.out.println("D-" + ckdl);
//        } else if (ckdl == 0) {
//            System.out.println("D-Day");
//        } else if (ckdl < 0){
//            System.out.println("D+" + Math.abs(ckdl));
//        }

        if (xmas.isAfter(now)) {
            System.out.println("D-" + ckdl);
        } else if (xmas.isEqual(now)) {
            System.out.println("D-Day");
        } else if (xmas.isBefore(now)){
            System.out.println("D+" + Math.abs(ckdl));
        }
    }
}
