package ch07.lang.immutable.change.ex;

public class DayTest {
    public static void main(String[] args) {
        Day day = new Day(2026, 04, 20);
        System.out.println(day.getYear() + "년 " + day.getMonth() + "월 " + day.getDay() + "일");

        Day changeDay = day.ChangeDay(2026, 03, 12);
        System.out.print(changeDay.getYear() + "년 ");
        System.out.print(changeDay.getMonth()+ "월 ");
        System.out.print(changeDay.getDay()+ "일");
        System.out.println();
        System.out.println(changeDay.toString());

        Day change2Year = day.withYear(2027);
        System.out.println(change2Year);
        Day change2Month = day.withMonth(06);
        System.out.println(change2Month);
        Day change2Day = day.withDay(22);
        System.out.println(change2Day);



    }
}
