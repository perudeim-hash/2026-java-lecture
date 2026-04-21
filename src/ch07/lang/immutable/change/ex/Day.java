package ch07.lang.immutable.change.ex;


import java.time.DayOfWeek;
import java.time.Month;
import java.time.Year;

public class Day {

    private final int year;
    private final int month;
    private final int day;

    public Day(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public Day withYear(int newYear) {
        return new Day(newYear, month, day);
    }
    public Day withMonth(int newMonth) {
        return new Day(year, newMonth, day);
    }
    public Day withDay(int newDay) {
        return new Day(year, month, newDay);
    }



    public Day ChangeDay(int year, int month, int day) {
        int changeYear = year;
        int changeMonth = month;
        int changeDay = day;
        return new Day(changeYear, changeMonth, changeDay);
    }

    @Override
    public String toString() {
        return year + "년 " + month + "월 " + day + "일";
    }
}
