package ch08.enumeration.answer.ex01;

public class DayTest {
    public static void main(String[] args) {
        Day today = Day.FRIDAY;
        if (today == Day.FRIDAY) {
            System.out.println("오늘은 금요일 입니다.");
        }else {
            System.out.println("ㄲㅂ");
        }

        String today02 = "FRIDAY";
        Day day02 = Day.valueOf(today02); // valueOf -> String를 Day(Enum)객체로 형변환시킨다.
        if (day02 == Day.FRIDAY) {
            System.out.println("오늘은 금요일 입니다.");
        }else {
            System.out.println("ㄲㅂ");
        }

    }
}
