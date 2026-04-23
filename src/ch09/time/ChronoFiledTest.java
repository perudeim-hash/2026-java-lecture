package ch09.time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class ChronoFiledTest {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Year : " + localDateTime.get(ChronoField.YEAR));
        System.out.println("Year : " + localDateTime.get(ChronoField.MONTH_OF_YEAR));
        int year = localDateTime.get(ChronoField.YEAR);
        int month = localDateTime.get(ChronoField.MONTH_OF_YEAR);
        int day = localDateTime.get(ChronoField.DAY_OF_MONTH);
        int hour = localDateTime.get(ChronoField.HOUR_OF_DAY);
        int minute = localDateTime.get(ChronoField.MINUTE_OF_HOUR);
        int second = localDateTime.get(ChronoField.SECOND_OF_MINUTE);
        System.out.println(year + " : " + month + " : " + day+ " : " +hour+ " : " +minute+ " : " +second);

        System.out.println(localDateTime.getYear()+ " : " +localDateTime.getMonthValue()+ " : " + localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfWeek().getValue()); // DAY를 기준으로 자바는 일요일부터 1,2,3,4,5,6,7  / JS는 일요일부터 0,1,2,3,4,5,6

    }
}
